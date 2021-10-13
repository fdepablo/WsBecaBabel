package modelo.persistencia;

import java.util.List;

import modelo.entidad.Coche;

public interface DaoCoche {
	/**
	 * Metodo que da de alta un coche con el motor de la persistencia
	 * @param p el coche a dar de alta
	 * @return true en caso de que se haya persistido el coche, false en caso 
	 * contario
	 * 
	 */
	boolean alta(Coche p);
	boolean baja(int id);
	boolean modificar(Coche p);
	Coche obtener(int id);
	List<Coche> listar();
}