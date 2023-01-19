package com.mvcproject.proyectonuevo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class HomerController {

	@GetMapping("/")
    public String mostrarHomer(Model model) {
		model.addAttribute("mensaje", "Bienvenidos a parametro pasado por controlador a un Thymeleaf");
		model.addAttribute("edad", 31);
		return "home";
	}
}
