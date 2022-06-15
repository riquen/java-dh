package Aula14.Exercicio;

public class Conta implements Comparable {
    private int numeroConta;
    private double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public int compareTo(Object obj) {
        Conta conta = (Conta) obj;
        int resposta = 0;
        if (this.getNumeroConta() > conta.getNumeroConta()) {
            resposta = 1;
        }
        if (this.getNumeroConta() < conta.getNumeroConta()) {
            resposta = -1;
        }
        return resposta;
    }
}
