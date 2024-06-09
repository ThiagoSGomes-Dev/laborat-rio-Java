package entity;

import domain.Pessoa;

public class EnfermeiroEntity extends Pessoa {
    private String horarioDeTrabalho;
    private String setor;
    private int numeroCadastro;
    public EnfermeiroEntity(String nome, String idade, int documento, String horarioDeTrabalho, String setor, int numeroCadastro) {
        super(nome, idade, documento);
        this.horarioDeTrabalho = horarioDeTrabalho;
        this.setor = setor;
        this.numeroCadastro = numeroCadastro;
    }
    public String getHorarioDeTrabalho() {
        return horarioDeTrabalho;
    }
    public String getSetor() {
        return setor;
    }
    public int getNumeroCadastro() {
        return numeroCadastro;
    }
    public void setHorarioDeTrabalho(String horarioDeTrabalho) {
        this.horarioDeTrabalho = horarioDeTrabalho;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void setNumeroCadastro(int numeroCadastro) {
        this.numeroCadastro = numeroCadastro;
    }
}