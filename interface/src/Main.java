import com.pagamentos.PagamentoInfo;
import com.pagamentos.TipoPagamento;
import com.pagamentos.ProcessadorDePagamentos;
import com.pagamentos.PagamentoUnificado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Lista para armazenar os pagamentos
        List<PagamentoInfo> pagamentos = new ArrayList<>();

        // Capturando os valores de entrada para cada tipo de pagamento
        System.out.print("Digite o valor para pagamento com crédito: ");
        double valorCredito = entrada.nextDouble();
        pagamentos.add(new PagamentoInfo(TipoPagamento.CREDITO, valorCredito));

        System.out.print("Digite o valor para pagamento com débito: ");
        double valorDebito = entrada.nextDouble();
        pagamentos.add(new PagamentoInfo(TipoPagamento.DEBITO, valorDebito));

        System.out.print("Digite o valor para pagamento com boleto: ");
        double valorBoleto = entrada.nextDouble();
        pagamentos.add(new PagamentoInfo(TipoPagamento.BOLETO, valorBoleto));

        PagamentoUnificado pagamentoUnificado = new PagamentoUnificado();
        ProcessadorDePagamentos processador = new ProcessadorDePagamentos(pagamentoUnificado);

        // Processando os pagamentos
        for (PagamentoInfo pagamento : pagamentos) {
            processador.processarPagamentos(Collections.singletonList(pagamento));
        }
    }
}
