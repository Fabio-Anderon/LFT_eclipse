package portugol.main_test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import portugol.lexer.LexerException;
import portugol.parser.ParserException;

public class Compilador {

	public static void menuCompleto() throws IOException {

		String dirPrograma = "/home/fabio/git/LFT_eclipse/portugol/src/portugol/main_test/Teste_programa.txt";
		String dirGramatica = "/home/fabio/git/LFT_eclipse/portugol/src/portugol.grammar";

		Scanner t;
		int op = 0;
		boolean continuar;

		do {
			System.out.println(" ********** PORTUGOL ********** \n"
					+ " 1 : Para rodar o SableCC na Nossa Gramatica  \n"
					+ " 2 : Para Testar o Lexico \n"
					+ " 3 : Para Testar o Sintatico (AST) \n"
					+ " 4 : Para ver a Gramatica \n"
					+ " 5 : Para ver o Arquivo de Teste \n"
					+ " 6 : Para Sair \n");

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

				break;
			case 2:
				continuar = true;
				// ====================
				try {

					Test_lexer tLexer = new Test_lexer(dirPrograma);

				} catch (LexerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 3:
				continuar = true;
				// ====================

				try {
					Test_parser tParser = new Test_parser(dirPrograma);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (LexerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				BufferedReader reader1 = new BufferedReader(new FileReader(
						dirGramatica));
				StringBuffer buffer1 = new StringBuffer();
				String line1 = reader1.readLine();
				while (line1 != null) {
					buffer1.append(line1);
					buffer1.append('\n');
					line1 = reader1.readLine();
				}
				System.out.println(buffer1);

				continuar = true;
				break;
			case 5:
				continuar = true;
				BufferedReader reader = new BufferedReader(new FileReader(
						dirPrograma));
				StringBuffer buffer = new StringBuffer();
				String line = reader.readLine();
				while (line != null) {
					buffer.append(line);
					buffer.append('\n');
					line = reader.readLine();
				}
				System.out.println(buffer);
				break;
			case 6:
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
