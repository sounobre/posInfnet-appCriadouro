package br.edu.infnet.appcriadouro;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcriadouro.model.domain.Responsavel;

@Component
@Order(1)
public class ResponsavelTeste  implements ApplicationRunner{
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Responsavel r1= new Responsavel("Diego Nobre","sounobre@hotmail.com", "12345678910");
		System.out.println(r1);
		
		Responsavel r2= new Responsavel("Ronaldo Matias","matias@hotmail.com", "23456789101");
		System.out.println(r2);
		
		Responsavel r3= new Responsavel("Rogerio Neri","rneri@hotmail.com", "34567891011");
		System.out.println(r3);		
	}

}
