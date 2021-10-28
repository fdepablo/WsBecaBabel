package es.curso.babel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.curso.babel.model.entity.Videojuego;
import es.curso.babel.model.service.VideojuegoService;

@Controller
public class VideojuegoController {
	
	@Autowired
	private VideojuegoService vs;
	
	@GetMapping("mostrarVideojuegos")
	public String mostrarVideojuegos(Model model) {
		List<Videojuego> lista = vs.getAllVideojuegos();
		model.addAttribute("videojuegos",lista);
		return "videojuegos";
	}
	
	@GetMapping("VideojuegoDetalleController")
	public String detalleVideojuego(@RequestParam("id") int id, Model model) {
		Videojuego v = vs.findVideojuegoById(id);
		model.addAttribute("videojuego",v);
		return "videojuegoDetalle";
	}
}
