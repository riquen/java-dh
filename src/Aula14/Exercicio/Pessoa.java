package Aula14.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private List<Conta> contas = new ArrayList<>();

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }
    public boolean ehMaiorIdade() {
        return idade > 17;
    }
    public double getSaldoTotal() {
        double saldo = 0;
        for (Conta conta :
                contas) {
            saldo += conta.getSaldo();
        }
        return saldo;
    }
    public void mostrarContas() {
        for (Conta conta :
                contas) {
            System.out.println("Conta: " + conta.getNumeroConta() + " com saldo de R$" + conta.getSaldo());
        }
    }
}
