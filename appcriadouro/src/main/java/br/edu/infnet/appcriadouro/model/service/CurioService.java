package br.edu.infnet.appcriadouro.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcriadouro.model.domain.Curio;
import br.edu.infnet.appcriadouro.model.domain.Usuario;
import br.edu.infnet.appcriadouro.model.repository.CurioRepository;
import br.edu.infnet.appcriadouro.model.test.AppImpressao;

@Service
public class CurioService {
	
	@Autowired
	private CurioRepository curioRepository;

	public void incluir(Curio curio) {		
		curioRepository.save(curio);
		
		AppImpressao.relatorio("Inclusão da curio " + curio.getNome() + " realizada com sucesso!!!", curio);
	}
	
	public Collection<Curio> obterLista(){
		return (Collection<Curio>) curioRepository.findAll();
	}
	
	public Collection<Curio> obterLista(Usuario usuario){
		return (Collection<Curio>) curioRepository.findAll(usuario.getId());
	}

	public void excluir(Integer id){
		curioRepository.deleteById(id);		
	}

}
