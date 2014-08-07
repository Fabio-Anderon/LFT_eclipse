package portugol.main_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import portugol.parser.*;
import portugol.lexer.New_Lexer;
import portugol.lexer.LexerException;


public class test_parser {

	public static void main(String[] args) throws IOException, ParserException, LexerException {
		//File f = new File("/Documentos/LFT_eclipse/LFT_eclipse/portugol/src/portugol/main_test/Test_Parser.txt");
		File f = new File("/home/fabio/git/LFT_eclipse/portugol/src/portugol/main_test/Test_Parser.txt");
		Parser gramatica = new Parser(new New_Lexer(new PushbackReader(new FileReader(f))));
		
		System.out.println(gramatica.parse().getPPrograma());
		
		
		
		
	}

}
