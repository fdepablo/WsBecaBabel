package es.curso.babel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.curso.babel.model.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService us;
	
	@GetMapping("login")
	public String mostrarLogin() {
		return "login";
	}
	
	@GetMapping("doLogin")
	public String doLogin(
			@RequestParam("username") String username,
			@RequestParam("password") String password,
			Model model) {
		
		boolean registrado = us.isUsuarioRegistered(username, password);
		
		if(registrado) {
			//cuando queremos mandar a un controlador podemos hacer un redirect
			return "redirect:mostrarVideojuegos";
		}else {
			//cuando queremos mandar a un jps hacemos un dispatcher normal
			model.addAttribute("error", "El usuario no esta registrado");
			return "login";
		}
	}
}
