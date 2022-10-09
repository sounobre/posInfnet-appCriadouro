package br.edu.infnet.appcriadouro.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcriadouro.model.domain.Responsavel;
import br.edu.infnet.appcriadouro.model.domain.Usuario;
import br.edu.infnet.appcriadouro.model.repository.ResponsavelRepository;
import br.edu.infnet.appcriadouro.model.test.AppImpressao;

@Service
public class ResponsavelService {
	
	@Autowired
	private ResponsavelRepository responsavelRepository;

	public void incluir(Responsavel responsavel) {
		responsavelRepository.save(responsavel);

		AppImpressao.relatorio("Inclusão do responsavel " + responsavel.getNome() + " realizada com sucesso!!!", responsavel);
	}
	
	public Collection<Responsavel> obterLista(){
		return (Collection<Responsavel>) responsavelRepository.findAll();
	}
	
	public Collection<Responsavel> obterLista(Usuario usuario){
		return responsavelRepository.obterLista(usuario.getId());
	}
	
	public void excluir(Integer id){
		responsavelRepository.deleteById(id);
	}	

}
