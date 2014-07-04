/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import java.util.*;
import portugol.analysis.*;

@SuppressWarnings("nls")
public final class ALeiaComando extends PComando
{
    private TLeia _leia_;
    private TAbreParantes _abreParantes_;
    private final LinkedList<PDeclVar> _declVar_ = new LinkedList<PDeclVar>();
    private PVariavel _variavel_;
    private TFechaParentes _fechaParentes_;
    private TPtVirg _ptVirg_;

    public ALeiaComando()
    {
        // Constructor
    }

    public ALeiaComando(
        @SuppressWarnings("hiding") TLeia _leia_,
        @SuppressWarnings("hiding") TAbreParantes _abreParantes_,
        @SuppressWarnings("hiding") List<?> _declVar_,
        @SuppressWarnings("hiding") PVariavel _variavel_,
        @SuppressWarnings("hiding") TFechaParentes _fechaParentes_,
        @SuppressWarnings("hiding") TPtVirg _ptVirg_)
    {
        // Constructor
        setLeia(_leia_);

        setAbreParantes(_abreParantes_);

        setDeclVar(_declVar_);

        setVariavel(_variavel_);

        setFechaParentes(_fechaParentes_);

        setPtVirg(_ptVirg_);

    }

    @Override
    public Object clone()
    {
        return new ALeiaComando(
            cloneNode(this._leia_),
            cloneNode(this._abreParantes_),
            cloneList(this._declVar_),
            cloneNode(this._variavel_),
            cloneNode(this._fechaParentes_),
            cloneNode(this._ptVirg_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALeiaComando(this);
    }

    public TLeia getLeia()
    {
        return this._leia_;
    }

    public void setLeia(TLeia node)
    {
        if(this._leia_ != null)
        {
            this._leia_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leia_ = node;
    }

    public TAbreParantes getAbreParantes()
    {
        return this._abreParantes_;
    }

    public void setAbreParantes(TAbreParantes node)
    {
        if(this._abreParantes_ != null)
        {
            this._abreParantes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abreParantes_ = node;
    }

    public LinkedList<PDeclVar> getDeclVar()
    {
        return this._declVar_;
    }

    public void setDeclVar(List<?> list)
    {
        for(PDeclVar e : this._declVar_)
        {
            e.parent(null);
        }
        this._declVar_.clear();

        for(Object obj_e : list)
        {
            PDeclVar e = (PDeclVar) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._declVar_.add(e);
        }
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

    public TFechaParentes getFechaParentes()
    {
        return this._fechaParentes_;
    }

    public void setFechaParentes(TFechaParentes node)
    {
        if(this._fechaParentes_ != null)
        {
            this._fechaParentes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaParentes_ = node;
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
            + toString(this._leia_)
            + toString(this._abreParantes_)
            + toString(this._declVar_)
            + toString(this._variavel_)
            + toString(this._fechaParentes_)
            + toString(this._ptVirg_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._leia_ == child)
        {
            this._leia_ = null;
            return;
        }

        if(this._abreParantes_ == child)
        {
            this._abreParantes_ = null;
            return;
        }

        if(this._declVar_.remove(child))
        {
            return;
        }

        if(this._variavel_ == child)
        {
            this._variavel_ = null;
            return;
        }

        if(this._fechaParentes_ == child)
        {
            this._fechaParentes_ = null;
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
        if(this._leia_ == oldChild)
        {
            setLeia((TLeia) newChild);
            return;
        }

        if(this._abreParantes_ == oldChild)
        {
            setAbreParantes((TAbreParantes) newChild);
            return;
        }

        for(ListIterator<PDeclVar> i = this._declVar_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDeclVar) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._variavel_ == oldChild)
        {
            setVariavel((PVariavel) newChild);
            return;
        }

        if(this._fechaParentes_ == oldChild)
        {
            setFechaParentes((TFechaParentes) newChild);
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
