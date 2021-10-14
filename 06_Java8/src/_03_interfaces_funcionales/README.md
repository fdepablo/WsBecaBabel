# Entidades funcionales
Concepto nuevo en Java SE 8 y que es la base para que podamos escribir expresiones lambda. Una interface funcional se define como una interface que tiene uno y solo un metodo abstracto y que este sea diferente a los metodos definidos en java.lang.Object (a saber: equals, hashcode, clone, etc.). 
La interface puede tener metodos por defecto y estaticos sin que esto afecte su condicion de ser interface funcional.

Existe una nueva anotacion denominada @FunctionalInterface que permite al compilador realizar la validacion de que la interface tenga solamente un metodo abstracto. 

## Entidades de java.util.functional
Antes de crear una funci�n de tipo lambda, conviene conocer las entidades b�sicas que componen esta manera de programar. Las principales entidades son interfaces con un �nico m�todo que debe implementar el programador y que estas implementaciones pueden hacerse llegar como argumentos de m�todos de otras muchas clases del API de Java. Hubo una gran modificaci�n de las clases existentes para aceptar este tipo de implementaciones all� donde tuviera sentido, como ocurre en las colecciones.

Las implementaciones de estas interfaces son del tipo, consume un valor y retorna otro tipo de valor, o produce un valor sin argumentos o produce un valor dados dos argumentos. A �stas se les llama unidades funcionales porque componen una l�gica interna que a priori el consumidor de esta l�gica no conoce, pero de la que s� se conoce su interfaz y por tanto la manera de relacionarse con el resto de los objetos, o lo que es lo mismo la manera de ser invocada. Aparece de nuevo el concepto de cajas negras en donde entran par�metros y salen resultados.

Las interfaces funcionales m�s importantes contenidas en java.util.functional son:

1. <b>Supplier<T>:</b> esta funci�n se debe utilizar cuando se necesiten generar objetos sin requerir argumentos. El metodo asociado de la interfaz ser�a get().
2. <b>Consumer<T>:</b> esta en cambio es el opuesto de Supplier ya que consume, acepta como argumento el tipo T sin devolver ning�n valor de retorno. El metodo asociado de la interfaz ser�a accept().
3. <b>Function<T,R>:</b> esta interfaz permite definir una funci�n que acepta un par�metro de tipo T y devuelve un resultado del tipo R pudiendo aplicarle alguna transformaci�n u operaci�n. El metodo asociado de la interfaz ser�a apply().
4. <b>BiFunction<T,R,S>:</b> esta interfaz permite definir una funci�n que acepta dos par�metros de tipo T y R, devolviendo un resultado del tipo S. Normalmente ser�n operaciones de agregaci�n u operadores binarios como la suma, resta, etc. El metodo asociado de la interfaz ser�a apply().
5. <b>Predicate<T>:</b> la interfaz predicado debe devolver forzosamente un boolean dado un objeto de tipo T, normalmente utilizado para filtrar elementos de una colecci�n. El metodo asociado de la interfaz ser�a test().

