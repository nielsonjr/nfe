package com.fincatto.documentofiscal.nfe400.transformers;

import org.simpleframework.xml.transform.Transform;

import com.fincatto.documentofiscal.nfe400.classes.NFCredito;

public class NFCreditoTransformer implements Transform<NFCredito>{

	@Override
	public NFCredito read(final String codigo) throws Exception {
		return NFCredito.valueOfCodigo(codigo);
	}

	@Override
	public String write(final NFCredito tipo) throws Exception {
		return tipo.getCodigo();
	}

}
