package br.edu.infnet.appcriadouro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResponsavelController {
	
	@GetMapping(value = "/responsavel/lista")
	public String telaLista() {
		return "responsavel/lista";
	}
}
