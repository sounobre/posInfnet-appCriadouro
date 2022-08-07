package br.edu.infnet.appcriadouro;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcriadouro.model.domain.Curio;

@Component
@Order(4)
public class CurioTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Curio c1 = new Curio();
		c1.setDtNascimento("2021-06-01");
		c1.setAnilha(1);
		c1.setNome("Alpiste");
		c1.setCantPraia(true);
		c1.setCategoria("Canto");
		c1.setTempCantMin(1);
		System.out.println(c1);

		Curio c2 = new Curio();
		c2.setDtNascimento("2021-05-20");
		c2.setAnilha(2);
		c2.setNome("Aveia");
		c1.setCantPraia(true);
		c1.setCategoria("Canto");
		c1.setTempCantMin(3);
		System.out.println(c2);

		Curio c3 = new Curio();
		c3.setDtNascimento("2022-06-25");
		c3.setAnilha(3);
		c3.setNome("Painço");
		c1.setCantPraia(false);
		c1.setCategoria("Fibra");
		c1.setTempCantMin(4);
		System.out.println(c3);
	
	}

}
