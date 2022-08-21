package br.edu.infnet.appcriadouro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appcriadouro.AppAves;
import br.edu.infnet.appcriadouro.model.domain.Ave;

@Controller
public class AveController {

	private static Map<Integer, Ave> mapaAve = new HashMap<>();
	private static Integer id = 1;

	public static void incluir(Ave ave) {
		ave.setId(id++);
		mapaAve.put(ave.getId(), ave);

		AppAves.relatorio("Inclusão do pássaro " + ave.getNome(), ave);
	}

	public static Collection<Ave> obterLista() {
		return mapaAve.values();
	}

	private static void excluir(Integer id) {
		mapaAve.remove(id);

	}

	@GetMapping(value = "/ave/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", obterLista());

		return "ave/lista";
	}

	@GetMapping(value = "/ave/{id}/excluir")
	private String exclusao(@PathVariable Integer id) {

		excluir(id);

		return "redirect:/ave/lista";

	}
}
