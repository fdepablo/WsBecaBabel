package persona;

//OJO con la manera de importar los asserts, son metodos estaticos de la clase
//Assert y por tanto hay que importarlos de manera estatica (import static)

//import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import modelo.entidad.Persona;


class PersonaTest {

	/**
	 * En esta prueba unitaria debemos de probar que nuestro metodo 
	 * "setNombre" de la clase persona funciona adecuadamente. 
	 * 
	 * Un metodo funciona adecuadamente cuando hace lo que
	 * tiene que hacer, es decir, cuando nos devuelve lo que nosotros
	 * esperamos que nos devuelva
	 * 
	 * Para probar un metodo adecuadamente tenemos dos opciones:
	 * 
	 * opcion 1, si la documentacion esta bien hecha, con leer la 
	 * documentación y hacer todos los casos que me dice sería 
	 * suficiente
	 * 
	 * opcion 2, si la dccumentacion no está bien hecha o no existe
	 * entonces no nos queda más remedio que entender el metodo para
	 * poder probarlo.
	 * 
	 * Para probar que "setNombre" funciona bien, debemos de pasar 
	 * por todos los casos del metodo (o por todas las lineas)
	 * 
	 * Una buena regla para desarrollar código es hacer el metodo, 
	 * solo la definicion, luego hacer la documentacion del método 
	 * (Java doc), luego implementarlo y por ultimo hacer su prueba 
	 * unitaria. De hecho esto se retroalimenta y es muy probable que 
	 * al pasar la prueba tengas que cambiar la documentacion y la 
	 * implementacion
	 * 
	 * En esta prueba unitaria vamos a probar el metodo "setNombre"
	 */
	@Test
	public void testSetNombre(){
		
		Persona p1 = new Persona();
		p1.setNombre("Goku");
		//el nombre tiene que estar puesto a Goku
		
		//Espero que el nombre sea Goku, y lo compruebo con el nombre 
		//que hay en el objeto
		assertEquals("Goku", p1.getNombre());
		
		p1.setNombre("ana");
		//el nombre tiene que estar puesto a Goku
		
		
		//Espero que el nombre sea "", y lo compruebo con el nombre 
		//que hay en el objeto
		assertEquals("", p1.getNombre());
		
		//Podemos pasar mas pruebas, no tienen porque estar de más
		p1.setNombre("az");
		assertEquals("", p1.getNombre());
		
		p1.setNombre("a");
		assertEquals("", p1.getNombre());
		
		p1.setNombre("Pikolo");
		assertEquals("Pikolo", p1.getNombre());
	}
	
	
}


