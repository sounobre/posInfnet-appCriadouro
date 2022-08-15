package br.edu.infnet.appcriadouro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ColeiroController {
	
	@GetMapping(value = "/coleiro/lista")
	public String telaLista() {
		return "coleiro/lista";
	}
}
