package com.fincatto.documentofiscal.nfe400.classes.nota;

public enum NFInfoDeduzDesoneracao {

    NAO("0", "Valor do ICMS desonerado (vICMSDeson) n\u00E3o deduz do valor do item (vProd) / total da NF-e"),
    SIM("1", "Valor do ICMS desonerado (vICMSDeson) deduz do valor do item (vProd) / total da NF-e");

    private final String codigo;
    private final String descricao;

    NFInfoDeduzDesoneracao(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NFInfoDeduzDesoneracao valueOfCodigo(final String codigo) {
        for (final NFInfoDeduzDesoneracao indicador : NFInfoDeduzDesoneracao.values()) {
            if (indicador.getCodigo().equals(codigo)) {
                return indicador;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return codigo + " - " + descricao;
    }
}