package br.edu.infnet.appcriadouro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appcriadouro.AppAves;
import br.edu.infnet.appcriadouro.model.domain.Criadouro;

@Controller
public class CriadouroController {

	private static Map<Integer, Criadouro> mapaCriadouro = new HashMap<>();
	private static Integer id = 1;

	public static void incluir(Criadouro criadouro) {
		criadouro.setId(id++);
		mapaCriadouro.put(criadouro.getId(), criadouro);

		AppAves.relatorio("Inclusão do criadouro " + criadouro.getNome(), criadouro);
	}

	public static Collection<Criadouro> obterLista() {
		return mapaCriadouro.values();
	}

	private static void excluir(Integer id) {
		mapaCriadouro.remove(id);

	}

	@GetMapping(value = "/criadouro/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", obterLista());

		return "criadouro/lista";
	}

	@GetMapping(value = "/criadouro/{id}/excluir")
	private String exclusao(@PathVariable Integer id) {

		excluir(id);

		return "redirect:/criadouro/lista";

	}
}
