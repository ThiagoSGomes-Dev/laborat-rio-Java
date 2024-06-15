package com.pagamentos;

public class PagamentoUnificado implements CartaoCredito, Debito, Boleto {
    @Override
    public void processarPagamentoCredito(double valor) {
        TipoPagamento tipo = TipoPagamento.CREDITO;
        System.out.println("Processando pagamento de R$" + valor + " com cartão de " + tipo.getTipo() + ".");
    }

    @Override
    public void processarPagamentoDebito(double valor) {
        TipoPagamento tipo = TipoPagamento.DEBITO;
        System.out.println("Processando pagamento de R$" + valor + " com cartão de " + tipo.getTipo() + ".");
    }

    @Override
    public void processarPagamentoBoleto(double valor) {
        TipoPagamento tipo = TipoPagamento.BOLETO;
        System.out.println("Processando pagamento de R$" + valor + " com " + tipo.getTipo() + ".");
    }
}
