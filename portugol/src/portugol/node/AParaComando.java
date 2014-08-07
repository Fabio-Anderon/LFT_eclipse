/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import java.util.*;
import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AParaComando extends PComando
{
    private PVariavel _variavel_;
    private PIPara _iPara_;
    private PPasso _passo_;
    private PNPara _nPara_;
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();

    public AParaComando()
    {
        // Constructor
    }

    public AParaComando(
        @SuppressWarnings("hiding") PVariavel _variavel_,
        @SuppressWarnings("hiding") PIPara _iPara_,
        @SuppressWarnings("hiding") PPasso _passo_,
        @SuppressWarnings("hiding") PNPara _nPara_,
        @SuppressWarnings("hiding") List<?> _comando_)
    {
        // Constructor
        setVariavel(_variavel_);

        setIPara(_iPara_);

        setPasso(_passo_);

        setNPara(_nPara_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AParaComando(
            cloneNode(this._variavel_),
            cloneNode(this._iPara_),
            cloneNode(this._passo_),
            cloneNode(this._nPara_),
            cloneList(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParaComando(this);
    }

    public PVariavel getVariavel()
    {
        return this._variavel_;
    }

    public void setVariavel(PVariavel node)
    {
        if(this._variavel_ != null)
        {
            this._variavel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._variavel_ = node;
    }

    public PIPara getIPara()
    {
        return this._iPara_;
    }

    public void setIPara(PIPara node)
    {
        if(this._iPara_ != null)
        {
            this._iPara_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._iPara_ = node;
    }

    public PPasso getPasso()
    {
        return this._passo_;
    }

    public void setPasso(PPasso node)
    {
        if(this._passo_ != null)
        {
            this._passo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._passo_ = node;
    }

    public PNPara getNPara()
    {
        return this._nPara_;
    }

    public void setNPara(PNPara node)
    {
        if(this._nPara_ != null)
        {
            this._nPara_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nPara_ = node;
    }

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<?> list)
    {
        for(PComando e : this._comando_)
        {
            e.parent(null);
        }
        this._comando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comando_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._variavel_)
            + toString(this._iPara_)
            + toString(this._passo_)
            + toString(this._nPara_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._variavel_ == child)
        {
            this._variavel_ = null;
            return;
        }

        if(this._iPara_ == child)
        {
            this._iPara_ = null;
            return;
        }

        if(this._passo_ == child)
        {
            this._passo_ = null;
            return;
        }

        if(this._nPara_ == child)
        {
            this._nPara_ = null;
            return;
        }

        if(this._comando_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._variavel_ == oldChild)
        {
            setVariavel((PVariavel) newChild);
            return;
        }

        if(this._iPara_ == oldChild)
        {
            setIPara((PIPara) newChild);
            return;
        }

        if(this._passo_ == oldChild)
        {
            setPasso((PPasso) newChild);
            return;
        }

        if(this._nPara_ == oldChild)
        {
            setNPara((PNPara) newChild);
            return;
        }

        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
