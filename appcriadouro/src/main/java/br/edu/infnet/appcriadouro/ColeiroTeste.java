package br.edu.infnet.appcriadouro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcriadouro.model.domain.Coleiro;
import br.edu.infnet.appcriadouro.model.domain.exceptions.CantoPorMinutoZeradoException;
import br.edu.infnet.appcriadouro.model.service.ColeiroService;

@Component
@Order(4)
public class ColeiroTeste implements ApplicationRunner {

	@Autowired
	ColeiroService coleiroService;

	@Override
	public void run(ApplicationArguments args) {

		String dir = "c:/dev/";

		String arq = "coleiro.txt";

		try {
			try {
				FileReader fileReader = new FileReader(dir + arq);
				BufferedReader leitura = new BufferedReader(fileReader);

				String linha = leitura.readLine();
				while (linha != null) {

					try {

						String[] campos = linha.split(";");

						Coleiro c1 = new Coleiro();
						c1.setDtNascimento(campos[5]);
						c1.setAnilha(Integer.parseInt(campos[4]));
						c1.setNome(campos[3]);
						c1.setCantPorMin(Integer.parseInt(campos[2]));
						c1.setCantTuiTui(Boolean.valueOf(campos[0]));
						c1.setRegiao(campos[1]);
						System.out.println("Nome do pássaro é: " + c1.mostrarNome());
						coleiroService.incluir(c1);
					} catch (CantoPorMinutoZeradoException e) {
						System.out.println("[ERROR - COLEIRO] " + e.getMessage());
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
