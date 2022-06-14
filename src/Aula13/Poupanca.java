package Aula13;

public class Poupanca extends Conta {
    private double saldo = getSaldo();

    @Override
    public void sacar(double valor) {
        if (saldo <= 0) {
            System.out.println("Saldo insuficiente.");
        }
        setSaldo(saldo -= valor);
    }

    public void cobrarJuros() {
        System.out.println("");
    }
}
