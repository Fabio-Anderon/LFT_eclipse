/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AMaiorOpComparar extends POpComparar
{
    private TMaior _maior_;

    public AMaiorOpComparar()
    {
        // Constructor
    }

    public AMaiorOpComparar(
        @SuppressWarnings("hiding") TMaior _maior_)
    {
        // Constructor
        setMaior(_maior_);

    }

    @Override
    public Object clone()
    {
        return new AMaiorOpComparar(
            cloneNode(this._maior_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMaiorOpComparar(this);
    }

    public TMaior getMaior()
    {
        return this._maior_;
    }

    public void setMaior(TMaior node)
    {
        if(this._maior_ != null)
        {
            this._maior_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._maior_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._maior_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._maior_ == child)
        {
            this._maior_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._maior_ == oldChild)
        {
            setMaior((TMaior) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
