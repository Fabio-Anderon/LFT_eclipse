package portugol.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import portugol.lexer.New_Lexer;
import portugol.lexer.Lexer;
import portugol.lexer.LexerException;
import portugol.node.EOF;

public class test_lexer {
    public static void main(String[] args) throws LexerException, IOException {
        File f = new File("/home/fabio/Desktop/UFS/2014.1/LFT/Compilador/GRAMATICA/src/portugol/test/Test_Lexer.txt");
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
