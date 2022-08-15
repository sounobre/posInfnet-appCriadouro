package br.edu.infnet.appcriadouro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurioController {
	
	@GetMapping(value = "/curio/lista")
	public String telaLista() {
		return "curio/lista";
	}
}
