package br.edu.infnet.appcriadouro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcriadouro.model.domain.Curio;
import br.edu.infnet.appcriadouro.model.domain.Usuario;
import br.edu.infnet.appcriadouro.model.service.CurioService;

@Controller
public class CurioController {


	@Autowired
	private CurioService curioService;

	@GetMapping(value = "/curio/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listagem", curioService.obterLista(usuario));
		
		return "curio/lista";
	}
	
	@GetMapping(value = "/curio")
	public String telaCadastro() {
		return "curio/cadastro";
	}
	
	@PostMapping(value = "/curio/incluir")
	public String incluir(Curio curio, @SessionAttribute("user") Usuario usuario) {
		
		curio.setUsuario(usuario);
		
		curioService.incluir(curio);
		
		return "redirect:/curio/lista";
	}
	
	@GetMapping(value = "/curio/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		curioService.excluir(id);
		
		return "redirect:/curio/lista";
	}
}
