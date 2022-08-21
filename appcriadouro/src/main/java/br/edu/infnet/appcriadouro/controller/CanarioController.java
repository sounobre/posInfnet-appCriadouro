package br.edu.infnet.appcriadouro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appcriadouro.AppAves;
import br.edu.infnet.appcriadouro.model.domain.Canario;

@Controller
public class CanarioController {

	private static Map<Integer, Canario> mapaCanario = new HashMap<>();
	private static Integer id = 1;

	public static void incluir(Canario canario) {
		canario.setId(id++);
		mapaCanario.put(canario.getId(), canario);

		AppAves.relatorio("Inclusão do pássaro " + canario.getNome(), canario);
	}

	public static Collection<Canario> obterLista() {
		return mapaCanario.values();
	}

	private static void excluir(Integer id) {
		mapaCanario.remove(id);

	}

	@GetMapping(value = "/canario/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", obterLista());

		return "canario/lista";
	}

	@GetMapping(value = "/canario/{id}/excluir")
	private String exclusao(@PathVariable Integer id) {

		excluir(id);

		return "redirect:/canario/lista";

	}
}
