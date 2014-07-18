/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AConstDeclaracao extends PDeclaracao
{
    private TConst _const_;
    private TIdentificador _identificador_;
    private PValor _valor_;
    private TPtVirg _ptVirg_;

    public AConstDeclaracao()
    {
        // Constructor
    }

    public AConstDeclaracao(
        @SuppressWarnings("hiding") TConst _const_,
        @SuppressWarnings("hiding") TIdentificador _identificador_,
        @SuppressWarnings("hiding") PValor _valor_,
        @SuppressWarnings("hiding") TPtVirg _ptVirg_)
    {
        // Constructor
        setConst(_const_);

        setIdentificador(_identificador_);

        setValor(_valor_);

        setPtVirg(_ptVirg_);

    }

    @Override
    public Object clone()
    {
        return new AConstDeclaracao(
            cloneNode(this._const_),
            cloneNode(this._identificador_),
            cloneNode(this._valor_),
            cloneNode(this._ptVirg_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConstDeclaracao(this);
    }

    public TConst getConst()
    {
        return this._const_;
    }

    public void setConst(TConst node)
    {
        if(this._const_ != null)
        {
            this._const_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._const_ = node;
    }

    public TIdentificador getIdentificador()
    {
        return this._identificador_;
    }

    public void setIdentificador(TIdentificador node)
    {
        if(this._identificador_ != null)
        {
            this._identificador_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identificador_ = node;
    }

    public PValor getValor()
    {
        return this._valor_;
    }

    public void setValor(PValor node)
    {
        if(this._valor_ != null)
        {
            this._valor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._valor_ = node;
    }

    public TPtVirg getPtVirg()
    {
        return this._ptVirg_;
    }

    public void setPtVirg(TPtVirg node)
    {
        if(this._ptVirg_ != null)
        {
            this._ptVirg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ptVirg_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._const_)
            + toString(this._identificador_)
            + toString(this._valor_)
            + toString(this._ptVirg_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._const_ == child)
        {
            this._const_ = null;
            return;
        }

        if(this._identificador_ == child)
        {
            this._identificador_ = null;
            return;
        }

        if(this._valor_ == child)
        {
            this._valor_ = null;
            return;
        }

        if(this._ptVirg_ == child)
        {
            this._ptVirg_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._const_ == oldChild)
        {
            setConst((TConst) newChild);
            return;
        }

        if(this._identificador_ == oldChild)
        {
            setIdentificador((TIdentificador) newChild);
            return;
        }

        if(this._valor_ == oldChild)
        {
            setValor((PValor) newChild);
            return;
        }

        if(this._ptVirg_ == oldChild)
        {
            setPtVirg((TPtVirg) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
