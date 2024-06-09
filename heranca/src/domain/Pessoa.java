package domain;

public class Pessoa {
    private String nome;
    private String idade;
    private int documento;
    public Pessoa(String nome, String idade, int documento) {
        this.nome = nome;
        this.idade = idade;
        this.documento = documento;
    }
    public String getNome() {
        return nome;
    }
    public String getIdade() {
        return idade;
    }
    public int getDocumento() {
        return documento;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
}
