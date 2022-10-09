package br.edu.infnet.appcriadouro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcriadouro.model.domain.Usuario;
import br.edu.infnet.appcriadouro.model.service.AveService;

@Controller
public class AveController {

	@Autowired
	private AveService aveService;

	@GetMapping(value = "/ave/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listagem", aveService.obterLista(usuario));
		
		return "ave/lista";
	}

	@GetMapping(value = "/ave/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		aveService.excluir(id);
		
		return "redirect:/ave/lista";
	}
}
