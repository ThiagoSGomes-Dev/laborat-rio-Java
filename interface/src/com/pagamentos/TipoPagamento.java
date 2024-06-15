package com.pagamentos;

public enum TipoPagamento {
    DEBITO ("débito"), CREDITO ("crédito"), BOLETO ("boleto");
    private String tipo;

    TipoPagamento(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
