package portugol.lexer;

import portugol.node.*;

public class New_Lexer extends Lexer {

    private int count;
    private TComentAninhado comment;
    private StringBuffer text;

    public New_Lexer(java.io.PushbackReader in) {

        super(in);
    }

    protected void filter() throws LexerException {
        if (state.equals(State.COMENTARIO)) {
            if (comment == null) {
                comment = (TComentAninhado) token;
                text = new StringBuffer(comment.getText());
                count = 1;
                token = null;
            } else {
                text.append(token.getText());
                if (token instanceof TComentAninhado) {
                    count++;
                } else if (token instanceof TComentFim) {
                    count--;
                }
                if (token instanceof EOF) {
                    throw new LexerException(null, "token comentario desbalanceado");
                }
                if (count != 0) {
                    token = null;
                } else {
                    //Final de um aninhamento
                    comment.setText(text.toString());
                    token = comment;
                    state = State.NORMAL;
                    comment = null;
                }
            }
        }
    }
}
