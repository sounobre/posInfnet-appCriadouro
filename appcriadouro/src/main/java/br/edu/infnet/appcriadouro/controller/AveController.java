package br.edu.infnet.appcriadouro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AveController {
	
	@GetMapping(value = "/ave/lista")
	public String telaLista() {
		return "ave/lista";
	}
}
