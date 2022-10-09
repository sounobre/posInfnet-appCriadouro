package br.edu.infnet.appcriadouro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcriadouro.model.domain.Canario;
import br.edu.infnet.appcriadouro.model.domain.Usuario;
import br.edu.infnet.appcriadouro.model.service.CanarioService;

@Controller
public class CanarioController {



	@Autowired
	private CanarioService canarioService;

	@GetMapping(value = "/canario/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listagem", canarioService.obterLista(usuario));
		
		return "canario/lista";
	}
	
	@GetMapping(value = "/canario")
	public String telaCadastro() {
		return "canario/cadastro";
	}
	
	@PostMapping(value = "/canario/incluir")
	public String incluir(Canario canario, @SessionAttribute("user") Usuario usuario) {
		
		canario.setUsuario(usuario);
		
		canarioService.incluir(canario);
		
		return "redirect:/canario/lista";
	}
	
	@GetMapping(value = "/canario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		canarioService.excluir(id);
		
		return "redirect:/canario/lista";
	}
}
