public class Main {
    public static void main(String[] args) {
        MetodoComParametro metodoimprimirMensagem1 = new MetodoComParametro();
        MetodoCemParametroComRetorno metodoimprimirMensagem2 = new MetodoCemParametroComRetorno();

        // Chama o método imprimirMensagem da classe Operacoes (Substitui o System.out.println)
        metodoimprimirMensagem1.imprimirMensagem1("Mensagem do método operação");
        String mensagemRetornada = metodoimprimirMensagem2.imprimeMensagem2("Olá, mundo!");
        System.out.print("Mensgame retornada: " + mensagemRetornada);

    }
}