<tr class="noCover">
<td class="line"><a name='1'/>1</td>
<td class="hits"/>
<td class="code">package&nbsp;es.iam.check.analisisDespliegues.business.chequeos;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='2'/>2</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='3'/>3</td>
<td class="hits"/>
<td class="code">import&nbsp;java.util.Collection;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='4'/>4</td>
<td class="hits"/>
<td class="code">import&nbsp;java.util.HashSet;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='5'/>5</td>
<td class="hits"/>
<td class="code">import&nbsp;es.iam.check.analisisDespliegues.business.chequeos.incidencias.IncidenciaChequeo;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='6'/>6</td>
<td class="hits"/>
<td class="code">import&nbsp;es.iam.check.analisisDespliegues.business.chequeos.reglas.IRegla;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='7'/>7</td>
<td class="hits"/>
<td class="code">import&nbsp;es.iam.check.analisisDespliegues.business.ficheros.Fichero;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='8'/>8</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='9'/>9</td>
<td class="hits"/>
<td class="code">/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='10'/>10</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;Clase&nbsp;base&nbsp;con&nbsp;las&nbsp;funcionalidades&nbsp;comunes&nbsp;a&nbsp;todos&nbsp;los&nbsp;tipos&nbsp;de&nbsp;Chequeos&nbsp;contemplados.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='11'/>11</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;@author&nbsp;SSA005</td>
</tr>
<tr class="noCover">
<td class="line"><a name='12'/>12</td>
<td class="hits"/>
<td class="code">&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='13'/>13</td>
<td class="hits"/>
<td class="code">public&nbsp;abstract&nbsp;class&nbsp;AbstractChequeo&nbsp;implements&nbsp;IChequeo{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='14'/>14</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='15'/>15</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='16'/>16</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Nombre&nbsp;del&nbsp;chequeo.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='17'/>17</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='18'/>18</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;String&nbsp;nombre;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='19'/>19</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='20'/>20</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='21'/>21</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;la&nbsp;descripcion&nbsp;del&nbsp;chequeo.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='22'/>22</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='23'/>23</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;String&nbsp;descripcion;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='24'/>24</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='25'/>25</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='26'/>26</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;la&nbsp;valoracion&nbsp;del&nbsp;resultado&nbsp;del&nbsp;chequeo.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='27'/>27</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='28'/>28</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;Valoracion&nbsp;valoracion;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='29'/>29</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='30'/>30</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='31'/>31</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;El&nbsp;mensaje&nbsp;a&nbsp;mostrar&nbsp;cuando&nbsp;el&nbsp;chequeo&nbsp;es&nbsp;incorrecto.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='32'/>32</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='33'/>33</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;String&nbsp;mensajeIncorrecto;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='34'/>34</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='35'/>35</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='36'/>36</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;El&nbsp;mensaje&nbsp;a&nbsp;mostrar&nbsp;cuando&nbsp;el&nbsp;chequeo&nbsp;es&nbsp;correcto.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='37'/>37</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='38'/>38</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;String&nbsp;mensajeCorrecto;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='39'/>39</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='40'/>40</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='41'/>41</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;El&nbsp;mensaje&nbsp;a&nbsp;mostrar&nbsp;de&nbsp;aviso.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='42'/>42</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='43'/>43</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;String&nbsp;mensajeAviso;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='44'/>44</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='45'/>45</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='46'/>46</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Las&nbsp;reglas&nbsp;de&nbsp;las&nbsp;que&nbsp;se&nbsp;compone&nbsp;el&nbsp;chequeo.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='47'/>47</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='48'/>48</td>
<td class="hits">4713</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;Collection&lt;IRegla&gt;&nbsp;reglas&nbsp;=&nbsp;new&nbsp;HashSet&lt;IRegla&gt;();</td>
</tr>
<tr class="noCover">
<td class="line"><a name='49'/>49</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='50'/>50</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='51'/>51</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='52'/>52</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Las&nbsp;incidencias&nbsp;que&nbsp;ha&nbsp;encontrado&nbsp;el&nbsp;chequeo.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='53'/>53</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='54'/>54</td>
<td class="hits">4713</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;Collection&lt;IncidenciaChequeo&gt;&nbsp;incidenciasChequeo&nbsp;=&nbsp;new&nbsp;HashSet&lt;IncidenciaChequeo&gt;();</td>
</tr>
<tr class="noCover">
<td class="line"><a name='55'/>55</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='56'/>56</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='57'/>57</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Reglas&nbsp;adicionales&nbsp;que&nbsp;se&nbsp;han&nbsp;de&nbsp;cumplir&nbsp;previas&nbsp;a&nbsp;que&nbsp;se&nbsp;compruebe&nbsp;las&nbsp;reglas&nbsp;de&nbsp;negocio&nbsp;del&nbsp;chequeo.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='58'/>58</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='59'/>59</td>
<td class="hits">4713</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;Collection&lt;IRegla&gt;&nbsp;reglasPrevia&nbsp;=&nbsp;new&nbsp;HashSet&lt;IRegla&gt;();</td>
</tr>
<tr class="noCover">
<td class="line"><a name='60'/>60</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='61'/>61</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='62'/>62</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='63'/>63</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Constructor&nbsp;de&nbsp;la&nbsp;clase&nbsp;abstracta.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='64'/>64</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;nombre&nbsp;nombre&nbsp;del&nbsp;chequeo.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='65'/>65</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;descripcion&nbsp;descripcion&nbsp;del&nbsp;chequeo.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='66'/>66</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;mensajeIncorrecto&nbsp;:&nbsp;mensaje&nbsp;que&nbsp;notifica&nbsp;que&nbsp;el&nbsp;chequeo&nbsp;ha&nbsp;sido&nbsp;valorado&nbsp;como&nbsp;incorrecto</td>
</tr>
<tr class="noCover">
<td class="line"><a name='67'/>67</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;mensajeCorrecto&nbsp;:&nbsp;mensaje&nbsp;que&nbsp;notifica&nbsp;que&nbsp;el&nbsp;chequeo&nbsp;ha&nbsp;sido&nbsp;valorado&nbsp;como&nbsp;correcto</td>
</tr>
<tr class="noCover">
<td class="line"><a name='68'/>68</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;mensajeAviso&nbsp;:&nbsp;mensaje&nbsp;que&nbsp;notifica&nbsp;que&nbsp;el&nbsp;chequeo&nbsp;ha&nbsp;sido&nbsp;valorado&nbsp;con&nbsp;una&nbsp;advertencia&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='69'/>69</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='70'/>70</td>
<td class="hits">4713</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;AbstractChequeo(String&nbsp;nombre,&nbsp;String&nbsp;descripcion,&nbsp;String&nbsp;mensajeIncorrecto,&nbsp;String&nbsp;mensajeCorrecto,&nbsp;String&nbsp;mensajeAviso){</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='71'/>71</td>
<td class="hits">4713</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.nombre&nbsp;=&nbsp;nombre;</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='72'/>72</td>
<td class="hits">4713</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.descripcion&nbsp;=&nbsp;descripcion;</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='73'/>73</td>
<td class="hits">4713</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.mensajeIncorrecto&nbsp;=&nbsp;mensajeIncorrecto;</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='74'/>74</td>
<td class="hits">4713</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.mensajeCorrecto&nbsp;=&nbsp;mensajeCorrecto;</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='75'/>75</td>
<td class="hits">4713</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.mensajeAviso&nbsp;=&nbsp;mensajeAviso;</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='76'/>76</td>
<td class="hits">4713</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='77'/>77</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='78'/>78</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='79'/>79</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**&nbsp;{@inheritDoc}&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='80'/>80</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;agregarRegla(IRegla&nbsp;regla){</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='81'/>81</td>
<td class="hits">82218</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;reglas.add(regla);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='82'/>82</td>
<td class="hits">82218</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='83'/>83</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='84'/>84</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**&nbsp;{@inheritDoc}&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='85'/>85</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;agregarReglaPrevia(IRegla&nbsp;reglaPrevia)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='86'/>86</td>
<td class="hits">705</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;reglasPrevia.add(reglaPrevia);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='87'/>87</td>
<td class="hits">705</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='88'/>88</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='89'/>89</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**&nbsp;{@inheritDoc}&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='90'/>90</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;ejecutar(Collection&lt;Fichero&gt;&nbsp;contenido)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='91'/>91</td>
<td class="hits">463</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;comprobarFicheros(contenido);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='92'/>92</td>
<td class="hits">463</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;valorar();</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='93'/>93</td>
<td class="hits">463</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='94'/>94</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='95'/>95</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='96'/>96</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**&nbsp;{@inheritDoc}&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='97'/>97</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;getMensaje(Valoracion&nbsp;valoracion)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='98'/>98</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String&nbsp;mensaje&nbsp;=&nbsp;"";</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='99'/>99</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;switch&nbsp;(valoracion)&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='100'/>100</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;case&nbsp;CORRECTO:</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='101'/>101</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mensaje&nbsp;=&nbsp;getMensajeCorrecto();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='102'/>102</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;break;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='103'/>103</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;case&nbsp;INCORRECTO:</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='104'/>104</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mensaje&nbsp;=&nbsp;getMensajeIncorrecto();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='105'/>105</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;break;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='106'/>106</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;case&nbsp;AVISO:</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='107'/>107</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mensaje&nbsp;=&nbsp;getMensajeAviso();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='108'/>108</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;break;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='109'/>109</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;default:</td>
</tr>
<tr class="noCover">
<td class="line"><a name='110'/>110</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;break;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='111'/>111</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='112'/>112</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;mensaje;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='113'/>113</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='114'/>114</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='115'/>115</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='116'/>116</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Ejecuta&nbsp;la&nbsp;logica&nbsp;del&nbsp;chequeo&nbsp;contra&nbsp;un&nbsp;fichero.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='117'/>117</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;fichero&nbsp;el&nbsp;fichero&nbsp;a&nbsp;chequear.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='118'/>118</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='119'/>119</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;protected&nbsp;void&nbsp;chequea(Fichero&nbsp;fichero){</td>
</tr>
<tr class="coverPart" title="Line 120: Conditional coverage 50% (1/2)">
<td class="line"><a name='120'/>120</td>
<td class="hits">162</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(seCumplenChequeosPrevios(fichero)){</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='121'/>121</td>
<td class="hits">162</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for&nbsp;(IRegla&nbsp;regla&nbsp;:&nbsp;getReglas())&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='122'/>122</td>
<td class="hits">162</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(regla.seCumple(fichero)){</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='123'/>123</td>
<td class="hits">18</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;registrar(regla,&nbsp;fichero);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='124'/>124</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='125'/>125</td>
<td class="hits">162</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='126'/>126</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='127'/>127</td>
<td class="hits">162</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='128'/>128</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='129'/>129</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='130'/>130</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;comprobaci��n&nbsp;sobre&nbsp;una&nbsp;serie&nbsp;de&nbsp;ficheros&nbsp;de&nbsp;los&nbsp;chequeos.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='131'/>131</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;contenido&nbsp;la&nbsp;colecci��n&nbsp;de&nbsp;ficheros&nbsp;a&nbsp;verificar.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='132'/>132</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='133'/>133</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;protected&nbsp;void&nbsp;comprobarFicheros(Collection&lt;Fichero&gt;&nbsp;contenido)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='134'/>134</td>
<td class="hits">463</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for&nbsp;(Fichero&nbsp;fichero&nbsp;:&nbsp;contenido)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='135'/>135</td>
<td class="hits">3972</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;chequea(fichero);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='136'/>136</td>
<td class="hits">3972</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='137'/>137</td>
<td class="hits">463</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='138'/>138</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='139'/>139</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='140'/>140</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Registro&nbsp;de&nbsp;incidencias&nbsp;sobre&nbsp;los&nbsp;chequeos.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='141'/>141</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;nivelIncidencia&nbsp;nivel&nbsp;de&nbsp;las&nbsp;incidencias.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='142'/>142</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;rutaAfectada&nbsp;ruta&nbsp;donde&nbsp;se&nbsp;produce&nbsp;la&nbsp;incidencia.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='143'/>143</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;comentario&nbsp;comentario&nbsp;realizado&nbsp;sobre&nbsp;la&nbsp;incidencia.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='144'/>144</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='145'/>145</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;protected&nbsp;void&nbsp;registraIncidenciaChequeo(IncidenciaChequeo.NivelIncidencia&nbsp;nivelIncidencia,&nbsp;String&nbsp;rutaAfectada,&nbsp;String&nbsp;comentario)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='146'/>146</td>
<td class="hits">189</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;getIncidenciasChequeo().add(new&nbsp;IncidenciaChequeo(nivelIncidencia,&nbsp;rutaAfectada,&nbsp;comentario));</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='147'/>147</td>
<td class="hits">189</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='148'/>148</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='149'/>149</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='150'/>150</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Metodo&nbsp;abstracto&nbsp;que&nbsp;registra&nbsp;una&nbsp;regla&nbsp;a&nbsp;aplicar&nbsp;a&nbsp;un&nbsp;fichero.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='151'/>151</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;regla&nbsp;regla&nbsp;a&nbsp;aplicar.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='152'/>152</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;fichero&nbsp;fichero&nbsp;sobre&nbsp;el&nbsp;que&nbsp;se&nbsp;aplicar��.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='153'/>153</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='154'/>154</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;protected&nbsp;abstract&nbsp;void&nbsp;registrar(IRegla&nbsp;regla,&nbsp;Fichero&nbsp;fichero);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='155'/>155</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='156'/>156</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='157'/>157</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;getter.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='158'/>158</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return&nbsp;the&nbsp;nombre</td>
</tr>
<tr class="noCover">
<td class="line"><a name='159'/>159</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='160'/>160</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;getNombre()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='161'/>161</td>
<td class="hits">6129</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;nombre;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='162'/>162</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='163'/>163</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='164'/>164</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='165'/>165</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;getter.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='166'/>166</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return&nbsp;the&nbsp;descripcion</td>
</tr>
<tr class="noCover">
<td class="line"><a name='167'/>167</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='168'/>168</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;getDescripcion()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='169'/>169</td>
<td class="hits">463</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;descripcion;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='170'/>170</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='171'/>171</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='172'/>172</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='173'/>173</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;getter.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='174'/>174</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return&nbsp;the&nbsp;mensajeIncorrecto</td>
</tr>
<tr class="noCover">
<td class="line"><a name='175'/>175</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='176'/>176</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;getMensajeIncorrecto()&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='177'/>177</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;mensajeIncorrecto;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='178'/>178</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='179'/>179</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='180'/>180</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='181'/>181</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;getter.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='182'/>182</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return&nbsp;the&nbsp;mensajeCorrecto</td>
</tr>
<tr class="noCover">
<td class="line"><a name='183'/>183</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='184'/>184</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;getMensajeCorrecto()&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='185'/>185</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;mensajeCorrecto;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='186'/>186</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='187'/>187</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='188'/>188</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='189'/>189</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;getter.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='190'/>190</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return&nbsp;the&nbsp;mensajeAviso</td>
</tr>
<tr class="noCover">
<td class="line"><a name='191'/>191</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='192'/>192</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;getMensajeAviso()&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='193'/>193</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;mensajeAviso;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='194'/>194</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='195'/>195</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='196'/>196</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='197'/>197</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;getter.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='198'/>198</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return&nbsp;the&nbsp;reglas</td>
</tr>
<tr class="noCover">
<td class="line"><a name='199'/>199</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='200'/>200</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;Collection&lt;IRegla&gt;&nbsp;getReglas()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='201'/>201</td>
<td class="hits">3972</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;reglas;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='202'/>202</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='203'/>203</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='204'/>204</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='205'/>205</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;getter.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='206'/>206</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return&nbsp;the&nbsp;valoracion</td>
</tr>
<tr class="noCover">
<td class="line"><a name='207'/>207</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='208'/>208</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;Valoracion&nbsp;getValoracion()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='209'/>209</td>
<td class="hits">463</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;valoracion;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='210'/>210</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='211'/>211</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='212'/>212</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**&nbsp;{@inheritDoc}&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='213'/>213</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;Collection&lt;IncidenciaChequeo&gt;&nbsp;getIncidenciasChequeo()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='214'/>214</td>
<td class="hits">1477</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;incidenciasChequeo;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='215'/>215</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='216'/>216</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='217'/>217</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='218'/>218</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;setter.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='219'/>219</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;incidenciasChequeos&nbsp;the&nbsp;incidenciasChequeo&nbsp;to&nbsp;set</td>
</tr>
<tr class="noCover">
<td class="line"><a name='220'/>220</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='221'/>221</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;setIncidenciasChequeo(Collection&lt;IncidenciaChequeo&gt;&nbsp;incidenciasChequeos)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='222'/>222</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.incidenciasChequeo&nbsp;=&nbsp;incidenciasChequeos;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='223'/>223</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='224'/>224</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='225'/>225</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='226'/>226</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Indicador&nbsp;de&nbsp;si&nbsp;se&nbsp;cumplen&nbsp;los&nbsp;chequeos&nbsp;previos.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='227'/>227</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;fichero&nbsp;fichero&nbsp;sobre&nbsp;el&nbsp;que&nbsp;se&nbsp;realizan&nbsp;los&nbsp;chequeos.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='228'/>228</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return&nbsp;el&nbsp;resultado&nbsp;de&nbsp;la&nbsp;evaluacion.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='229'/>229</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='230'/>230</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;boolean&nbsp;seCumplenChequeosPrevios(Fichero&nbsp;fichero)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='231'/>231</td>
<td class="hits">162</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;boolean&nbsp;cumplimiento&nbsp;=&nbsp;true;</td>
</tr>
<tr class="coverPart" title="Line 232: Conditional coverage 50% (1/2)">
<td class="line"><a name='232'/>232</td>
<td class="hits">162</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for&nbsp;(IRegla&nbsp;regla&nbsp;:&nbsp;reglasPrevia)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='233'/>233</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(!regla.seCumple(fichero)){</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='234'/>234</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;cumplimiento&nbsp;=&nbsp;false;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='235'/>235</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;break;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='236'/>236</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='237'/>237</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='238'/>238</td>
<td class="hits">162</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;cumplimiento;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='239'/>239</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='240'/>240</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='241'/>241</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='242'/>242</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Determina&nbsp;la&nbsp;valoraci��n&nbsp;de&nbsp;los&nbsp;chequeos.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='243'/>243</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='244'/>244</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;protected&nbsp;void&nbsp;valorar(){</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='245'/>245</td>
<td class="hits">463</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(getIncidenciasChequeo().isEmpty()){</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='246'/>246</td>
<td class="hits">282</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;valoracion&nbsp;=&nbsp;Valoracion.CORRECTO;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='247'/>247</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}else{</td>
</tr>
<tr class="coverPart" title="Line 248: Conditional coverage 50% (1/2)">
<td class="line"><a name='248'/>248</td>
<td class="hits">181</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(existeNivelIncidenciaError()){</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='249'/>249</td>
<td class="hits">181</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;valoracion&nbsp;=&nbsp;Valoracion.INCORRECTO;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='250'/>250</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}else{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='251'/>251</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;valoracion&nbsp;=&nbsp;Valoracion.AVISO;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='252'/>252</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='253'/>253</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='254'/>254</td>
<td class="hits">463</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='255'/>255</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='256'/>256</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='257'/>257</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Comprueba&nbsp;si&nbsp;existe&nbsp;un&nbsp;nivel&nbsp;de&nbsp;incidencia&nbsp;Error.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='258'/>258</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return&nbsp;si&nbsp;cumple&nbsp;la&nbsp;pregunta.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='259'/>259</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='260'/>260</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;boolean&nbsp;existeNivelIncidenciaError()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='261'/>261</td>
<td class="hits">181</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;boolean&nbsp;nivelError&nbsp;=&nbsp;false;</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='262'/>262</td>
<td class="hits">181</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for&nbsp;(IncidenciaChequeo&nbsp;incidenciaChequeo&nbsp;:&nbsp;getIncidenciasChequeo())&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='263'/>263</td>
<td class="hits">189</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(incidenciaChequeo.getNivelIncidencia()&nbsp;==&nbsp;IncidenciaChequeo.NivelIncidencia.ERROR){</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='264'/>264</td>
<td class="hits">187</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;nivelError&nbsp;=&nbsp;true;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='265'/>265</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='266'/>266</td>
<td class="hits">189</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='267'/>267</td>
<td class="hits">181</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;nivelError;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='268'/>268</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='269'/>269</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='270'/>270</td>
<td class="hits"/>
<td class="code">}</td>
</tr>
