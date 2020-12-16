package com.jobapp.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {

        /*
        model.addAttribute("mensaje", "Bienvenido a Empleos App");
    	model.addAttribute("fecha",new Date());
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

}
