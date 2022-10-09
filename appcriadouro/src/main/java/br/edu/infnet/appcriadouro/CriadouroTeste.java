package br.edu.infnet.appcriadouro;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcriadouro.model.domain.Ave;
import br.edu.infnet.appcriadouro.model.domain.Canario;
import br.edu.infnet.appcriadouro.model.domain.Criadouro;
import br.edu.infnet.appcriadouro.model.domain.Responsavel;
import br.edu.infnet.appcriadouro.model.domain.Usuario;
import br.edu.infnet.appcriadouro.model.domain.exceptions.CpfInvalidoException;
import br.edu.infnet.appcriadouro.model.domain.exceptions.CriadouroSemAvesException;
import br.edu.infnet.appcriadouro.model.domain.exceptions.ResponsavelNuloException;
import br.edu.infnet.appcriadouro.model.service.CriadouroService;

@Component
@Order(6)
public class CriadouroTeste implements ApplicationRunner {

	@Autowired
	private CriadouroService criadouroService;

	@Override
	public void run(ApplicationArguments args) throws CriadouroSemAvesException {

		try {
			Usuario usuario = new Usuario();
			usuario.setId(1);

			Responsavel responsavel = new Responsavel("Diego Nobre", "sounobre@hotmail.com", "12345678910");
			responsavel.setId(1);

			Set<Ave> aves = new HashSet<Ave>();
			Canario b1 = new Canario();
			b1.setId(1);
			b1.setAnilha(123);
			Canario b2 = new Canario();
			b2.setId(2);
			b2.setAnilha(234);
			Canario b3 = new Canario();
			b3.setId(3);
			b3.setAnilha(345);
			aves.add(b1);
			aves.add(b2);
			aves.add(b3);

			Criadouro criadouro = new Criadouro(responsavel, aves);
			criadouro.setNome("Criadouro Nobre");
			criadouro.setEndereco("Rua dos passaros 123");
			criadouro.setUsuario(usuario);

			criadouroService.incluir(criadouro);
		} catch (ResponsavelNuloException | CpfInvalidoException e) {

			e.printStackTrace();
		}

	}
}