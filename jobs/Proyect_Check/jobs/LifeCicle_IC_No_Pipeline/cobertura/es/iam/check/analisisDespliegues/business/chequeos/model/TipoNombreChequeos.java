<tr class="noCover">
<td class="line"><a name='1'/>1</td>
<td class="hits"/>
<td class="code">//</td>
</tr>
<tr class="noCover">
<td class="line"><a name='2'/>2</td>
<td class="hits"/>
<td class="code">//&nbsp;This&nbsp;file&nbsp;was&nbsp;generated&nbsp;by&nbsp;the&nbsp;JavaTM&nbsp;Architecture&nbsp;for&nbsp;XML&nbsp;Binding(JAXB)&nbsp;Reference&nbsp;Implementation,&nbsp;vJAXB&nbsp;2.1.10&nbsp;in&nbsp;JDK&nbsp;6&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='3'/>3</td>
<td class="hits"/>
<td class="code">//&nbsp;See&nbsp;&lt;a&nbsp;href="http://java.sun.com/xml/jaxb"&gt;http://java.sun.com/xml/jaxb&lt;/a&gt;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='4'/>4</td>
<td class="hits"/>
<td class="code">//&nbsp;Any&nbsp;modifications&nbsp;to&nbsp;this&nbsp;file&nbsp;will&nbsp;be&nbsp;lost&nbsp;upon&nbsp;recompilation&nbsp;of&nbsp;the&nbsp;source&nbsp;schema.&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='5'/>5</td>
<td class="hits"/>
<td class="code">//&nbsp;Generated&nbsp;on:&nbsp;2014.05.14&nbsp;at&nbsp;11:22:21&nbsp;AM&nbsp;CEST&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='6'/>6</td>
<td class="hits"/>
<td class="code">//</td>
</tr>
<tr class="noCover">
<td class="line"><a name='7'/>7</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='8'/>8</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='9'/>9</td>
<td class="hits"/>
<td class="code">package&nbsp;es.iam.check.analisisDespliegues.business.chequeos.model;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='10'/>10</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='11'/>11</td>
<td class="hits"/>
<td class="code">import&nbsp;javax.xml.bind.annotation.XmlEnum;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='12'/>12</td>
<td class="hits"/>
<td class="code">import&nbsp;javax.xml.bind.annotation.XmlEnumValue;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='13'/>13</td>
<td class="hits"/>
<td class="code">import&nbsp;javax.xml.bind.annotation.XmlType;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='14'/>14</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='15'/>15</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='16'/>16</td>
<td class="hits"/>
<td class="code">/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='17'/>17</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&lt;p&gt;Java&nbsp;class&nbsp;for&nbsp;TipoNombreChequeos.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='18'/>18</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='19'/>19</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&lt;p&gt;The&nbsp;following&nbsp;schema&nbsp;fragment&nbsp;specifies&nbsp;the&nbsp;expected&nbsp;content&nbsp;contained&nbsp;within&nbsp;this&nbsp;class.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='20'/>20</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&lt;p&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='21'/>21</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&lt;pre&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='22'/>22</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&amp;lt;simpleType&nbsp;name="TipoNombreChequeos"&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='23'/>23</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&amp;lt;restriction&nbsp;base="{http://www.w3.org/2001/XMLSchema}string"&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='24'/>24</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;enumeration&nbsp;value="ChequeoExtensionArtefacto"/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='25'/>25</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;enumeration&nbsp;value="ChequeosEstructura"/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='26'/>26</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;enumeration&nbsp;value="ChequeosDescriptores"/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='27'/>27</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;enumeration&nbsp;value="ChequeoArchivosNoPermitidosEAR"/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='28'/>28</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;enumeration&nbsp;value="ChequeosFicherosTraza"/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='29'/>29</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;enumeration&nbsp;value="ChequeoLibreriasDuplicadas"/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='30'/>30</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;enumeration&nbsp;value="ChequeosContenidoWebXML"/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='31'/>31</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;enumeration&nbsp;value="ChequeosContenidoApplicationXML"/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='32'/>32</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;enumeration&nbsp;value="ChequeoExtensionEstaticos"/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='33'/>33</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;enumeration&nbsp;value="ChequeoArchivosNoPermitidosEstaticos"/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='34'/>34</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;enumeration&nbsp;value="ChequeoExtensionRecursos"/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='35'/>35</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;enumeration&nbsp;value="ChequeoArchivosNoPermitidosRecursos"/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='36'/>36</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;enumeration&nbsp;value="ChequeoLibreriasNoPermitidas"/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='37'/>37</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&amp;lt;/restriction&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='38'/>38</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&amp;lt;/simpleType&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='39'/>39</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&lt;/pre&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='40'/>40</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='41'/>41</td>
<td class="hits"/>
<td class="code">&nbsp;*/</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='42'/>42</td>
<td class="hits">212</td>
<td class="code">@XmlType(name&nbsp;=&nbsp;"TipoNombreChequeos")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='43'/>43</td>
<td class="hits"/>
<td class="code">@XmlEnum</td>
</tr>
<tr class="noCover">
<td class="line"><a name='44'/>44</td>
<td class="hits"/>
<td class="code">public&nbsp;enum&nbsp;TipoNombreChequeos&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='45'/>45</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='46'/>46</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlEnumValue("ChequeoExtensionArtefacto")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='47'/>47</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;CHEQUEO_EXTENSION_ARTEFACTO("ChequeoExtensionArtefacto"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='48'/>48</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlEnumValue("ChequeosEstructura")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='49'/>49</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;CHEQUEOS_ESTRUCTURA("ChequeosEstructura"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='50'/>50</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlEnumValue("ChequeosDescriptores")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='51'/>51</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;CHEQUEOS_DESCRIPTORES("ChequeosDescriptores"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='52'/>52</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlEnumValue("ChequeoArchivosNoPermitidosEAR")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='53'/>53</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR("ChequeoArchivosNoPermitidosEAR"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='54'/>54</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlEnumValue("ChequeosFicherosTraza")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='55'/>55</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;CHEQUEOS_FICHEROS_TRAZA("ChequeosFicherosTraza"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='56'/>56</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlEnumValue("ChequeoLibreriasDuplicadas")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='57'/>57</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;CHEQUEO_LIBRERIAS_DUPLICADAS("ChequeoLibreriasDuplicadas"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='58'/>58</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlEnumValue("ChequeosContenidoWebXML")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='59'/>59</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;CHEQUEOS_CONTENIDO_WEB_XML("ChequeosContenidoWebXML"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='60'/>60</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlEnumValue("ChequeosContenidoApplicationXML")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='61'/>61</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;CHEQUEOS_CONTENIDO_APPLICATION_XML("ChequeosContenidoApplicationXML"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='62'/>62</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlEnumValue("ChequeoExtensionEstaticos")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='63'/>63</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;CHEQUEO_EXTENSION_ESTATICOS("ChequeoExtensionEstaticos"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='64'/>64</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlEnumValue("ChequeoArchivosNoPermitidosEstaticos")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='65'/>65</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;CHEQUEO_ARCHIVOS_NO_PERMITIDOS_ESTATICOS("ChequeoArchivosNoPermitidosEstaticos"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='66'/>66</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlEnumValue("ChequeoExtensionRecursos")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='67'/>67</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;CHEQUEO_EXTENSION_RECURSOS("ChequeoExtensionRecursos"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='68'/>68</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlEnumValue("ChequeoArchivosNoPermitidosRecursos")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='69'/>69</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;CHEQUEO_ARCHIVOS_NO_PERMITIDOS_RECURSOS("ChequeoArchivosNoPermitidosRecursos"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='70'/>70</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlEnumValue("ChequeoLibreriasNoPermitidas")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='71'/>71</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;CHEQUEO_LIBRERIAS_NO_PERMITIDAS("ChequeoLibreriasNoPermitidas"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='72'/>72</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlEnumValue("Todos")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='73'/>73</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;Todos("Todos");</td>
</tr>
<tr class="noCover">
<td class="line"><a name='74'/>74</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;final&nbsp;String&nbsp;value;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='75'/>75</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='76'/>76</td>
<td class="hits">14</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;TipoNombreChequeos(String&nbsp;v)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='77'/>77</td>
<td class="hits">14</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;value&nbsp;=&nbsp;v;</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='78'/>78</td>
<td class="hits">14</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='79'/>79</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='80'/>80</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;value()&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='81'/>81</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;value;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='82'/>82</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='83'/>83</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='84'/>84</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;static&nbsp;TipoNombreChequeos&nbsp;fromValue(String&nbsp;v)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='85'/>85</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for&nbsp;(TipoNombreChequeos&nbsp;c:&nbsp;TipoNombreChequeos.values())&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='86'/>86</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(c.value.equals(v))&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='87'/>87</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;c;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='88'/>88</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='89'/>89</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='90'/>90</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;throw&nbsp;new&nbsp;IllegalArgumentException(v);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='91'/>91</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='92'/>92</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='93'/>93</td>
<td class="hits"/>
<td class="code">}</td>
</tr>
