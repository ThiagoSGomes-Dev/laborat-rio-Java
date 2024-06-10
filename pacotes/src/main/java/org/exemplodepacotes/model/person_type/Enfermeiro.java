package org.exemplodepacotes.model.person_type;

import org.exemplodepacotes.model.Exame;
import org.exemplodepacotes.model.Pessoa;

public class Enfermeiro extends Pessoa {
    private String documento;
    private String funcao;
    public Enfermeiro(String nome, int idade, String sexo, String documento, String funcao) {
        super(nome, idade, sexo);
        this.documento = documento;
        this.funcao = funcao;
    }

    void parcienteExame(Exame exame) {
        String fixa = exame.getFixa();
    }
    public String getDocumento() {
        return documento;
    }
    public String getFuncao() {
        return funcao;
    }
}
