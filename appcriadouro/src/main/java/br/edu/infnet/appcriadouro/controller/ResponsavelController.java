package br.edu.infnet.appcriadouro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appcriadouro.AppAves;
import br.edu.infnet.appcriadouro.model.domain.Responsavel;

@Controller
public class ResponsavelController {

	private static Map<Integer, Responsavel> mapaResponsavel = new HashMap<>();
	private static Integer id = 1;

	public static void incluir(Responsavel responsavel) {
		responsavel.setId(id++);
		mapaResponsavel.put(responsavel.getId(), responsavel);

		AppAves.relatorio("Inclusão do pássaro " + responsavel.getNome(), responsavel);
	}

	public static Collection<Responsavel> obterLista() {
		return mapaResponsavel.values();
	}

	private static void excluir(Integer id) {
		mapaResponsavel.remove(id);

	}

	@GetMapping(value = "/responsavel/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", obterLista());

		return "responsavel/lista";
	}

	@GetMapping(value = "/responsavel/{id}/excluir")
	private String exclusao(@PathVariable Integer id) {

		excluir(id);

		return "redirect:/responsavel/lista";

	}
}
