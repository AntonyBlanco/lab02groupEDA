# EDA-Lab02
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>
<div align="center">
    <span style="font-weight:bold;"><h2>INFORME DE LABORATORIO</h2></span>
</div>


<table>
<theader>
    <tr><th colspan="6" style="width:50%; height:auto; text-align:center">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
    <tr>
        <td>ASIGNATURA:</td><td colspan="5">Estructuras de Datos y Algoritmos</td>
    </tr>
    <tr>
        <td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Revisión de elementos de programación (Parte I)</td>
    </tr>
    <tr>
        <td>NÚMERO DE PRÁCTICA:</td><td>01</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
    </tr>
    <tr>
        <td colspan="2">FECHA DE PRESENTACIÓN:</td><td>10-May-2022</td><td colspan="2">HORA DE PRESENTACIÓN:</td><td>8:00</td>
    </tr>
    <tr>
        <td colspan="3">INTEGRANTES:
        <ol>
        <li>Blanco Trujillo, Antony Jacob</li>
        <li>Checalla Soto, Edisson Franklin</li>
        <li>Vilca Suelo, Gionvanni Gabriel</li>
        </ol>
        </td>
        <td colspan="2"> NOTA:</td>
        <td>     </td>
    </tr>
    <tr>
        <td colspan="6">DOCENTE:<br>
        Mg. Richart Smith Escobedo Quispe
        </td>
    </tr>
</tdbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">SOLUCIÓN Y RESULTADOS</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS<br>
                <ul>
                    <li>Ejercicio 1: Invertir Una Matriz</li>
                    #
                    ```sh
                    int [] Ain= new int[A.length];
                    for (int i = 0; i < A.length; i++) {
                    Ain [i] = A[A.length-1-i];
                    }
                    ```
                    <li>Ejercicio 2 : Rotación a la izquierda</li>
                    <pre>
public static int[] rotarIzquierdaArray(int[] A, int d){
// Metodo para rotar los elementos de un arreglo a la izquierda
    int[] Arotated = new int[A.length];

    int index;
    for(int i = 0; i < A.length; i++){
        index = i + d; // Nueva posicion del elemento
        if(index >= A.length) index -= A.length; // Limitando a index
        Arotated[i] = A[index];
    }
    return Arotated; // Retorna arreglo diferente a A
}
                    </pre>
                    <li>Ejercicio 3 : Triángulo recursivo</li>
                </ul>
            </td>
        </tr>
        <tr>
            <td>
            II. SOLUCIÓN DEL CUESTIONARIO<br>
                <ul>
                    <li>Colocar preguntas y respuestas</li>
                </ul>
                	<dl>
                    <dt>¿Qué diferencia hay entre un List y un ArrayList en Java?
                    </dt>
                    	<dd>La interfaz de lista se utiliza para crear una lista de elementos (objetos) que están asociados con sus números de índice. Mientras que La clase ArrayList se usa para crear una matriz dinámica que contiene objetos.
		    	        </dd>
                    <dt>¿¿Qué beneficios y oportunidades ofrecen las clases genéricas en Java?
                    </dt>
                    	<dd> Una de las ventaja mas resaltantes es que con las clases genericas no hay necesidad de transferencia forzada de tipos, lo que mejora la eficiencia y evita errores de transferencia forzada.<br>
                        Se puede utilizar una gran variedad de clases para la implementación de una estructura lo cual evita que nos quedemos limitados a implementar mediante el uso de una sola clase.
			            </dd>
 		            </dl>
            </td>
        </tr>
        <tr>
            <td>
            III. CONCLUSIONES<br>
                <ul>
                    <li>Colocar conclusiones</li>
                </ul>
            </td>
        </tr>
    </tbody>
</table>




<table>
    <theader>
        <tr>
            <th style="text-align:center">RETROALIMENTACIÓN GENERAL</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            </td>
        </tr>
    </tbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">CUESTIONARIO</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
                <ul>
                    <li>[1]	“List (java platform SE 7 )”, Oracle.com, 24-jun-2020. [En línea]. Disponible en: https://docs.oracle.com/javase/7/docs/api/java/util/List.html. [Consultado: 17-may-2022].
                    </li>
                    <li>[2]	“Collection (java platform SE 7 )”, Oracle.com, 24-jun-2020. [En línea]. Disponible en: https://docs.oracle.com/javase/7/docs/api/java/util/Collection.html. [Consultado: 17-may-2022].
                    </li>
                    <li>[3]	“Generic types”, Oracle.com. [En línea]. Disponible en: https://docs.oracle.com/javase/tutorial/java/generics/types.html. [Consultado: 17-may-2022].
                    </li>
                    <li>[4]	“Java Listas enlazadas Simples”, Delta PC, 28-ene-2019. [En línea]. Disponible en: https://www.deltapci.com/java-listas-enlazadas-simples/. [Consultado: 17-may-2022].
</li>
                    <li>[5]	“programador clic”, Programmerclick.com. [En línea]. Disponible en: https://programmerclick.com/article/89391964667/. [Consultado: 17-may-2022].
</li>
                    <li></li>
                    <li></li>
                </ul>
            </td>
        </tr>
    </tbody>
</table>

