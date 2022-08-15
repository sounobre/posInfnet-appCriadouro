package br.edu.infnet.appcriadouro;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcriadouro.model.domain.Canario;

@Component
@Order(3)
public class CanarioTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println();
		System.out.println("######Canário######");
		System.out.println();
		
		Canario c1 = new Canario();
		c1.setDtNascimento("20/04/2022"); 
		c1.setAnilha(1);
		c1.setNome("Hermes");
		c1.setTipo("Cor");
		c1.setRaca("Salsa");
		c1.setClassificacao("B-");
		
		AppAves.relatorio("Inclusão do pássaro Hermes", c1);
		System.out.println();

		Canario c2 = new Canario();
		c2.setDtNascimento("22/10/2022");
		c2.setAnilha(2);
		c2.setNome("Renato");
		c2.setTipo("Timbre");
		c2.setRaca("Timbrado Espanhol");
		c2.setClassificacao("A-");
		
		AppAves.relatorio("Inclusão do pássaro Renato", c2);
		System.out.println();

		Canario c3 = new Canario();
		c3.setDtNascimento("25/10/2020");
		c3.setAnilha(2);
		c3.setNome("Arnoldo");
		c3.setTipo("Porte");
		c3.setRaca("Gloster");
		c3.setClassificacao ("A-");
		
		AppAves.relatorio("Inclusão do pássaro Arnoldo", c3);

	}

}
