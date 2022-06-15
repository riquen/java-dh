package Aula14.Mesa;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Jogador> jogadores = new ArrayList<>();

    public void addJogador(Jogador j) {
        System.out.println("Adicionado.");
    }
    public void mostrarJogadoresTitulares() {
        for (Jogador jogador :
                jogadores) {
            if (jogador.isTitular()) {
                System.out.println("Titulares: " + jogador.getNome());
            }
        }
    }
    public int getQuantidadeJogadoresLesionados() {
        int lesionados = 0;
        for (Jogador jogador :
                jogadores) {
            if(jogador.isLesionado() && jogador.isTitular()) {
                lesionados += 1;
            }
        }
        return lesionados;
    }
}
