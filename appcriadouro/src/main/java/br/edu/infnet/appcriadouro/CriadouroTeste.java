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
				
				Responsavel responsavel = new Responsavel("Diego Nobre","sounobre@hotmail.com", "12345678910");
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

//		String dir = "c:/dev/";
//
//		String arq = "criadouro.txt";
//
//		try {
//			try {
//				FileReader fileReader = new FileReader(dir + arq);
//				BufferedReader leitura = new BufferedReader(fileReader);
//				
//				List<Criadouro> criadouros = new ArrayList<>();
//
//				Set<Ave> aves = null;
//				
//				String linha = leitura.readLine();
//				while (linha != null) {
//
//					String[] campos = linha.split(";");
//
//					switch (campos[0].toUpperCase()) {
//					case "P":
//						try {
//							aves = new HashSet<>();
//
//							Responsavel responsavel1 = new Responsavel(campos[4], campos[5], campos[6]);
//
//							Criadouro criadouro = new Criadouro(responsavel1, aves);
//							criadouro.setNome(campos[1]);
//							criadouro.setEndereco(campos[2]);
//							criadouro.setTpAve(campos[3]);
//
//							criadouros.add(criadouro);
//
//						} catch (CpfInvalidoException e) {
//							System.out.println("[ERROR] - PEDIDO" + e.getMessage());
//						}
//						break;
//
//					case "B":
//						Canario canario = new Canario();
//						canario.setDtNascimento(campos[1]);
//						canario.setAnilha(Integer.parseInt(campos[2]));
//						canario.setNome(campos[3]);
//						canario.setTipo(campos[4]);
//						canario.setRaca(campos[5]);
//						canario.setClassificacao(campos[6]);
//
//						aves.add(canario);
//
//						break;
//
//					case "C":
//						Coleiro coleiro = new Coleiro();
//						coleiro.setDtNascimento(campos[1]);
//						coleiro.setAnilha(Integer.parseInt(campos[2]));
//						coleiro.setNome(campos[3]);
//						coleiro.setCantPorMin(Integer.parseInt(campos[4]));
//						coleiro.setCantTuiTui(Boolean.parseBoolean(campos[5]));
//						coleiro.setRegiao(campos[6]);
//
//						aves.add(coleiro);
//
//						break;
//
//					case "S":
//						break;
//
//					default:
//						break;
//					}
//
//					linha = leitura.readLine();
//				}
//
//				for (Criadouro c : criadouros) {
//					criadouroService.incluir(c);
//
//					System.out.println(">> " + c.getId());
//					System.out.println(">> " + c.getResponsavel().getNome());
//					System.out.println(">> " + c.getAves().size());
//
//				}
//
//				leitura.close();
//				fileReader.close();
//
//			} catch (FileNotFoundException e) {
//				System.out.println("[ERRO] O arquivo não existe");
//			} catch (IOException e) {
//				System.out.println("[ERRO] Problema no fechamento do arquivo");
//			}
//		} finally {
//			System.out.println("Terminou");
//		}
//
	}
}