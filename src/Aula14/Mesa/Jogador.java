package Aula14.Mesa;

public class Jogador implements Comparable {
    private int numeroCamisa;
    private String nome;
    private boolean lesionado;
    private boolean titular;

    public String getNome() {
        return nome;
    }
    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public int compareTo(Object obj) {
        Jogador jogador = (Jogador) obj;
        int resposta = 0;
        if (this.getNumeroCamisa() > jogador.getNumeroCamisa()) {
            resposta = 1;
        }
        if (this.getNumeroCamisa() < jogador.getNumeroCamisa()) {
            resposta = -1;
        }
        return resposta;
    }
}
