package es.curso.controlador;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import es.curso.modelo.entidad.Persona;
import es.curso.modelo.entidad.Saludo;

//Para dar de alta un controlador  y que FrontController sepa localizarlo
//usaremos la anotacion @Controller
@Controller
public class ControladorSaludo {
	
	@Autowired
	private Saludo saludoSession;
	
	//Mediante la anotacion @RequestMapping (que es propia de MVC) podemos
	//mapear URLs
	@RequestMapping("verFormularioSaludo")
	public String verFormulario() {
		//al devolver "formularioSaludo" usara el objeto viewResolver para formar
		//la direccion "/WEB-INF/vistas/formularioSaludo.jsp"
		return "formularioSaludo";
	}
	
	
	//Podemos en la anotacion @RequestMapping restringir el acceso al metodo
	//que queramos.
	
	//A los metodos anotados con anotaciones de SpringWeb podemos pasarle
	//por parametro muchos tipos de objetos.
	
	//1. Si anotamos un parametro de entrada con @RequestMapping, Spring
	//buscara un parametro con ese nombre para inyectarlo
	//2. Podemos tambien pasarle el objeto HttpServletRequest para obtener
	//parametos, datos, etc.
	//3. Podemos pasarle tambien directamente el objeto HttpSession
	//4. Podemos pasarle un objeto de tipo Model (o ModelAndView) para 
	//almacenar datos que mandaremos a la vista
	
	//Los metodos de Spring MVC pueden devolver String, ModelAndView o View
	@RequestMapping(path="saludo",method=RequestMethod.POST)
	public ModelAndView metodoSaludo(@RequestParam("nombre") String nombre,
			HttpServletRequest request, 
			HttpSession session,
			ModelAndView mav){
		
		String saludo = "Yo te saludo: " + nombre; 
		String nombreAux = request.getParameter("nombre");
		System.out.println(nombreAux);
		System.out.println(nombre);
		
		//Aqui irian las llamadas a los servicios o gestores
		Persona p = new Persona();
		p.setNombre(nombre);
		
		//podriamos acceder así a la lista, siempre y cuando 
		//hayamos creado la sesion como @Scope("session") NO como @SessionScope
		//((Saludos)session.getAttribute("saludos")).getListaSaludos().add(saludo);
		//pero es mas comodo si lo inyectamos con @Autowired
		saludoSession.getListaSaludos().add(saludo);
		
		System.out.println("Saludo session autowired " + saludoSession.getListaSaludos());
		//System.out.println("Saludo session de toda la vida " + ((Saludo)session.getAttribute("scopedTarget.saludo")).getListaSaludos());
		
		//Aqui le estamos mandando directamente a un controlador (el de más abajo)
		//en vez de pasar por el viewResolver.
		//Siempre que hagamos un redirect, no usaremos el view resolver de 
		//Spring, si no que mandaremos una peticion 300 a nuestro navegador
		//para que vaya a la URL que le mandemos.
		mav.setViewName("redirect:verSaludos");
		//ya que estamos haciendo un redirect, el nombre que metemos
		//en el objeto mav se va a mandar como parametro
		//de la request. Si no hicieramos un redirect, el nombre se guardaria en el 
		//objeto request
		mav.addObject("nombre",saludo);
		return mav;
	}
	
	//Podemos dar de alta URL con anotaciones que incluyan ya el verbo HTTP
	@GetMapping("verSaludos")
	public String mostrarSaludos(
			@RequestParam("nombre") String nombre,
			Model model) {
		//Como pasar datos del controlador a la vista
		Persona p = new Persona();
		p.setNombre(nombre);
		
		model.addAttribute("persona", p);
		model.addAttribute("listaSaludos", saludoSession.getListaSaludos());
		model.addAttribute("saludo", nombre);
		return "saludo";
	}
}
