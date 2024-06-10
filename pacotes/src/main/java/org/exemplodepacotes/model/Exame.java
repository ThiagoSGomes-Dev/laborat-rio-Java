package org.exemplodepacotes.model;

public class Exame {
    private String fixa;
    private String data;
    private String dia;

    public Exame(String fixa, String data, String dia) {
        this.fixa = fixa;
        this.data = data;
        this.dia = dia;
    }
    public String getFixa() {
        return fixa;
    }
}

