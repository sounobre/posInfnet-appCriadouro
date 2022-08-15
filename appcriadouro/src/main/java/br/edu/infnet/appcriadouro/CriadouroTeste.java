package br.edu.infnet.appcriadouro;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcriadouro.model.domain.Criadouro;

@Component
@Order(2)
public class CriadouroTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Criadouro c1 = new Criadouro();		
		c1.setEndereco("Rua da criação de canario Nº 1");
		c1.setNome("Plantel dos canários");
		c1.setTpAve("Canário");
		AppAves.relatorio("Inserindo criadouro 1", c1);
		
		Criadouro c2 = new Criadouro();		
		c2.setEndereco("Rua da criação de curió Nº 1");
		c2.setNome("Plantel dos curiós");
		c2.setTpAve("Coleiro");
		AppAves.relatorio("Inserindo criadouro 2", c2);
		
		Criadouro c3 = new Criadouro();		
		c3.setEndereco("Rua da criação de coleiro Nº 1");
		c3.setNome("Plantel dos coleitos");
		c3.setTpAve("Curió");
		AppAves.relatorio("Inserindo criadouro 3", c3);	
	}

}
