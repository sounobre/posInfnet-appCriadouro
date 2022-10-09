package br.edu.infnet.appcriadouro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcriadouro.model.domain.Coleiro;
import br.edu.infnet.appcriadouro.model.domain.Usuario;
import br.edu.infnet.appcriadouro.model.service.ColeiroService;

@Controller
public class ColeiroController {


	@Autowired
	private ColeiroService coleiroService;

	@GetMapping(value = "/coleiro/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listagem", coleiroService.obterLista(usuario));
		
		return "coleiro/lista";
	}
	
	@GetMapping(value = "/coleiro")
	public String telaCadastro() {
		return "coleiro/cadastro";
	}
	
	@PostMapping(value = "/coleiro/incluir")
	public String incluir(Coleiro coleiro, @SessionAttribute("user") Usuario usuario) {
		
		coleiro.setUsuario(usuario);
		
		coleiroService.incluir(coleiro);
		
		return "redirect:/coleiro/lista";
	}
	
	@GetMapping(value = "/coleiro/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		coleiroService.excluir(id);
		
		return "redirect:/coleiro/lista";
	}
}
