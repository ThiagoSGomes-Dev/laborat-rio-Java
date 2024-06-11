public enum Moeda {
    USD ("$", "Dolar"),
    EUR ("€", "Euro"),
    BRL ("R$", "Real"),
    JPY ("¥", "Iene");

    private String sigla;
    private String moeda;

    Moeda(String sigla, String moeda) {
        this.sigla = sigla;
        this.moeda = moeda;
    }

    public String getSigla() {
        return sigla;
    }
    public String getMoeda() {
        return moeda;
    }
}
