package interfaz;

import entidad.Vehiculo;

//Interfaz que sera implementada por la entidad Vehiculo
public interface Movible {

	//Por defecto los atributos declarados dentro de una interfaz son final
	int metros = 10;//Valor por defecto para los metros recorridos
	
	//Metodo que por defecto tendran todos los objetos Vehiculos y aquellos que hereden de ella
	default void movimiento() {
		//Nos mostrara por pantalla un texto dandonos el nombre del vehiculo y los metros recorridos
		
		if(this instanceof Vehiculo) {
			Vehiculo v = (Vehiculo)this;
			System.out.println("El vehiculo " +v.getNombre() + " se ha movido " + metros + " metros por la carretera.");
		}
	}		
}