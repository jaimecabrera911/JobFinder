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
    public String index(Model model){
    	
    	model.addAttribute("mensaje", "Bienvenido a Empleos App");
    	model.addAttribute("fecha",new Date());
        return "home";
    }

}
