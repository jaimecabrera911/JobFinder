package com.jobapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

@RequestMapping("/categorias")
public class CategoriaController {
	
	//Metodo 1
	
	@RequestMapping(value = { "/lista"}, method = RequestMethod.GET)
	public String listaCategorias() {
		return "/views/categorias/listaCategoria";
	}
	
	@RequestMapping(value = { "/crear"}, method = RequestMethod.GET)
	public String frmCategoria() {
		return "/views/categorias/frmCategoria";
	}
	
	@RequestMapping(value = { "/guardar"}, method = RequestMethod.POST)
	public String crearCategoria() {
		return "/views/categorias/listaCategoria";
	}

}
