import entity.EnfermeiroEntity;
import mensagem.MsnMessage;
import mensagem.ServicoMensagem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Messenger");
        MsnMessage sysMessage = new MsnMessage();
        sysMessage.enviarMensagem();
        sysMessage.receberMensagem();git
        System.out.println("Facebook");
        MsnMessage sysFacebook = new MsnMessage();
        sysMessage.enviarMensagem();
        sysMessage.receberMensagem();
        System.out.println("Instagram");
        MsnMessage sysInstagram = new MsnMessage();
        sysMessage.enviarMensagem();
        sysMessage.receberMensagem();
    }
}