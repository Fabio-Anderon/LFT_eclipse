/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.analysis;

import java.util.*;
import portugol.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelDeclaracao(AVariavelDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstDeclaracao(AConstDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclVar(ADeclVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntTipo(AIntTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACharTipo(ACharTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdVariavel(AIdVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVetorVariavel(AVetorVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumIntValor(ANumIntValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumRealValor(ANumRealValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeiaComando(ALeiaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEscrevaComando(AEscrevaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAvalieComando(AAvalieComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARepitaComando(ARepitaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpVirgula(AExpVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElseParte(AElseParte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACasoOpcao(ACasoOpcao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPadrao(APadrao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPasso(APasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIPara(AIPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANPara(ANPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosExpGlobalExpGlobal(AMenosExpGlobalExpGlobal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASomaExpGlobal(ASomaExpGlobal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpLogicaExpGlobal(AExpLogicaExpGlobal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProdutoTermo(AProdutoTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpGlobalParentesFator(AExpGlobalParentesFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelFator(AVariavelFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorFator(AValorFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaisSoma(AMaisSoma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosSoma(AMenosSoma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProdutoMult(AProdutoMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivisaoMult(ADivisaoMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASomaExpTermo(ASomaExpTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultFator(AMultFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAXorExpLogica(AXorExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpOuExpLogica(AExpOuExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuExpOu(AOuExpOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpEExpOu(AExpEExpOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEExpE(AEExpE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpIgualExpE(AExpIgualExpE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpIgual(AExpIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpComparacaoExpIgual(AExpComparacaoExpIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpComparacao(AExpComparacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpNaoExpComparacao(AExpNaoExpComparacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpNao(AExpNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualIgualDiferente(AIgualIgualDiferente node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADiferenteIgualDiferente(ADiferenteIgualDiferente node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorOpComparar(AMaiorOpComparar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorOpComparar(AMenorOpComparar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorIgualOpComparar(AMaiorIgualOpComparar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorIgualOpComparar(AMenorIgualOpComparar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPrograma(TPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFim(TFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConst(TConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVar(TVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscreva(TEscreva node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeia(TLeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteiro(TInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntao(TEntao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimSe(TFimSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAvalie(TAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaso(TCaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimAvalie(TFimAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFaca(TFaca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAte(TAte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimEnquanto(TFimEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepita(TRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDe(TDe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPasso(TPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPare(TPare node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTContinue(TContinue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimPara(TFimPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMais(TMais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProduto(TProduto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDivisao(TDivisao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtribuicao(TAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPts(TDoisPts node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPtVirg(TPtVirg node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreParantes(TAbreParantes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaParentes(TFechaParentes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreColchete(TAbreColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaColchete(TFechaColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXor(TXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiferente(TDiferente node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaior(TMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentificador(TIdentificador node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumInt(TNumInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumReal(TNumReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAllEspaco(TAllEspaco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentLinha(TComentLinha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentAninhado(TComentAninhado node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentEscopo(TComentEscopo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentEstrela(TComentEstrela node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentBarra(TComentBarra node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentFim(TComentFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
