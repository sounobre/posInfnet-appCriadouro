package br.edu.infnet.appcriadouro;


import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcriadouro.controller.CriadouroController;
import br.edu.infnet.appcriadouro.model.domain.Ave;
import br.edu.infnet.appcriadouro.model.domain.Canario;
import br.edu.infnet.appcriadouro.model.domain.Coleiro;
import br.edu.infnet.appcriadouro.model.domain.Criadouro;
import br.edu.infnet.appcriadouro.model.domain.Curio;
import br.edu.infnet.appcriadouro.model.domain.Responsavel;

@Component
@Order(2)
public class CriadouroTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Canario ac1 = new Canario();
		ac1.setDtNascimento("20/04/2022"); 
		ac1.setAnilha(1);
		ac1.setNome("Hermes");
		ac1.setTipo("Cor");
		ac1.setRaca("Salsa");
		ac1.setClassificacao("B-");
		
		Coleiro ac2 = new Coleiro();
		ac2.setDtNascimento("2021-09-22");
		ac2.setAnilha(2);
		ac2.setNome("Palha");
		ac2.setCantPorMin(4);
		ac2.setCantTuiTui(false);
		ac2.setRegiao("Norte");
		
		Curio ac3 = new Curio();
		ac3.setDtNascimento("2022-06-25");
		ac3.setAnilha(3);
		ac3.setNome("Painço");
		ac3.setCantPraia(false);
		ac3.setCategoria("Fibra");
		ac3.setTempCantMin(4);
		
		
		Set<Ave> lsAves1 = new HashSet<>();
		lsAves1.add(ac1);
		lsAves1.add(ac2);
		lsAves1.add(ac1);
		lsAves1.add(ac2);
		
		System.out.println();
		
		Responsavel r1= new Responsavel("Diego Nobre","sounobre@hotmail.com", "12345678910");
		Criadouro c1 = new Criadouro(r1);		
		c1.setEndereco("Rua da criação de canario Nº 1");
		c1.setNome("Plantel dos canários");
		c1.setTpAve("Canário");
		c1.setAves(lsAves1);
		
		CriadouroController.incluir(c1);
		
		
		Set<Ave> lsAves2 = new HashSet<>();
		lsAves1.add(ac2);
		lsAves1.add(ac2);
		
		
		Responsavel r2= new Responsavel("Ronaldo Matias","matias@hotmail.com", "23456789101");
		Criadouro c2 = new Criadouro(r2);		
		c2.setEndereco("Rua da criação de curió Nº 1");
		c2.setNome("Plantel dos curiós");
		c2.setTpAve("Coleiro");
		c2.setAves(lsAves2);
		
		CriadouroController.incluir(c2);
		
		
		Set<Ave> lsAves3 = new HashSet<>();
		lsAves1.add(ac1);
		lsAves1.add(ac3);
		lsAves1.add(ac1);
		lsAves1.add(ac3);
		lsAves1.add(ac1);
		lsAves1.add(ac3);
		
		Responsavel r3= new Responsavel("Rogerio Neri","rneri@hotmail.com", "34567891011");
		Criadouro c3 = new Criadouro(r3);		
		c3.setEndereco("Rua da criação de coleiro Nº 1");
		c3.setNome("Plantel dos coleitos");
		c3.setTpAve("Curió");
		c3.setAves(lsAves3);

		CriadouroController.incluir(c3);
	}

}
