package com.jobapp.controller;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vacantes")
public class VacanteController {

	@GetMapping("/{id}/{fecha}")
	public String listaVacantes(@PathVariable("id") int idVacante,
			@PathVariable("fecha") @DateTimeFormat(pattern = "ddMMyyyy") Date fecha, Model model) {

		model.addAttribute("id", idVacante);
		model.addAttribute("fecha", fecha);
		return "views/vacantes/detalleVacantes";
	}

}
