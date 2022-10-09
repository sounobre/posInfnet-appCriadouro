package br.edu.infnet.appcriadouro.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcriadouro.AppAves;
import br.edu.infnet.appcriadouro.model.domain.Usuario;
import br.edu.infnet.appcriadouro.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	private static Map<String, Usuario> mapaUsuario = new HashMap<>();

	public Usuario validar(String email, String senha) {

		Usuario usuario = mapaUsuario.get(email);

		if (usuario != null && senha.equalsIgnoreCase(usuario.getSenha())) {
			return usuario;
		}
		return null;
	}

	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
		mapaUsuario.put(usuario.getEmail(), usuario);

		AppAves.relatorio("Inclusão do usuário " + usuario.getNome() + "Realizada com sucesso!!!", usuario);
	}

	public void excluir(String email) {

		mapaUsuario.remove(email);

	}

	public Collection<Usuario> obterLista() {
		return mapaUsuario.values();
	}

}
