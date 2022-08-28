package br.edu.infnet.appcriadouro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcriadouro.controller.CurioController;
import br.edu.infnet.appcriadouro.model.domain.Curio;
import br.edu.infnet.appcriadouro.model.domain.exceptions.CategoriaInvalidaException;

@Component
@Order(4)
public class CurioTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {

		System.out.println();
		System.out.println("######Curió######");
		System.out.println();
		
		
		String dir = "c:/dev/";

		String arq = "curio.txt";

		try {
			try {
				FileReader fileReader = new FileReader(dir + arq);
				BufferedReader leitura = new BufferedReader(fileReader);

				String linha = leitura.readLine();
				while (linha != null) {

					try {

						String[] campos = linha.split(";");

						Curio c1 = new Curio();
						c1.setDtNascimento(campos[5]);
						c1.setAnilha(Integer.parseInt(campos[4]));
						c1.setNome(campos[3]);
						c1.setCantPraia(Boolean.valueOf(campos[0]));
						c1.setCategoria(campos[1]);
						c1.setTempCantMin(Integer.parseInt(campos[2]));
						System.out.println("Nome do pássaro é: " + c1.mostrarNome());
						CurioController.incluir(c1);
					} catch (CategoriaInvalidaException e) {
						System.out.println("[ERROR - CURIO] " + e.getMessage());
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
