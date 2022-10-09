package br.edu.infnet.appcriadouro.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcriadouro.model.domain.Coleiro;
import br.edu.infnet.appcriadouro.model.domain.Usuario;
import br.edu.infnet.appcriadouro.model.repository.ColeiroRepository;
import br.edu.infnet.appcriadouro.model.test.AppImpressao;

@Service
public class ColeiroService {
	
	@Autowired
	private ColeiroRepository coleiroRepository;

	public void incluir(Coleiro coleiro) {		
		coleiroRepository.save(coleiro);
		
		AppImpressao.relatorio("Inclusão da coleiro " + coleiro.getNome() + " realizada com sucesso!!!", coleiro);
	}
	
	public Collection<Coleiro> obterLista(){
		return (Collection<Coleiro>) coleiroRepository.findAll();
	}
	
	public Collection<Coleiro> obterLista(Usuario usuario){
		return (Collection<Coleiro>) coleiroRepository.findAll(usuario.getId());
	}

	public void excluir(Integer id){
		coleiroRepository.deleteById(id);		
	}

}
