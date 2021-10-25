package es.curso.modelo.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.curso.modelo.entidad.Pelicula;

//Para crear un repositorio mediante JPA-Data debemos de crear una interfaz
//que extienda de JpaRepository.
//Esta interfaz esta parametrizada con dos tipos
//1. Sería la entidad con la que vamos a trabajar
//2. El tipo de la clave primaria de la interfaz.

//No es necesario que tenga la anotacion @Repository pero si que en el fichero
//de configuración este la anotacion @EnableJpaRepositories
@Repository
public interface DaoPeliculaJPAData extends JpaRepository<Pelicula, Integer>{

	//Si empieza por findBy hacemos busquedas por ese campo
	List<Pelicula> findByTitulo(String titulo);
	
	//Adminte operadores logicos And y Or entre atributos
	List<Pelicula> findByTituloAndGenero(String titulo, String genero);
	
	//Ordenar OrderBy y ademas en Asc o Desc
	//podrimos usar findBy tambien
	public List<Pelicula> findAllByOrderByTituloAsc();
	
	//Si queremos que busque por cadenas que contanga el titulo o el genero
	List<Pelicula> findByTituloContaining(String titulo);
	List<Pelicula> findByTituloAndGeneroContaining(String titulo, String genero);
	
	//Si queremos que busque por cadenas ignorando mayusculas y minusculas
	List<Pelicula> findByTituloIgnoreCase(String titulo);
	List<Pelicula> findByTituloAndGeneroIgnoreCase(String titulo, String genero);
	
	//Si queremos que busque por cadenas que contanga el titulo o el genero
	//y que no importa que sean mayusculas y minusculas
	List<Pelicula> findByTituloIgnoreCaseContaining(String titulo);
	List<Pelicula> findByTituloAndGeneroIgnoreCaseContaining(String titulo, String genero);
		
	//JPQL
	@Query("select p from Pelicula p where p.genero=?1")
	List<Pelicula> findByMovidaDeLaMuerte(String genero);
}
