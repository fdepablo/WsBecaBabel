package spel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spel.entity.Computer;
import spel.repository.OrdenadorRepository;
import spel.service.OrdenadorService;

public class OrdenadorServiceImpl implements OrdenadorService {
	
	@Autowired
	private OrdenadorRepository ordenadorRepo;

	@Override
	public String guardarOrdenador(Computer ordenador) {
		if (ordenadorRepo.guardarOrdenador(ordenador))
			return "Objeto guardado Correctamente en el fichero 'Ordenador.txt'\n"
					+ "Refresque el proyecto para visualizarlo";
		else
			return "Error al guardar el objeto";
		
	}

}
