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

import br.edu.infnet.appcriadouro.model.domain.Canario;
import br.edu.infnet.appcriadouro.model.domain.exceptions.TamanhoNomeInvalidoException;
import br.edu.infnet.appcriadouro.model.service.CanarioService;

@Component
@Order(3)
public class CanarioTeste implements ApplicationRunner {
	
	@Autowired
	private CanarioService canarioService;

	@Override
	public void run(ApplicationArguments args) {
		
		String dir = "c:/dev/";
		String arq = "canario.txt";

		try {
			try {
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha = leitura.readLine();
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					if("CA".equalsIgnoreCase(campos[0])) {
						try {
							Canario canario = new Canario();
							canario.setDtNascimento(campos[6]); 
							canario.setAnilha( Integer.parseInt(campos[5]));
							canario.setNome(campos[4]);
							
							canario.setTipo(campos[4]);
							canario.setRaca(campos[5]);
							canario.setClassificacao(campos[6]);

							System.out.println("O nome do canário é: " + canario.mostrarNome());
							canarioService.incluir(canario);
						} catch (TamanhoNomeInvalidoException e) {
							System.out.println("[ERROR - CANARIO] " + e.getMessage());
						}
					}


					linha = leitura.readLine();
				}

				leitura.close();
				fileReader.close();				
			} catch (FileNotFoundException e) {
				System.out.println("[ERRO] O arquivo não existe!!!");
				
			} catch (IOException e) {
				System.out.println("[ERRO] Problema no fechamento do arquivo!!!");
			}			
		} finally {
			System.out.println("Terminou!");
		}		
	}
}