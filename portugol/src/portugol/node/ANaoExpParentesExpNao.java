/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class ANaoExpParentesExpNao extends PExpNao
{
    private TNao _nao_;
    private PExpParentes _expParentes_;

    public ANaoExpParentesExpNao()
    {
        // Constructor
    }

    public ANaoExpParentesExpNao(
        @SuppressWarnings("hiding") TNao _nao_,
        @SuppressWarnings("hiding") PExpParentes _expParentes_)
    {
        // Constructor
        setNao(_nao_);

        setExpParentes(_expParentes_);

    }

    @Override
    public Object clone()
    {
        return new ANaoExpParentesExpNao(
            cloneNode(this._nao_),
            cloneNode(this._expParentes_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANaoExpParentesExpNao(this);
    }

    public TNao getNao()
    {
        return this._nao_;
    }

    public void setNao(TNao node)
    {
        if(this._nao_ != null)
        {
            this._nao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nao_ = node;
    }

    public PExpParentes getExpParentes()
    {
        return this._expParentes_;
    }

    public void setExpParentes(PExpParentes node)
    {
        if(this._expParentes_ != null)
        {
            this._expParentes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expParentes_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nao_)
            + toString(this._expParentes_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nao_ == child)
        {
            this._nao_ = null;
            return;
        }

        if(this._expParentes_ == child)
        {
            this._expParentes_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._nao_ == oldChild)
        {
            setNao((TNao) newChild);
            return;
        }

        if(this._expParentes_ == oldChild)
        {
            setExpParentes((PExpParentes) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
