package br.edu.infnet.appcriadouro.model.service;

import org.springframework.stereotype.Service;

import br.edu.infnet.appcriadouro.model.domain.app.Projeto;
import br.edu.infnet.appcriadouro.model.test.AppImpressao;

@Service
public class AppService {
	
private Projeto projeto;
	
	public void incluir(Projeto projeto) {
		this.projeto = projeto;
		
		AppImpressao.relatorio("Exibição do Projeto" + projeto.getNome() + " realizada com sucesso!!!", projeto);
	}
	
	public Projeto obterProjeto() {
		return projeto;
	}

}
