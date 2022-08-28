package br.edu.infnet.appcriadouro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.context.annotation.PropertySource;

import br.edu.infnet.appcriadouro.interfaces.IPrinter;

//@PropertySource("classpath:arquivos")
public class AppAves {

	public static void relatorio(String mensagem, IPrinter printer) {
		System.out.println(mensagem);

		printer.impressao();
	}
	
	
	public static void main(String[] args) {
		String dir = "c:/dev/";
		
		String arq = "criadouro.txt";
		
		try {
			try {
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				System.out.println(leitura.readLine());
				
				String linha  = leitura.readLine();
				while(linha != null) {
					System.out.println(linha);
					
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
