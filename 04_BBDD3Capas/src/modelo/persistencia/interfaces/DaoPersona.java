package modelo.persistencia.interfaces;

import java.util.List;

import modelo.entidad.Persona;

public interface DaoPersona {
	boolean alta(Persona p);
	boolean baja(int id);
	boolean modificar(Persona p);
	Persona obtener(int id);
	List<Persona> listar();
}
