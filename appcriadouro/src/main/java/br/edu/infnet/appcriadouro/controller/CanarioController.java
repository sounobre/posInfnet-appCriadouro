package br.edu.infnet.appcriadouro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CanarioController {
	
	@GetMapping(value = "/canario/lista")
	public String telaLista() {
		return "canario/lista";
	}
}
