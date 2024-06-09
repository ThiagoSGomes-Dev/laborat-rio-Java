import entity.EnfermeiroEntity;

public class Main {
    public static void main(String[] args) {
        EnfermeiroEntity pessoaEnfermeiro = new EnfermeiroEntity("João", "27", 200000-9, "08:00-12:00/14:00-17:00", "Enfermaria", 15);
        System.out.println(pessoaEnfermeiro.toString());
    }
}