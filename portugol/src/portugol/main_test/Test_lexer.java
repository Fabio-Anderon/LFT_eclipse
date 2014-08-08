package portugol.main_test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import portugol.doc_e_aux.New_Lexer;
import portugol.lexer.LexerException;
import portugol.node.EOF;

public class Test_lexer {
		
    public Test_lexer(String dir) throws LexerException, IOException {
    	File f = new File(dir);
        New_Lexer l = new New_Lexer(new PushbackReader(new FileReader(f)));
        String lexer = "";
        int linha = 0;
        
        
        while (!(l.peek() instanceof EOF)) {
            if (l.peek().getLine() > linha) {
                linha = l.peek().getLine();
                lexer = lexer + System.lineSeparator();
            }
            lexer = lexer + "(" + l.peek().getText() + ")-> " + l.next().getClass().getSimpleName()+"\n";
        }

        System.out.println(lexer);
    }
    
}
