package modelo.negocio;

import java.util.List;

import modelo.entidad.Coche;
//import modelo.persistencia.PersonaDaoDerby;
import modelo.persistencia.CocheDaoMySql;
import modelo.persistencia.DaoCoche;

//Aquí irian todas las reglas de negocio de nuestra aplicacion, se aplicarian
//antes de llamar a la BBDD. Por ejemplo si la persona tiene que tener al
//menos un nombre con 3 caracteres 

public class GestorCoche {
	
	//Aqui podemos jugar con cambiar el dao que queremos usar
	//podemos usar PersonaDaoDerby o PersonaDaoMySql
	//Gracias a las interfaces solo tenemos que cambiar el objeto
	DaoCoche cocheDao = new CocheDaoMySql();
	
	/*
	 * Una regla para hacer documentacion es explicar perfectamente los parametros
	 * de entrada y salida, pero tambien todos los posibles valores que devuelva
	 * 
	 */
	
	
	/**
	 * Metodo que da de alta un coche mediante un objeto de tipo DaoCoche.
	 * Parad dar de alta un coche se tiene que cumplir las siguientes condiciones
	 * <ul>
	 * 		<li>1- La <b>longitud de la matricula</b> es igual a 7 y no esta vacio</li>
	 * 		<li>2- La <b>marca del coche</b> no esta vacia</li>
	 * 		<li>3- El <b>modelo del coche</b> no esta vacio</li>
	 * </ul>
	 * @param p el coche que queremos dar de alta
	 * @return Devolvemos un entero representando como ha ido el alta del coche.
	 * El valor retornado será cumpliendo la siguiente tabla
	 * 	<ul>
	 * 		<li>0- El <b>coche</b> se ha dado de alta adecuadamente</li>
	 * 		<li>1- La <b>longitud de la matricula</b> es distinta de 7 </li>
	 * 		<li>2- La <b>marca del coche</b> esta vacia</li>
	 * 		<li>3- El <b>modelo del coche</b> esta vacio</li>
	 * 		<li>4- La <b>logitud de la matricula</b> esta vacia</li>
	 * 		<li>5- Ha ocurrido algun error con la BD</li>
	 * </ul>
	 */
	public int alta(Coche p){
		//aplicamos la regla de negocio
		if(p.getMatricula().length() != 7) {
			return 1;
		}else if(p.getMarca().isEmpty()) {
			return 2;
		}else if(p.getModelo().isEmpty()) {
			return 3;
		}else if(p.getMatricula().isEmpty()){
			return 4;
		}else {
			boolean resultado = cocheDao.alta(p);
			if(resultado == true) {
				return 0;
			}else {
				return 5;
			}
		}

	}
	
	public boolean baja(int id){
		boolean baja = cocheDao.baja(id);
		return baja;
	}
	
	/**
	 * Metodo que da de alta un coche mediante un objeto de tipo DaoCoche.
	 * Parad dar de alta un coche se tiene que cumplir las siguientes condiciones
	 * <ul>
	 * 		<li>1- La <b>longitud de la matricula</b> es igual a 7 y no esta vacio</li>
	 * 		<li>2- La <b>marca del coche</b> no esta vacia</li>
	 * 		<li>3- El <b>modelo del coche</b> no esta vacio</li>
	 * </ul>
	 * @param p el coche que queremos dar de alta
	 * @return Devolvemos un entero representando como ha ido el alta del coche.
	 * El valor retornado será cumpliendo la siguiente tabla
	 * 	<ul>
	 * 		<li>0- El <b>coche</b> se ha dado de alta adecuadamente</li>
	 * 		<li>1- La <b>longitud de la matricula</b> es distinta de 7 </li>
	 * 		<li>2- La <b>marca del coche</b> esta vacia</li>
	 * 		<li>3- El <b>modelo del coche</b> esta vacio</li>
	 * 		<li>4- La <b>logitud de la matricula</b> esta vacia</li>
	 * 		<li>5- Ha ocurrido algun error con la BD</li>
	 * </ul>
	 */
	public int modificar(Coche p){
		//aplicamos la regla de negocio
		if(p.getMatricula().length() != 7) {
			return 1;
		}else if(p.getMarca().isEmpty()) {
			return 2;
		}else if(p.getModelo().isEmpty()) {
			return 3;
		}else if(p.getMatricula().isEmpty()){
			return 4;
		}else {
			boolean resultado = cocheDao.alta(p);
			if(resultado == true) {
				return 0;
			}else {
				return 5;
			}
		}
	}
	
	public Coche obtener(int id){
		Coche persona = cocheDao.obtener(id);
		return persona;
	}
	
	public List<Coche> listar(){
		List<Coche> listaPersonas = cocheDao.listar();
		return listaPersonas;
	}
	
}