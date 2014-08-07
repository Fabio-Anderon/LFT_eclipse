/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.analysis;

import java.util.*;
import portugol.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPPrograma().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAPrograma(APrograma node)
    {
        defaultIn(node);
    }

    public void outAPrograma(APrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        inAPrograma(node);
        {
            List<PDeclaracao> copy = new ArrayList<PDeclaracao>(node.getDeclaracao());
            for(PDeclaracao e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAPrograma(node);
    }

    public void inASeqVariaveisDeclaracao(ASeqVariaveisDeclaracao node)
    {
        defaultIn(node);
    }

    public void outASeqVariaveisDeclaracao(ASeqVariaveisDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeqVariaveisDeclaracao(ASeqVariaveisDeclaracao node)
    {
        inASeqVariaveisDeclaracao(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        {
            List<PVariavel> copy = new ArrayList<PVariavel>(node.getVariavel());
            for(PVariavel e : copy)
            {
                e.apply(this);
            }
        }
        outASeqVariaveisDeclaracao(node);
    }

    public void inAConstanteDeclaracao(AConstanteDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAConstanteDeclaracao(AConstanteDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstanteDeclaracao(AConstanteDeclaracao node)
    {
        inAConstanteDeclaracao(node);
        if(node.getConst() != null)
        {
            node.getConst().apply(this);
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAConstanteDeclaracao(node);
    }

    public void inARealTipo(ARealTipo node)
    {
        defaultIn(node);
    }

    public void outARealTipo(ARealTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        inARealTipo(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outARealTipo(node);
    }

    public void inAIntTipo(AIntTipo node)
    {
        defaultIn(node);
    }

    public void outAIntTipo(AIntTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntTipo(AIntTipo node)
    {
        inAIntTipo(node);
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        outAIntTipo(node);
    }

    public void inACharTipo(ACharTipo node)
    {
        defaultIn(node);
    }

    public void outACharTipo(ACharTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACharTipo(ACharTipo node)
    {
        inACharTipo(node);
        if(node.getCaractere() != null)
        {
            node.getCaractere().apply(this);
        }
        outACharTipo(node);
    }

    public void inAIdVariavel(AIdVariavel node)
    {
        defaultIn(node);
    }

    public void outAIdVariavel(AIdVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdVariavel(AIdVariavel node)
    {
        inAIdVariavel(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAIdVariavel(node);
    }

    public void inAVetorVariavel(AVetorVariavel node)
    {
        defaultIn(node);
    }

    public void outAVetorVariavel(AVetorVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVetorVariavel(AVetorVariavel node)
    {
        inAVetorVariavel(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        if(node.getAbreColchete() != null)
        {
            node.getAbreColchete().apply(this);
        }
        if(node.getNumInt() != null)
        {
            node.getNumInt().apply(this);
        }
        if(node.getFechaColchete() != null)
        {
            node.getFechaColchete().apply(this);
        }
        outAVetorVariavel(node);
    }

    public void inAStringValor(AStringValor node)
    {
        defaultIn(node);
    }

    public void outAStringValor(AStringValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        inAStringValor(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringValor(node);
    }

    public void inANumIntValor(ANumIntValor node)
    {
        defaultIn(node);
    }

    public void outANumIntValor(ANumIntValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumIntValor(ANumIntValor node)
    {
        inANumIntValor(node);
        if(node.getNumInt() != null)
        {
            node.getNumInt().apply(this);
        }
        outANumIntValor(node);
    }

    public void inANumRealValor(ANumRealValor node)
    {
        defaultIn(node);
    }

    public void outANumRealValor(ANumRealValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumRealValor(ANumRealValor node)
    {
        inANumRealValor(node);
        if(node.getNumReal() != null)
        {
            node.getNumReal().apply(this);
        }
        outANumRealValor(node);
    }

    public void inAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultIn(node);
    }

    public void outAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribuicaoComando(AAtribuicaoComando node)
    {
        inAAtribuicaoComando(node);
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAAtribuicaoComando(node);
    }

    public void inALeiaComando(ALeiaComando node)
    {
        defaultIn(node);
    }

    public void outALeiaComando(ALeiaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALeiaComando(ALeiaComando node)
    {
        inALeiaComando(node);
        {
            List<PVariavel> copy = new ArrayList<PVariavel>(node.getVariavel());
            for(PVariavel e : copy)
            {
                e.apply(this);
            }
        }
        outALeiaComando(node);
    }

    public void inAEscrevaExpComando(AEscrevaExpComando node)
    {
        defaultIn(node);
    }

    public void outAEscrevaExpComando(AEscrevaExpComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEscrevaExpComando(AEscrevaExpComando node)
    {
        inAEscrevaExpComando(node);
        {
            List<PExp> copy = new ArrayList<PExp>(node.getExp());
            for(PExp e : copy)
            {
                e.apply(this);
            }
        }
        outAEscrevaExpComando(node);
    }

    public void inAEscrevaExpLogicaComando(AEscrevaExpLogicaComando node)
    {
        defaultIn(node);
    }

    public void outAEscrevaExpLogicaComando(AEscrevaExpLogicaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEscrevaExpLogicaComando(AEscrevaExpLogicaComando node)
    {
        inAEscrevaExpLogicaComando(node);
        {
            List<PExpLogica> copy = new ArrayList<PExpLogica>(node.getExpLogica());
            for(PExpLogica e : copy)
            {
                e.apply(this);
            }
        }
        outAEscrevaExpLogicaComando(node);
    }

    public void inASeComando(ASeComando node)
    {
        defaultIn(node);
    }

    public void outASeComando(ASeComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        inASeComando(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getElseParte() != null)
        {
            node.getElseParte().apply(this);
        }
        outASeComando(node);
    }

    public void inAAvalieComando(AAvalieComando node)
    {
        defaultIn(node);
    }

    public void outAAvalieComando(AAvalieComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvalieComando(AAvalieComando node)
    {
        inAAvalieComando(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        {
            List<PCasoOpcao> copy = new ArrayList<PCasoOpcao>(node.getCasoOpcao());
            for(PCasoOpcao e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getPadrao() != null)
        {
            node.getPadrao().apply(this);
        }
        outAAvalieComando(node);
    }

    public void inAEnquantoComando(AEnquantoComando node)
    {
        defaultIn(node);
    }

    public void outAEnquantoComando(AEnquantoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        inAEnquantoComando(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAEnquantoComando(node);
    }

    public void inARepitaComando(ARepitaComando node)
    {
        defaultIn(node);
    }

    public void outARepitaComando(ARepitaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepitaComando(ARepitaComando node)
    {
        inARepitaComando(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outARepitaComando(node);
    }

    public void inAParaComando(AParaComando node)
    {
        defaultIn(node);
    }

    public void outAParaComando(AParaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        inAParaComando(node);
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        if(node.getIPara() != null)
        {
            node.getIPara().apply(this);
        }
        if(node.getPasso() != null)
        {
            node.getPasso().apply(this);
        }
        if(node.getNPara() != null)
        {
            node.getNPara().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAParaComando(node);
    }

    public void inAElseParte(AElseParte node)
    {
        defaultIn(node);
    }

    public void outAElseParte(AElseParte node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElseParte(AElseParte node)
    {
        inAElseParte(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAElseParte(node);
    }

    public void inACasoOpcao(ACasoOpcao node)
    {
        defaultIn(node);
    }

    public void outACasoOpcao(ACasoOpcao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACasoOpcao(ACasoOpcao node)
    {
        inACasoOpcao(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outACasoOpcao(node);
    }

    public void inAPadrao(APadrao node)
    {
        defaultIn(node);
    }

    public void outAPadrao(APadrao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPadrao(APadrao node)
    {
        inAPadrao(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAPadrao(node);
    }

    public void inAPasso(APasso node)
    {
        defaultIn(node);
    }

    public void outAPasso(APasso node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPasso(APasso node)
    {
        inAPasso(node);
        if(node.getNumInt() != null)
        {
            node.getNumInt().apply(this);
        }
        outAPasso(node);
    }

    public void inAIPara(AIPara node)
    {
        defaultIn(node);
    }

    public void outAIPara(AIPara node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIPara(AIPara node)
    {
        inAIPara(node);
        if(node.getNumInt() != null)
        {
            node.getNumInt().apply(this);
        }
        outAIPara(node);
    }

    public void inANPara(ANPara node)
    {
        defaultIn(node);
    }

    public void outANPara(ANPara node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANPara(ANPara node)
    {
        inANPara(node);
        if(node.getNumInt() != null)
        {
            node.getNumInt().apply(this);
        }
        outANPara(node);
    }

    public void inASomaExp(ASomaExp node)
    {
        defaultIn(node);
    }

    public void outASomaExp(ASomaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomaExp(ASomaExp node)
    {
        inASomaExp(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outASomaExp(node);
    }

    public void inAMultExp(AMultExp node)
    {
        defaultIn(node);
    }

    public void outAMultExp(AMultExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExp(AMultExp node)
    {
        inAMultExp(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMultExp(node);
    }

    public void inAExpParentesExp(AExpParentesExp node)
    {
        defaultIn(node);
    }

    public void outAExpParentesExp(AExpParentesExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpParentesExp(AExpParentesExp node)
    {
        inAExpParentesExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAExpParentesExp(node);
    }

    public void inAMenosExpExp(AMenosExpExp node)
    {
        defaultIn(node);
    }

    public void outAMenosExpExp(AMenosExpExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenosExpExp(AMenosExpExp node)
    {
        inAMenosExpExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAMenosExpExp(node);
    }

    public void inAVariavelExp(AVariavelExp node)
    {
        defaultIn(node);
    }

    public void outAVariavelExp(AVariavelExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelExp(AVariavelExp node)
    {
        inAVariavelExp(node);
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        outAVariavelExp(node);
    }

    public void inAValorExp(AValorExp node)
    {
        defaultIn(node);
    }

    public void outAValorExp(AValorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorExp(AValorExp node)
    {
        inAValorExp(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValorExp(node);
    }

    public void inAXorExpLogica(AXorExpLogica node)
    {
        defaultIn(node);
    }

    public void outAXorExpLogica(AXorExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorExpLogica(AXorExpLogica node)
    {
        inAXorExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAXorExpLogica(node);
    }

    public void inAOuExpLogica(AOuExpLogica node)
    {
        defaultIn(node);
    }

    public void outAOuExpLogica(AOuExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuExpLogica(AOuExpLogica node)
    {
        inAOuExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAOuExpLogica(node);
    }

    public void inAEExpLogica(AEExpLogica node)
    {
        defaultIn(node);
    }

    public void outAEExpLogica(AEExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEExpLogica(AEExpLogica node)
    {
        inAEExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAEExpLogica(node);
    }

    public void inAExpSimpIgualExpLogica(AExpSimpIgualExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpSimpIgualExpLogica(AExpSimpIgualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpSimpIgualExpLogica(AExpSimpIgualExpLogica node)
    {
        inAExpSimpIgualExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAExpSimpIgualExpLogica(node);
    }

    public void inAExpMultIgualExpLogica(AExpMultIgualExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpMultIgualExpLogica(AExpMultIgualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpMultIgualExpLogica(AExpMultIgualExpLogica node)
    {
        inAExpMultIgualExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAExpMultIgualExpLogica(node);
    }

    public void inAExpComparacaoExpLogica(AExpComparacaoExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpComparacaoExpLogica(AExpComparacaoExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpComparacaoExpLogica(AExpComparacaoExpLogica node)
    {
        inAExpComparacaoExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAExpComparacaoExpLogica(node);
    }

    public void inANaoExpParentesExpLogica(ANaoExpParentesExpLogica node)
    {
        defaultIn(node);
    }

    public void outANaoExpParentesExpLogica(ANaoExpParentesExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANaoExpParentesExpLogica(ANaoExpParentesExpLogica node)
    {
        inANaoExpParentesExpLogica(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outANaoExpParentesExpLogica(node);
    }

    public void inAExpParentesExpLogica(AExpParentesExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpParentesExpLogica(AExpParentesExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpParentesExpLogica(AExpParentesExpLogica node)
    {
        inAExpParentesExpLogica(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAExpParentesExpLogica(node);
    }
}
