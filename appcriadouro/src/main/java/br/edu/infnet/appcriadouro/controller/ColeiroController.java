package br.edu.infnet.appcriadouro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appcriadouro.AppAves;
import br.edu.infnet.appcriadouro.model.domain.Coleiro;

@Controller
public class ColeiroController {

	private static Map<Integer, Coleiro> mapaColeiro = new HashMap<>();
	private static Integer id = 1;

	public static void incluir(Coleiro coleiro) {
		coleiro.setId(id++);
		mapaColeiro.put(coleiro.getId(), coleiro);

		AppAves.relatorio("Inclusão do pássaro " + coleiro.getNome(), coleiro);
	}

	public static Collection<Coleiro> obterLista() {
		return mapaColeiro.values();
	}

	private static void excluir(Integer id) {
		mapaColeiro.remove(id);

	}

	@GetMapping(value = "/coleiro/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", obterLista());

		return "coleiro/lista";
	}

	@GetMapping(value = "/coleiro/{id}/excluir")
	private String exclusao(@PathVariable Integer id) {

		excluir(id);

		return "redirect:/coleiro/lista";

	}
}
