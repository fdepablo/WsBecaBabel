package serviciorest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import serviciorest.modelo.entidad.Videojuego;
import serviciorest.modelo.persistencia.DaoVideojuego;

@SpringBootApplication
public class Ej23VideojuegoRestApplication implements CommandLineRunner{

	@Autowired
	private DaoVideojuego daoVideojuego;
	
	public static void main(String[] args) {
		SpringApplication.run(Ej23VideojuegoRestApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		Videojuego v1 = new Videojuego();
		v1.setNombre("Sonic");
		v1.setPrecio(60);
		v1.setCompania("Sega");
		v1.setNotaMedia(9);
		
		daoVideojuego.save(v1);
		
		v1 = new Videojuego();
		v1.setNombre("Mario");
		v1.setPrecio(70);
		v1.setCompania("Nintendo");
		v1.setNotaMedia(9);
		
		daoVideojuego.save(v1);*/
	}

}
