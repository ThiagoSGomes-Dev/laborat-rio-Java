package com.pagamentos;

import java.util.List;

public class ProcessadorDePagamentos {
    private PagamentoUnificado pagamentoUnificado;

    public ProcessadorDePagamentos(PagamentoUnificado pagamentoUnificado) {
        this.pagamentoUnificado = pagamentoUnificado;
    }

    public void processarPagamentos(List<PagamentoInfo> pagamentos) {
        for (PagamentoInfo pagamentoInfo : pagamentos) {
            switch (pagamentoInfo.getTipo()) {
                case DEBITO:
                    pagamentoUnificado.processarPagamentoDebito(pagamentoInfo.getValor());
                    break;
                case CREDITO:
                    pagamentoUnificado.processarPagamentoCredito(pagamentoInfo.getValor());
                    break;
                case BOLETO:
                    pagamentoUnificado.processarPagamentoBoleto(pagamentoInfo.getValor());
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de pagamento inválido: " + pagamentoInfo.getTipo());
            }
        }
    }
}
