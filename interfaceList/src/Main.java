import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String item = null;
        String[] lista = {entrada.next()};
        int contador = 0;
        while (contador < 5 && item.length() > 6) {
            item = lista[contador];
            contador++;
        }
    }
}