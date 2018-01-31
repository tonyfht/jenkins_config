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
<td class="code">import&nbsp;javax.xml.bind.annotation.XmlAccessType;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='12'/>12</td>
<td class="hits"/>
<td class="code">import&nbsp;javax.xml.bind.annotation.XmlAccessorType;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='13'/>13</td>
<td class="hits"/>
<td class="code">import&nbsp;javax.xml.bind.annotation.XmlAttribute;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='14'/>14</td>
<td class="hits"/>
<td class="code">import&nbsp;javax.xml.bind.annotation.XmlElement;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='15'/>15</td>
<td class="hits"/>
<td class="code">import&nbsp;javax.xml.bind.annotation.XmlType;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='16'/>16</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='17'/>17</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='18'/>18</td>
<td class="hits"/>
<td class="code">/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='19'/>19</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&lt;p&gt;Java&nbsp;class&nbsp;for&nbsp;TipoRegla&nbsp;complex&nbsp;type.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='20'/>20</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='21'/>21</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&lt;p&gt;The&nbsp;following&nbsp;schema&nbsp;fragment&nbsp;specifies&nbsp;the&nbsp;expected&nbsp;content&nbsp;contained&nbsp;within&nbsp;this&nbsp;class.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='22'/>22</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='23'/>23</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&lt;pre&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='24'/>24</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&amp;lt;complexType&nbsp;name="TipoRegla"&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='25'/>25</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&amp;lt;complexContent&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='26'/>26</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;restriction&nbsp;base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='27'/>27</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;sequence&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='28'/>28</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;element&nbsp;name="ejemplo"&nbsp;type="{http://www.w3.org/2001/XMLSchema}string"/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='29'/>29</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;element&nbsp;name="patronOCadena"&nbsp;type="{http://www.w3.org/2001/XMLSchema}string"/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='30'/>30</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;element&nbsp;name="tipoComprobacion"&nbsp;type="{http://www.iam.es/repositorio}ValuesTipoComprobacion"/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='31'/>31</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;element&nbsp;name="tratamientoMayusculas"&nbsp;type="{http://www.iam.es/repositorio}ValuesTratamientoMayusculas"&nbsp;minOccurs="0"/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='32'/>32</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;/sequence&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='33'/>33</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;attribute&nbsp;name="tipo"&nbsp;type="{http://www.iam.es/repositorio}ValuesTipoRegla"&nbsp;/&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='34'/>34</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&amp;lt;/restriction&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='35'/>35</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;&nbsp;&amp;lt;/complexContent&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='36'/>36</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&amp;lt;/complexType&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='37'/>37</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&lt;/pre&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='38'/>38</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='39'/>39</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='40'/>40</td>
<td class="hits"/>
<td class="code">&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='41'/>41</td>
<td class="hits"/>
<td class="code">@XmlAccessorType(XmlAccessType.FIELD)</td>
</tr>
<tr class="noCover">
<td class="line"><a name='42'/>42</td>
<td class="hits"/>
<td class="code">@XmlType(name&nbsp;=&nbsp;"TipoRegla",&nbsp;propOrder&nbsp;=&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='43'/>43</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;"ejemplo",</td>
</tr>
<tr class="noCover">
<td class="line"><a name='44'/>44</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;"patronOCadena",</td>
</tr>
<tr class="noCover">
<td class="line"><a name='45'/>45</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;"tipoComprobacion",</td>
</tr>
<tr class="noCover">
<td class="line"><a name='46'/>46</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;"tratamientoMayusculas"</td>
</tr>
<tr class="noCover">
<td class="line"><a name='47'/>47</td>
<td class="hits"/>
<td class="code">})</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='48'/>48</td>
<td class="hits">82923</td>
<td class="code">public&nbsp;class&nbsp;TipoRegla&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='49'/>49</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='50'/>50</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlElement(required&nbsp;=&nbsp;true)</td>
</tr>
<tr class="noCover">
<td class="line"><a name='51'/>51</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;protected&nbsp;String&nbsp;ejemplo;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='52'/>52</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlElement(required&nbsp;=&nbsp;true)</td>
</tr>
<tr class="noCover">
<td class="line"><a name='53'/>53</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;protected&nbsp;String&nbsp;patronOCadena;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='54'/>54</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlElement(required&nbsp;=&nbsp;true)</td>
</tr>
<tr class="noCover">
<td class="line"><a name='55'/>55</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;protected&nbsp;ValuesTipoComprobacion&nbsp;tipoComprobacion;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='56'/>56</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;protected&nbsp;ValuesTratamientoMayusculas&nbsp;tratamientoMayusculas;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='57'/>57</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@XmlAttribute</td>
</tr>
<tr class="noCover">
<td class="line"><a name='58'/>58</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;protected&nbsp;ValuesTipoRegla&nbsp;tipo;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='59'/>59</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='60'/>60</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='61'/>61</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Gets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;ejemplo&nbsp;property.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='62'/>62</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='63'/>63</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return</td>
</tr>
<tr class="noCover">
<td class="line"><a name='64'/>64</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;possible&nbsp;object&nbsp;is</td>
</tr>
<tr class="noCover">
<td class="line"><a name='65'/>65</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{@link&nbsp;String&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='66'/>66</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='67'/>67</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='68'/>68</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;getEjemplo()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='69'/>69</td>
<td class="hits">82923</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;ejemplo;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='70'/>70</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='71'/>71</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='72'/>72</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='73'/>73</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;ejemplo&nbsp;property.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='74'/>74</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='75'/>75</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;value</td>
</tr>
<tr class="noCover">
<td class="line"><a name='76'/>76</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;allowed&nbsp;object&nbsp;is</td>
</tr>
<tr class="noCover">
<td class="line"><a name='77'/>77</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{@link&nbsp;String&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='78'/>78</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='79'/>79</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='80'/>80</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;setEjemplo(String&nbsp;value)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='81'/>81</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.ejemplo&nbsp;=&nbsp;value;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='82'/>82</td>
<td class="hits">0</td>
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
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='85'/>85</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Gets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;patronOCadena&nbsp;property.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='86'/>86</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='87'/>87</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return</td>
</tr>
<tr class="noCover">
<td class="line"><a name='88'/>88</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;possible&nbsp;object&nbsp;is</td>
</tr>
<tr class="noCover">
<td class="line"><a name='89'/>89</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{@link&nbsp;String&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='90'/>90</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='91'/>91</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='92'/>92</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;getPatronOCadena()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='93'/>93</td>
<td class="hits">82923</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;patronOCadena;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='94'/>94</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='95'/>95</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='96'/>96</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='97'/>97</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;patronOCadena&nbsp;property.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='98'/>98</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='99'/>99</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;value</td>
</tr>
<tr class="noCover">
<td class="line"><a name='100'/>100</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;allowed&nbsp;object&nbsp;is</td>
</tr>
<tr class="noCover">
<td class="line"><a name='101'/>101</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{@link&nbsp;String&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='102'/>102</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='103'/>103</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='104'/>104</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;setPatronOCadena(String&nbsp;value)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='105'/>105</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.patronOCadena&nbsp;=&nbsp;value;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='106'/>106</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='107'/>107</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='108'/>108</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='109'/>109</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Gets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;tipoComprobacion&nbsp;property.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='110'/>110</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='111'/>111</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return</td>
</tr>
<tr class="noCover">
<td class="line"><a name='112'/>112</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;possible&nbsp;object&nbsp;is</td>
</tr>
<tr class="noCover">
<td class="line"><a name='113'/>113</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{@link&nbsp;ValuesTipoComprobacion&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='114'/>114</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='115'/>115</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='116'/>116</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;ValuesTipoComprobacion&nbsp;getTipoComprobacion()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='117'/>117</td>
<td class="hits">82923</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;tipoComprobacion;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='118'/>118</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='119'/>119</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='120'/>120</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='121'/>121</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;tipoComprobacion&nbsp;property.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='122'/>122</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='123'/>123</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;value</td>
</tr>
<tr class="noCover">
<td class="line"><a name='124'/>124</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;allowed&nbsp;object&nbsp;is</td>
</tr>
<tr class="noCover">
<td class="line"><a name='125'/>125</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{@link&nbsp;ValuesTipoComprobacion&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='126'/>126</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='127'/>127</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='128'/>128</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;setTipoComprobacion(ValuesTipoComprobacion&nbsp;value)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='129'/>129</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.tipoComprobacion&nbsp;=&nbsp;value;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='130'/>130</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='131'/>131</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='132'/>132</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='133'/>133</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Gets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;tratamientoMayusculas&nbsp;property.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='134'/>134</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='135'/>135</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return</td>
</tr>
<tr class="noCover">
<td class="line"><a name='136'/>136</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;possible&nbsp;object&nbsp;is</td>
</tr>
<tr class="noCover">
<td class="line"><a name='137'/>137</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{@link&nbsp;ValuesTratamientoMayusculas&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='138'/>138</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='139'/>139</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='140'/>140</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;ValuesTratamientoMayusculas&nbsp;getTratamientoMayusculas()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='141'/>141</td>
<td class="hits">82218</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;tratamientoMayusculas;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='142'/>142</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='143'/>143</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='144'/>144</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='145'/>145</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;tratamientoMayusculas&nbsp;property.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='146'/>146</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='147'/>147</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;value</td>
</tr>
<tr class="noCover">
<td class="line"><a name='148'/>148</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;allowed&nbsp;object&nbsp;is</td>
</tr>
<tr class="noCover">
<td class="line"><a name='149'/>149</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{@link&nbsp;ValuesTratamientoMayusculas&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='150'/>150</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='151'/>151</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='152'/>152</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;setTratamientoMayusculas(ValuesTratamientoMayusculas&nbsp;value)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='153'/>153</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.tratamientoMayusculas&nbsp;=&nbsp;value;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='154'/>154</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='155'/>155</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='156'/>156</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='157'/>157</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Gets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;tipo&nbsp;property.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='158'/>158</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='159'/>159</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return</td>
</tr>
<tr class="noCover">
<td class="line"><a name='160'/>160</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;possible&nbsp;object&nbsp;is</td>
</tr>
<tr class="noCover">
<td class="line"><a name='161'/>161</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{@link&nbsp;ValuesTipoRegla&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='162'/>162</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='163'/>163</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='164'/>164</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;ValuesTipoRegla&nbsp;getTipo()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='165'/>165</td>
<td class="hits">248769</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;tipo;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='166'/>166</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='167'/>167</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='168'/>168</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='169'/>169</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;tipo&nbsp;property.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='170'/>170</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='171'/>171</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;value</td>
</tr>
<tr class="noCover">
<td class="line"><a name='172'/>172</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;allowed&nbsp;object&nbsp;is</td>
</tr>
<tr class="noCover">
<td class="line"><a name='173'/>173</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{@link&nbsp;ValuesTipoRegla&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='174'/>174</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='175'/>175</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='176'/>176</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;setTipo(ValuesTipoRegla&nbsp;value)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='177'/>177</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.tipo&nbsp;=&nbsp;value;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='178'/>178</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='179'/>179</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='180'/>180</td>
<td class="hits"/>
<td class="code">}</td>
</tr>
