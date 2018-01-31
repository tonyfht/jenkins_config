<tr class="noCover">
<td class="line"><a name='1'/>1</td>
<td class="hits"/>
<td class="code">package&nbsp;es.iam.check.analisisDespliegues.business.chequeos.incidencias;</td>
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
<td class="code">&nbsp;*&nbsp;Muestra&nbsp;los&nbsp;datos&nbsp;de&nbsp;una&nbsp;incidencia&nbsp;desde&nbsp;el&nbsp;punto&nbsp;de&nbsp;vista</td>
</tr>
<tr class="noCover">
<td class="line"><a name='5'/>5</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;de&nbsp;un&nbsp;chequeo&nbsp;durante&nbsp;un&nbsp;analisis.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='6'/>6</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='7'/>7</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;@author&nbsp;SSA005</td>
</tr>
<tr class="noCover">
<td class="line"><a name='8'/>8</td>
<td class="hits"/>
<td class="code">&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='9'/>9</td>
<td class="hits"/>
<td class="code">public&nbsp;class&nbsp;IncidenciaChequeo&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='10'/>10</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='11'/>11</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='12'/>12</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Niveles&nbsp;disponibles&nbsp;para&nbsp;una&nbsp;incidencia.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='13'/>13</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='14'/>14</td>
<td class="hits">3</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;static&nbsp;enum&nbsp;NivelIncidencia&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='15'/>15</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ERROR,</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='16'/>16</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ADVERTENCIA</td>
</tr>
<tr class="noCover">
<td class="line"><a name='17'/>17</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;};</td>
</tr>
<tr class="noCover">
<td class="line"><a name='18'/>18</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='19'/>19</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='20'/>20</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;La&nbsp;ruta&nbsp;analizada&nbsp;que&nbsp;ha&nbsp;causado&nbsp;una&nbsp;incidencia.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='21'/>21</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='22'/>22</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;String&nbsp;rutaIncidencia;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='23'/>23</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='24'/>24</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='25'/>25</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Un&nbsp;comentario&nbsp;explicativo&nbsp;de&nbsp;porque&nbsp;se&nbsp;considera&nbsp;una&nbsp;incidencia.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='26'/>26</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='27'/>27</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;String&nbsp;comentario;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='28'/>28</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='29'/>29</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='30'/>30</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;El&nbsp;nivel&nbsp;de&nbsp;la&nbsp;incidencia.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='31'/>31</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='32'/>32</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;NivelIncidencia&nbsp;nivelIncidencia;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='33'/>33</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='34'/>34</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='35'/>35</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Constructor&nbsp;de&nbsp;la&nbsp;{@link&nbsp;IncidenciaChequeo}.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='36'/>36</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;nivelIncidencia&nbsp;nivel&nbsp;de&nbsp;la&nbsp;incidencia.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='37'/>37</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;rutaIncidencia&nbsp;la&nbsp;ruta.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='38'/>38</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;comentario&nbsp;el&nbsp;comentario.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='39'/>39</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='40'/>40</td>
<td class="hits">189</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;IncidenciaChequeo(NivelIncidencia&nbsp;nivelIncidencia,&nbsp;String&nbsp;rutaIncidencia,&nbsp;String&nbsp;comentario)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='41'/>41</td>
<td class="hits">189</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.nivelIncidencia&nbsp;=&nbsp;nivelIncidencia;</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='42'/>42</td>
<td class="hits">189</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.rutaIncidencia&nbsp;=&nbsp;rutaIncidencia;</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='43'/>43</td>
<td class="hits">189</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.comentario&nbsp;=&nbsp;comentario;</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='44'/>44</td>
<td class="hits">189</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='45'/>45</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='46'/>46</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='47'/>47</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;getter.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='48'/>48</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return&nbsp;the&nbsp;rutaIncidencia</td>
</tr>
<tr class="noCover">
<td class="line"><a name='49'/>49</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='50'/>50</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;getRutaIncidencia()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='51'/>51</td>
<td class="hits">189</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;rutaIncidencia;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='52'/>52</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='53'/>53</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='54'/>54</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/**</td>
</tr>
<tr class="noCover">
<td class="line"><a name='55'/>55</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;getter.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='56'/>56</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return&nbsp;the&nbsp;comentario</td>
</tr>
<tr class="noCover">
<td class="line"><a name='57'/>57</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='58'/>58</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;getComentario()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='59'/>59</td>
<td class="hits">189</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;comentario;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='60'/>60</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
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
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;getter.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='64'/>64</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return&nbsp;the&nbsp;nivelIncidencia</td>
</tr>
<tr class="noCover">
<td class="line"><a name='65'/>65</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='66'/>66</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;NivelIncidencia&nbsp;getNivelIncidencia()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='67'/>67</td>
<td class="hits">378</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;nivelIncidencia;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='68'/>68</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='69'/>69</td>
<td class="hits"/>
<td class="code">}</td>
</tr>
