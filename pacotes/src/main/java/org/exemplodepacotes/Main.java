package org.exemplodepacotes;

import org.exemplodepacotes.model.person_type.Enfermeiro;

public class Main {
    public static void main(String[] args) {
        Enfermeiro enfermeiro = new Enfermeiro("Thiago", 25, "M", "200000-09", "Profissional Enfermagem");
        String nome = enfermeiro.getNome();
        String documento = enfermeiro.getDocumento();

        System.out.println("Nome: "+nome+" e Documento: "+documento);
    }
}