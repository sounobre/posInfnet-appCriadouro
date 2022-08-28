package br.edu.infnet.appcriadouro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcriadouro.controller.ResponsavelController;
import br.edu.infnet.appcriadouro.model.domain.Responsavel;
import br.edu.infnet.appcriadouro.model.domain.exceptions.CpfInvalidoException;

@Component
@Order(1)
public class ResponsavelTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {

		String dir = "c:/dev/";

		String arq = "responsavel.txt";

		try {
			try {
				FileReader fileReader = new FileReader(dir + arq);
				BufferedReader leitura = new BufferedReader(fileReader);

				String linha = leitura.readLine();
				while (linha != null) {

					try {
						String[] campos = linha.split(";");
						Responsavel r1 = new Responsavel(campos[0], campos[1], campos[2]);
						ResponsavelController.incluir(r1);
					} catch (CpfInvalidoException e) {
						System.out.println("[ERROR] - RESPONSAVEL " + e.getMessage());
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
