package es.curso.modelo.persistencia;

import java.util.ArrayList;

import es.curso.modelo.entidad.Cliente;

public interface DaoCliente {
	
	int insertarCliente(Cliente c);

	int modificarCliente(Cliente c, int id);

	int borrar(int id);

	Cliente buscarID(int id);

	ArrayList<Cliente> buscarNombre(String nombre);
	
	ArrayList<Cliente> listarCliente();
}
