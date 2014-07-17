/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import java.util.*;
import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AVariavelDeclaracao extends PDeclaracao
{
    private PTipo _tipo_;
    private TDoisPts _doisPts_;
    private final LinkedList<PDeclVar> _declVar_ = new LinkedList<PDeclVar>();
    private PVariavel _variavel_;
    private TPtVirg _ptVirg_;

    public AVariavelDeclaracao()
    {
        // Constructor
    }

    public AVariavelDeclaracao(
        @SuppressWarnings("hiding") PTipo _tipo_,
        @SuppressWarnings("hiding") TDoisPts _doisPts_,
        @SuppressWarnings("hiding") List<?> _declVar_,
        @SuppressWarnings("hiding") PVariavel _variavel_,
        @SuppressWarnings("hiding") TPtVirg _ptVirg_)
    {
        // Constructor
        setTipo(_tipo_);

        setDoisPts(_doisPts_);

        setDeclVar(_declVar_);

        setVariavel(_variavel_);

        setPtVirg(_ptVirg_);

    }

    @Override
    public Object clone()
    {
        return new AVariavelDeclaracao(
            cloneNode(this._tipo_),
            cloneNode(this._doisPts_),
            cloneList(this._declVar_),
            cloneNode(this._variavel_),
            cloneNode(this._ptVirg_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVariavelDeclaracao(this);
    }

    public PTipo getTipo()
    {
        return this._tipo_;
    }

    public void setTipo(PTipo node)
    {
        if(this._tipo_ != null)
        {
            this._tipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipo_ = node;
    }

    public TDoisPts getDoisPts()
    {
        return this._doisPts_;
    }

    public void setDoisPts(TDoisPts node)
    {
        if(this._doisPts_ != null)
        {
            this._doisPts_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._doisPts_ = node;
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
            + toString(this._tipo_)
            + toString(this._doisPts_)
            + toString(this._declVar_)
            + toString(this._variavel_)
            + toString(this._ptVirg_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipo_ == child)
        {
            this._tipo_ = null;
            return;
        }

        if(this._doisPts_ == child)
        {
            this._doisPts_ = null;
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
        if(this._tipo_ == oldChild)
        {
            setTipo((PTipo) newChild);
            return;
        }

        if(this._doisPts_ == oldChild)
        {
            setDoisPts((TDoisPts) newChild);
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

        if(this._ptVirg_ == oldChild)
        {
            setPtVirg((TPtVirg) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}