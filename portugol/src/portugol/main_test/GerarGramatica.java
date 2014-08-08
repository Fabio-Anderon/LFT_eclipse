package portugol.main_test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class GerarGramatica {

	public static void main(String[] args) throws IOException {

		Scanner t;
		int op = 0;
		boolean continuar;

		do {
			System.out.println(" ********** GERAR GRAMATICA ********** \n"
					+ " 1 : Para rodar o SableCC na Nossa Gramatica  \n"
					+ " 2 : Para testar Gramatica já gerada \n"
					+ " 3 : Para Sair \n");

			t = new Scanner(System.in);
			try {
				op = t.nextInt();
			} catch (Exception e) {
				op = -1;
			}

			switch (op) {

			case 1:
				continuar = true;
				String dir_absoluto = new File("").getAbsolutePath();
				Process ls_proc = Runtime.getRuntime().exec(
						"java -jar " + dir_absoluto + "/src/sablecc.jar "
								+ dir_absoluto + "/src/portugol.grammar");

				BufferedReader ls_in = new BufferedReader(
						new InputStreamReader(ls_proc.getInputStream()));
				String ls_str;
				try {
					while ((ls_str = ls_in.readLine()) != null) {
						System.out.println(ls_str);
					}
				} catch (IOException e) {
					System.exit(0);
				}
			
			case 2:
				//Chama o metodo do Menu Principal
				Compilador.menuCompleto();
				continuar=false;
				break;
			case 3:
				continuar = false;
				System.out.println(" FIM !");
				break;
				
			default:
				continuar = true;
				System.out.println("ALTERNATIVA INEXISTENTE ! ");
				break;
			}
		} while (continuar);

	}

}
