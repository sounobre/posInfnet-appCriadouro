package br.edu.infnet.appcriadouro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appcriadouro.AppAves;
import br.edu.infnet.appcriadouro.model.domain.Curio;

@Controller
public class CurioController {

	private static Map<Integer, Curio> mapaCurio = new HashMap<>();
	private static Integer id = 1;

	public static void incluir(Curio curio) {
		curio.setId(id++);
		mapaCurio.put(curio.getId(), curio);

		AppAves.relatorio("Inclusão do pássaro " + curio.getNome(), curio);
	}

	public static Collection<Curio> obterLista() {
		return mapaCurio.values();
	}

	private static void excluir(Integer id) {
		mapaCurio.remove(id);

	}

	@GetMapping(value = "/curio/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", obterLista());

		return "curio/lista";
	}

	@GetMapping(value = "/curio/{id}/excluir")
	private String exclusao(@PathVariable Integer id) {

		excluir(id);

		return "redirect:/curio/lista";

	}
}
