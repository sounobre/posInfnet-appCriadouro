package br.edu.infnet.appcriadouro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcriadouro.model.domain.Criadouro;
import br.edu.infnet.appcriadouro.model.domain.Usuario;
import br.edu.infnet.appcriadouro.model.service.AveService;
import br.edu.infnet.appcriadouro.model.service.CriadouroService;
import br.edu.infnet.appcriadouro.model.service.ResponsavelService;

@Controller
public class CriadouroController {
	@Autowired
	private CriadouroService criadouroService;
	@Autowired
	private ResponsavelService responsavelService;
	@Autowired
	private AveService aveService;

	@GetMapping(value = "/criadouro")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("responsaveis", responsavelService.obterLista(usuario));
		model.addAttribute("aves", aveService.obterLista(usuario));

		return "criadouro/cadastro";
	}

	@GetMapping(value = "/criadouro/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("listagem", criadouroService.obterLista());

		return "criadouro/lista";
	}

	@PostMapping(value = "/criadouro/incluir")
	public String incluir(Criadouro criadouro, @SessionAttribute("user") Usuario usuario) {
		
		criadouro.setUsuario(usuario);
		
		criadouroService.incluir(criadouro);

		return "redirect:/criadouro/lista";
	}

	@GetMapping(value = "/criadouro/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		criadouroService.excluir(id);
		
		return "redirect:/criadouro/lista";
	}
}
