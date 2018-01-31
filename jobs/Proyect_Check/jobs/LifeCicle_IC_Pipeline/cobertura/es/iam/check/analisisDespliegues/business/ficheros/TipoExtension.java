<tr class="noCover">
<td class="line"><a name='1'/>1</td>
<td class="hits"/>
<td class="code">package&nbsp;es.iam.check.analisisDespliegues.business.ficheros;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='2'/>2</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='3'/>3</td>
<td class="hits"/>
<td class="code">/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='4'/>4</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;Extensiones.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='5'/>5</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;@author&nbsp;SSA005</td>
</tr>
<tr class="noCover">
<td class="line"><a name='6'/>6</td>
<td class="hits"/>
<td class="code">&nbsp;*/</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='7'/>7</td>
<td class="hits">18</td>
<td class="code">public&nbsp;enum&nbsp;TipoExtension&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='8'/>8</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='9'/>9</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='10'/>10</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;INSTANCIAS.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='11'/>11</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='12'/>12</td>
<td class="hits">18</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;EAR(".ear"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='13'/>13</td>
<td class="hits">18</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;WAR(".war"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='14'/>14</td>
<td class="hits">18</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;JAR(".jar"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='15'/>15</td>
<td class="hits">18</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ZIP(".zip"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='16'/>16</td>
<td class="hits">18</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;JAVA(".java"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='17'/>17</td>
<td class="hits">18</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CLASS(".class"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='18'/>18</td>
<td class="hits">18</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;XML(".xml"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='19'/>19</td>
<td class="hits">18</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PROPERTIES(".properties"),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='20'/>20</td>
<td class="hits">18</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;NINGUNO(""),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='21'/>21</td>
<td class="hits">18</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CUALQUIERA(".*");</td>
</tr>
<tr class="noCover">
<td class="line"><a name='22'/>22</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='23'/>23</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='24'/>24</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;La&nbsp;extension&nbsp;de&nbsp;los&nbsp;ficheros.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='25'/>25</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='26'/>26</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;String&nbsp;extension;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='27'/>27</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='28'/>28</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='29'/>29</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Metodo&nbsp;conversor&nbsp;de&nbsp;cadena&nbsp;a&nbsp;tipo.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='30'/>30</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;name&nbsp;el&nbsp;nombre&nbsp;de&nbsp;la&nbsp;extension&nbsp;como&nbsp;cadena.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='31'/>31</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return&nbsp;el&nbsp;tipo&nbsp;instanciado.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='32'/>32</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='33'/>33</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;static&nbsp;TipoExtension&nbsp;extension(String&nbsp;name)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='34'/>34</td>
<td class="hits">27198</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TipoExtension&nbsp;tipoExtension&nbsp;=&nbsp;TipoExtension.CUALQUIERA;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='35'/>35</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="coverPart" title="Line 36: Conditional coverage 50% (1/2)">
<td class="line"><a name='36'/>36</td>
<td class="hits">27198</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(name.endsWith(EAR.getExtension())){</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='37'/>37</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tipoExtension&nbsp;=&nbsp;EAR;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='38'/>38</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='39'/>39</td>
<td class="hits">27198</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(name.endsWith(WAR.getExtension())){</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='40'/>40</td>
<td class="hits">2862</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tipoExtension&nbsp;=&nbsp;WAR;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='41'/>41</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='42'/>42</td>
<td class="hits">27198</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(name.endsWith(JAR.getExtension())){</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='43'/>43</td>
<td class="hits">630</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tipoExtension&nbsp;=&nbsp;JAR;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='44'/>44</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverPart" title="Line 45: Conditional coverage 50% (1/2)">
<td class="line"><a name='45'/>45</td>
<td class="hits">27198</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(name.endsWith(ZIP.getExtension())){</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='46'/>46</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tipoExtension&nbsp;=&nbsp;ZIP;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='47'/>47</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='48'/>48</td>
<td class="hits">27198</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(name.endsWith(JAVA.getExtension())){</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='49'/>49</td>
<td class="hits">108</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tipoExtension&nbsp;=&nbsp;JAVA;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='50'/>50</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='51'/>51</td>
<td class="hits">27198</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(name.endsWith(CLASS.getExtension())){</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='52'/>52</td>
<td class="hits">108</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tipoExtension&nbsp;=&nbsp;CLASS;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='53'/>53</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='54'/>54</td>
<td class="hits">27198</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(name.endsWith(XML.getExtension())){</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='55'/>55</td>
<td class="hits">5274</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tipoExtension&nbsp;=&nbsp;CLASS;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='56'/>56</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='57'/>57</td>
<td class="hits">27198</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(name.endsWith(PROPERTIES.getExtension())){</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='58'/>58</td>
<td class="hits">360</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tipoExtension&nbsp;=&nbsp;PROPERTIES;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='59'/>59</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='60'/>60</td>
<td class="hits">27198</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(!name.contains(".")){</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='61'/>61</td>
<td class="hits">14616</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tipoExtension&nbsp;=&nbsp;NINGUNO;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='62'/>62</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='63'/>63</td>
<td class="hits">27198</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;tipoExtension;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='64'/>64</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='65'/>65</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='66'/>66</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='67'/>67</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='68'/>68</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;getter.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='69'/>69</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return&nbsp;the&nbsp;extension</td>
</tr>
<tr class="noCover">
<td class="line"><a name='70'/>70</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='71'/>71</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;getExtension()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='72'/>72</td>
<td class="hits">217584</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;extension;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='73'/>73</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='74'/>74</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='75'/>75</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='76'/>76</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Constructor&nbsp;por&nbsp;defecto&nbsp;de&nbsp;las&nbsp;entidades.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='77'/>77</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;extension&nbsp;la&nbsp;extension&nbsp;como&nbsp;cadena.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='78'/>78</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='79'/>79</td>
<td class="hits">180</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;TipoExtension(String&nbsp;extension){</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='80'/>80</td>
<td class="hits">180</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.extension&nbsp;=&nbsp;extension;</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='81'/>81</td>
<td class="hits">180</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='82'/>82</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='83'/>83</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='84'/>84</td>
<td class="hits"/>
<td class="code">}</td>
</tr>