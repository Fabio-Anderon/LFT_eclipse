/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class TComentBarra extends Token
{
    public TComentBarra()
    {
        super.setText("/");
    }

    public TComentBarra(int line, int pos)
    {
        super.setText("/");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TComentBarra(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTComentBarra(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TComentBarra text.");
    }
}
