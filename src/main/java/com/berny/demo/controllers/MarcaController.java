package com.berny.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/marca")
public class MarcaController {
	@RequestMapping("/")
	public String inicio() {
		return "marca/index";
	}
	
}
