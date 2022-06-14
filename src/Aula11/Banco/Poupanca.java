package Aula11.Banco;

import Aula11.Banco.Cliente;
import Aula11.Banco.Conta;

public class Poupanca extends Conta {
    private double saldo = getSaldo();
    private double jurosMensal = 6;

    public Poupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        if (saldo <= 0) {
            System.out.println("Saldo insuficiente.");
        }
        setSaldo(saldo -= valor);
    }

    public double rendimentoMensal() {
        return saldo/100 * jurosMensal;
    }
}
