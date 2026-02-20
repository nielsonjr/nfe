package com.fincatto.documentofiscal.nfe400.transformers;

import org.simpleframework.xml.transform.Transform;

import com.fincatto.documentofiscal.nfe400.classes.NFDebito;

public class NFDebitoTransformer implements Transform<NFDebito>{

	@Override
	public NFDebito read(final String codigo) throws Exception {
		return NFDebito.valueOfCodigo(codigo);
	}

	@Override
	public String write(final NFDebito tipo) throws Exception {
		return tipo.getCodigo();
	}

}
