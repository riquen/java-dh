package Aula11.Banco;

import Aula11.Banco.Cheque;
import Aula11.Banco.Cliente;
import Aula11.Banco.Conta;

public class Corrente extends Conta {
    private double saldo = getSaldo();
    private double limiteSaque = 1000;
    private double chequeEspecial = 100;
    private Cheque cheque;

    public Corrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        if (saldo + chequeEspecial < valor) {
            System.out.println("Saldo insuficiente.");
        }
        if (limiteSaque < valor) {
            System.out.println("Acima do limite permitido.");
        }
        setSaldo(saldo -= valor);
    }

    public void depositar(Cheque cheque) {
        setSaldo(saldo += cheque.getValor());
    }
}
