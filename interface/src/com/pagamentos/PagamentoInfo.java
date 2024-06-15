package com.pagamentos;

public class PagamentoInfo {
    private TipoPagamento tipo;
    private double valor;

    public PagamentoInfo(TipoPagamento tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public TipoPagamento getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
