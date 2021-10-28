package es.curso.babel.model.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import es.curso.babel.model.entity.Usuario;
import es.curso.babel.model.repository.UsuarioRepository;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {
	
	@Autowired
	@Qualifier("listaUsuariosMarvel")
	private List<Usuario> inMemoryUsuarios;

	@Override
	public boolean isUsuarioRegistered(String username, String password) {
		
		for (Usuario u: inMemoryUsuarios) {
			if (username.equals(u.getUsername()) &&
					password.equals(u.getPassword())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Usuario> getAllUsuarios() {
		return inMemoryUsuarios;
	}

}
