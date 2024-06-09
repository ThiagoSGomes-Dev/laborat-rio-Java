import java.text.NumberFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        String cep = "23765064";

        try {
            String cepFormatado = CepInvalidoException.formatarCep(cep);
            System.out.println("Cep formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            e.getMessage();
        }
    }
}