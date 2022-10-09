package br.edu.infnet.appcriadouro.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcriadouro.model.domain.Criadouro;
import br.edu.infnet.appcriadouro.model.domain.Usuario;
import br.edu.infnet.appcriadouro.model.repository.CriadouroRepository;
import br.edu.infnet.appcriadouro.model.test.AppImpressao;

@Service
public class CriadouroService {


	@Autowired
	private CriadouroRepository criadouroRepository;

	public void incluir(Criadouro criadouro) {
//		criadouro.setDtCriaddouro(LocalDateTime.t);
		criadouroRepository.save(criadouro);

		AppImpressao.relatorio("Inclusão do criadouro " + criadouro.getNome() + " realizada com sucesso!!!", criadouro);
	}
	
	public Collection<Criadouro> obterLista(){
		return (Collection<Criadouro>) criadouroRepository.findAll();
	}
	
	public Collection<Criadouro> obterLista(Usuario usuario){
		return (Collection<Criadouro>) criadouroRepository.findAll(usuario.getId());
	}

	public void excluir(Integer id){
		criadouroRepository.deleteById(id);
	}
}
