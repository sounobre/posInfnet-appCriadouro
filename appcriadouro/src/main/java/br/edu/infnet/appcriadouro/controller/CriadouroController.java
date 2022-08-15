package br.edu.infnet.appcriadouro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CriadouroController {
	
	@GetMapping(value = "/criadouro/lista")
	public String telaLista() {
		return "criadouro/lista";
	}
}
