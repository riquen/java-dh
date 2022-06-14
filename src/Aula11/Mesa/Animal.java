package Aula11.Mesa;

public abstract class Animal {
    private String nome;
    private int idade;

    public abstract String som();

    public String corre() {
        return "Correndo.";
    }

    public String sobeArvore() {
        return "Subindo na árvore.";
    }
}
