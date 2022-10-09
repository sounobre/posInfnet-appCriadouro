package br.edu.infnet.appcriadouro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcriadouro.model.domain.Responsavel;
import br.edu.infnet.appcriadouro.model.domain.Usuario;
import br.edu.infnet.appcriadouro.model.service.ResponsavelService;

@Controller
public class ResponsavelController {


	@Autowired
	private ResponsavelService responsavelService;
	
	private String mensagem;
	private String tipo;

	@GetMapping(value = "/responsavel/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario user) {

		model.addAttribute("listagem", responsavelService.obterLista(user));
		
		model.addAttribute("mensagem", mensagem);
		model.addAttribute("tipo", tipo);
		
		return "responsavel/lista";
	}
	
	@GetMapping(value = "/responsavel") 
	public String telaCadastro() {
		return "responsavel/cadastro";
	}
	
	@PostMapping(value = "/responsavel/incluir")
	public String incluir(Responsavel responsavel, @SessionAttribute("user") Usuario usuario) {
		
		responsavel.setUsuario(usuario);
		
		responsavelService.incluir(responsavel);
		
		mensagem = "Inclusão do responsavel " + responsavel.getNome() + " realizada com sucesso!";
		tipo = "alert-success";
		
		return "redirect:/responsavel/lista";
	}
		
	@GetMapping(value = "/responsavel/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		try {
			responsavelService.excluir(id);
			
			mensagem = "Exclusão do responsavel " + id + " realizada com sucesso!";
			tipo = "alert-success";
		} catch (Exception e) {
			mensagem = "Impossível realizar a exclusão do responsavel " + id + "!";
			tipo = "alert-danger";
		}
				
		return "redirect:/responsavel/lista";
		
		
		
		
	}
}
