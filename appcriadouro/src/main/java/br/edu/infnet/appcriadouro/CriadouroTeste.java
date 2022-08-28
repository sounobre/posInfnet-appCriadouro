package br.edu.infnet.appcriadouro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
import br.edu.infnet.appcriadouro.model.domain.exceptions.CpfInvalidoException;
import br.edu.infnet.appcriadouro.model.domain.exceptions.CriadouroSemAvesException;
import br.edu.infnet.appcriadouro.model.domain.exceptions.ResponsavelNuloException;

@Component
@Order(2)
public class CriadouroTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {

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

		System.out.println();

		String dir = "c:/dev/";

		String arq = "criadouro.txt";

		try {
			try {
				FileReader fileReader = new FileReader(dir + arq);
				BufferedReader leitura = new BufferedReader(fileReader);

				String linha = leitura.readLine();
				while (linha != null) {

					try {

						String[] campos = linha.split(";");

						Set<Ave> lsAves1 = new HashSet<>();
						lsAves1.add(ac1);
						lsAves1.add(ac2);
						lsAves1.add(ac1);
						lsAves1.add(ac2);

						Responsavel r1 = new Responsavel(campos[3], campos[4], campos[5]);
						Criadouro c1 = new Criadouro(r1, lsAves1);
						c1.setEndereco(campos[1]);
						c1.setNome(campos[0]);
						c1.setTpAve(campos[2]);

						CriadouroController.incluir(c1);

					} catch (CpfInvalidoException | ResponsavelNuloException | CriadouroSemAvesException e) {
						System.out.println("[ERROR] - CRIADOURO " + e.getMessage());
					}

					linha = leitura.readLine();
				}

				leitura.close();
				fileReader.close();

			} catch (FileNotFoundException e) {
				System.out.println("[ERRO] O arquivo não existe");
			} catch (IOException e) {
				System.out.println("[ERRO] Problema no fechamento do arquivo");
			}
		} finally {
			System.out.println("Terminou");
		}

	}

}
