package br.edu.infnet.appcriadouro.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcriadouro.model.domain.Canario;
import br.edu.infnet.appcriadouro.model.domain.Usuario;
import br.edu.infnet.appcriadouro.model.repository.CanarioRepository;
import br.edu.infnet.appcriadouro.model.test.AppImpressao;

@Service
public class CanarioService {

	@Autowired
	private CanarioRepository canarioRepository;

	public void incluir(Canario canario) {
		canarioRepository.save(canario);

		AppImpressao.relatorio("Inclusão da canario " + canario.getNome() + " realizada com sucesso!!!", canario);
	}

	public Collection<Canario> obterLista() {
		return (Collection<Canario>) canarioRepository.findAll();
	}

	public Collection<Canario> obterLista(Usuario usuario) {
		return (Collection<Canario>) canarioRepository.findAll(usuario.getId());
	}

	public void excluir(Integer id) {
		canarioRepository.deleteById(id);
	}

}
