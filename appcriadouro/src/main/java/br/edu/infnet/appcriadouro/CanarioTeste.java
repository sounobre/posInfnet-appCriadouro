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
		Canario c1 = new Canario();
		c1.setDtNascimento("2020-08-01");
		c1.setAnilha(1);
		c1.setNome("Hermes");
		c1.setTipo("Cor");
		c1.setRaca("Salsa");
		c1.setClassificacao("B-");
		System.out.println(c1);

		Canario c2 = new Canario();
		c2.setDtNascimento("2020-09-22");
		c2.setAnilha(2);
		c2.setNome("Renato");
		c2.setTipo("Timbre");
		c2.setRaca("Timbrado Espanhol");
		c2.setClassificacao("A-");
		System.out.println(c2);

		Canario c3 = new Canario();
		c3.setDtNascimento("2020-10-25");
		c3.setAnilha(3);
		c3.setNome("Hecules");
		c3.setTipo("Porte");
		c3.setRaca("Gloster");
		c3.setClassificacao("C+");
		System.out.println(c3);

	}

}
