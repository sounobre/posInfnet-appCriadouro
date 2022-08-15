package br.edu.infnet.appcriadouro;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcriadouro.model.domain.Coleiro;

@Component
@Order(5)
public class ColeiroTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		System.out.println();
		System.out.println("######Coleiro######");
		System.out.println();
		
		Coleiro c1 = new Coleiro();
		c1.setDtNascimento("2021-10-01");
		c1.setAnilha(1);
		c1.setNome("Trovão");
		c1.setCantPorMin(3);
		c1.setCantTuiTui(true);
		c1.setRegiao("Sudeste");

		AppAves.relatorio("Inclusão do pássaro Trovão" ,c1);
		System.out.println();

		Coleiro c2 = new Coleiro();
		c2.setDtNascimento("2021-09-22");
		c2.setAnilha(2);
		c2.setNome("Palha");
		c2.setCantPorMin(4);
		c2.setCantTuiTui(false);
		c2.setRegiao("Norte");

		AppAves.relatorio("Inclusão do pássaro Palha" ,c2);
		System.out.println();

		Coleiro c3 = new Coleiro();
		c3.setDtNascimento("2022-10-25");
		c3.setAnilha(3);
		c3.setNome("Dengoso");
		c3.setCantPorMin(6);
		c3.setCantTuiTui(false);
		c3.setRegiao("Nordeste");

		AppAves.relatorio("Inclusão do pássaro Dengoso" ,c3);
		System.out.println();
	}

}
