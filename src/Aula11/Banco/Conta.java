package Aula11.Banco;

import Aula11.Banco.Cliente;

public abstract class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
    public abstract void sacar(double valor);

    public double informarSaldo() {
        return saldo;
    }
}
