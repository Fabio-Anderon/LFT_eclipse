/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AProdutoMult extends PMult
{
    private TProduto _produto_;

    public AProdutoMult()
    {
        // Constructor
    }

    public AProdutoMult(
        @SuppressWarnings("hiding") TProduto _produto_)
    {
        // Constructor
        setProduto(_produto_);

    }

    @Override
    public Object clone()
    {
        return new AProdutoMult(
            cloneNode(this._produto_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProdutoMult(this);
    }

    public TProduto getProduto()
    {
        return this._produto_;
    }

    public void setProduto(TProduto node)
    {
        if(this._produto_ != null)
        {
            this._produto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._produto_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._produto_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._produto_ == child)
        {
            this._produto_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._produto_ == oldChild)
        {
            setProduto((TProduto) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
