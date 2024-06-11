public class Main {
    public static void main(String[] args) {
        for(Moeda moedas: Moeda.values()) {
            System.out.println("Sigla: " +moedas.getSigla()+" Moeda: " + moedas.getMoeda());
        }
        Moeda valor = Moeda.BRL;
        System.out.println(valor.getSigla());
    }
}