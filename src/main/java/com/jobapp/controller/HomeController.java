package com.jobapp.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jobapp.model.Vacante;

@Controller
@RequestMapping
public class HomeController {

	@GetMapping("/")
	public String index(Model model) {

		/*
		 * model.addAttribute("mensaje", "Bienvenido a Empleos App");
		 * model.addAttribute("fecha",new Date());
		 */
		String nombre = "Desarrollador Web";
		Date fechaPub = new Date();
		double salario = 3500000;
		boolean vigente = true;

		model.addAttribute("nombre", nombre);
		model.addAttribute("fechaPub", fechaPub);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);

		return "home";
	}

	@GetMapping("/listado")
	public String lista(Model model) {
		List<String> lista = new LinkedList<>();
		lista.add("Desarrollador Web");
		lista.add("Desarrollador Jr");
		lista.add("Desarrollador Senior");
		lista.add("Desarrollador Full Stack");
		model.addAttribute("empleos", lista);
		return "lista";
	}

	@GetMapping("/detalle")
	public String vacante(Model model) {

		Vacante vacante = new Vacante();
		vacante.setId(1L);
		vacante.setNombre("Desarrollador Full Stack");
		vacante.setDescripcion(
				"Encargado de manejar cada uno de los aspectos relacionados con la creación y el mantenimiento de una aplicación web. "
						+ "Para ello es fundamental que el desarrollador Full Stack tenga conocimientos en desarrollo Front-End y Back-End.");
		vacante.setSalario(3500000.0);
		vacante.setFecha(new Date());

		model.addAttribute("vacante", vacante);

		return "detalle";
	}

}
