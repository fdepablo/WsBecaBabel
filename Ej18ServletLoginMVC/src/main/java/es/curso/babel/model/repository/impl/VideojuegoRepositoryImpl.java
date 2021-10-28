package es.curso.babel.model.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.curso.babel.model.entity.Videojuego;
import es.curso.babel.model.repository.VideojuegoRepository;

@Repository
public class VideojuegoRepositoryImpl implements VideojuegoRepository {
	
	@Autowired
	private List<Videojuego> inMemoryVideojuegos;

	@Override
	public List<Videojuego> getAllVideojuegos() {
		return inMemoryVideojuegos;
	}

	@Override
	public Videojuego findVideojuegoById(int id) {
		
		for (Videojuego v: inMemoryVideojuegos) {
			if (v.getId() == id) {
				return v;
			}
		}
		
		return null;
	}
	

}
