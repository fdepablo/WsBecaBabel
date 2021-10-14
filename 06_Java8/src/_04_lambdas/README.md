# Funciones Lambda
Las funciones lambdas es un t�rmino adoptado de la programaci�n funcional y corresponden con funciones de Java que normalmente son an�nimas y se escriben en l�nea all� donde se usan. Como cualquier funci�n recibe cero o m�s argumentos y devuelven uno o ning�n valor de retorno. Como cualquier funci�n, puede consumir m�todos de otras clases y objetos. Al declararse al mismo tiempo en donde se usa, puede acceder a las variables locales del �mbito al que pertenece, pero s�lo podr� usar estos como valores de s�lo lectura, impidiendo realizar alguna modificaci�n.

Las funciones lambdas se crearon a partir de la versi�n Java 8, por lo que no es posible usar su sintaxis en versiones anteriores. Sus entidades principales est�n contenidas en el package java.util.funcional. S� hay que decir, que no aportan una funcionalidad que no pueda hacerse con Java pre 8, simplemente es una manera m�s compacta de escribir c�digo Java. Se puede decir de manera resumida que una funci�n lambda es como una clase con un �nico m�todo p�blico. As� que los que no dispongan de Java 8 podr�an simular un comportamiento similar creando clases parecidas a las proporcionadas con el API de Java en el package java.util.functional.


## Sintaxis
Una expresion lambda se compone de:
   
1. Listado de parametros separados por comas y encerrados en parentesis: <b>(int a, int b)</b>
2. El simbolo de flecha hacia la derecha: <b>-></b>
3. Un cuerpo que puede ser un bloque de codigo encerrado entre llaves o una sola expresion: <b>	a + b</b>
	
	Ej: (a, b) �>  a + b


 	