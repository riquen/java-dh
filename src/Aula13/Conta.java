package Aula13;

public abstract class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
    public abstract void sacar(double valor);

    public double informarSaldo() {
        return saldo;
    }
}
