package com.fincatto.documentofiscal.nfe400.transformers;

import org.simpleframework.xml.transform.Transform;

import com.fincatto.documentofiscal.nfe400.classes.nota.NFInfoDeduzDesoneracao;

public class NFInfoDeduzDesoneracaoTransformer implements Transform<NFInfoDeduzDesoneracao> {

    @Override
    public NFInfoDeduzDesoneracao read(final String codigo) {
        return NFInfoDeduzDesoneracao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFInfoDeduzDesoneracao deduzDesoneracao) {
        return deduzDesoneracao.getCodigo();
    }
}