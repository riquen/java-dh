package Aula10;

public class Associado {
    private String numeroAssociado;
    private String nome;
    private double valorMensal;
    private String atividade;

    public Associado(String numeroAssociado, String nome, double valorMensal, String atividade) {
        this.numeroAssociado = numeroAssociado;
        this.nome = nome;
        this.valorMensal = valorMensal;
        this.atividade = atividade;
    }

    public double custoMensal() {
        return valorMensal;
    }
}
