package mensagem;

//a classe MSNMessenger é ou representa
public abstract class ServicoMensagem {
    public  void enviarMensagem() {
        validarConectadoInternet();
    }
    public void receberMensagem() {
        salvarHistoricoMensagem();
    }
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
