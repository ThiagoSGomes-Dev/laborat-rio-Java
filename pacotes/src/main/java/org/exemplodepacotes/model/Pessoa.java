package org.exemplodepacotes.model;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public String getNome() {
        return nome;
    }
}
