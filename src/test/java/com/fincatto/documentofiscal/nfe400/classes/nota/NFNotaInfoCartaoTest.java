package com.fincatto.documentofiscal.nfe400.classes.nota;

import org.junit.Assert;
import org.junit.Test;

import com.fincatto.documentofiscal.nfe400.FabricaDeObjetosFake;

public class NFNotaInfoCartaoTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroAutorizacaoOperacaoCartaoComTamanhoInvalido() {
        new NFNotaInfoCartao().setNumeroAutorizacaoOperacaoCartao("bd28biJPpJ1jrBr185WiMenxq6GLcCrk5JdtfA9tv1xduiqLWA5rwBNPhjH2GVRFVPtanKa1d5K4XK2rP2v8DT69j4fe0FbdaV6CH0vNY9EqfBUFyWFSanSBegfLeNdrb");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCNPJComTamanhoInvalido() {
        try {
            new NFNotaInfoCartao().setCnpj("1234567890123");
        } catch (final IllegalStateException e) {
            new NFNotaInfoCartao().setCnpj("123456789012345");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCNPJNulo() {
        final NFNotaInfoCartao cartao = new NFNotaInfoCartao();
        cartao.setNumeroAutorizacaoOperacaoCartao("9ItpS1hBk3TyhjUB3I90");
        cartao.setOperadoraCartao(NFOperadoraCartao.MASTERCARD);
        cartao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroAutorizacaoOperacaoCartaoNulo() {
        final NFNotaInfoCartao cartao = new NFNotaInfoCartao();
        cartao.setCnpj("12345678901234");
        cartao.setOperadoraCartao(NFOperadoraCartao.MASTERCARD);
        cartao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOperadoraCartaoNulo() {
        final NFNotaInfoCartao cartao = new NFNotaInfoCartao();
        cartao.setCnpj("12345678901234");
        cartao.setNumeroAutorizacaoOperacaoCartao("9ItpS1hBk3TyhjUB3I90");
        cartao.toString();
    }
    
    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirIdTerminaoPagamentoComTamanhoInvalido() {
        new NFNotaInfoCartao().setIdTerminalPagamento("G1zFSQzC3p4hdXtjjxRFrLYvedB04X5hrFTMia1wx");
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<NFNotaInfoCartao><tpIntegra>1</tpIntegra><CNPJ>12345678901234</CNPJ><tBand>02</tBand><cAut>9ItpS1hBk3TyhjUB3I90</cAut><CNPJReceb>12345678901234</CNPJReceb><idTermPag>erX29U76QbGK1q5QhRZitSHp6MBPG42x63KgM5wu</idTermPag></NFNotaInfoCartao>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoCartao().toString());
    }
}