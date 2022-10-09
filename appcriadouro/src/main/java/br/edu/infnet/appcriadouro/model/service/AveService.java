package br.edu.infnet.appcriadouro.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcriadouro.model.domain.Ave;
import br.edu.infnet.appcriadouro.model.domain.Usuario;
import br.edu.infnet.appcriadouro.model.repository.AveRepository;

@Service
public class AveService {
	@Autowired
	private AveRepository aveRepository;

	public List<Ave> obterLista(){
		return (List<Ave>) aveRepository.findAll();
	}

	public List<Ave> obterLista(Usuario usuario){
		return (List<Ave>) aveRepository.findAll(usuario.getId());
	}
	
	public void excluir(Integer id) {
		aveRepository.deleteById(id);
	}
}
