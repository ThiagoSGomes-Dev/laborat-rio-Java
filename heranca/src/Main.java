import mensagem.MsnFacebook;
import mensagem.MsnInstagram;
import mensagem.MsnMessenger;
import mensagem.ServicoMensagem;

public class Main {
    public static void main(String[] args) {
        ServicoMensagem smi = null;

		/*
		    NÃO SE SABE QUAL APP
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
        String appEscolhido="fbm";

        if(appEscolhido.equals("msn"))
            smi = new MsnMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new MsnFacebook();
        else if(appEscolhido.equals("tlg"))
            smi = new MsnInstagram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}