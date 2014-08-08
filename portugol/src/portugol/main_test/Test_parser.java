package portugol.main_test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import portugol.parser.*;
import portugol.doc_e_aux.New_Lexer;
import portugol.lexer.LexerException;


public class Test_parser {

	public Test_parser(String dir) throws IOException, ParserException, LexerException {
		File f = new File(dir);
		Parser gramatica = new Parser(new New_Lexer(new PushbackReader(new FileReader(f))));
		
		System.out.println(gramatica.parse().getPPrograma());
		
		
	}

}
