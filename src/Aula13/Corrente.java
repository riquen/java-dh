package Aula13;

public class Corrente extends Conta implements GravarImposto{
    private double valorPermitido = 1000;
    private double saldo = getSaldo();

    @Override
    public void sacar(double valor) {
        if (saldo <= 0) {
            System.out.println("Saldo insuficiente.");
        }
        if (valorPermitido < valor) {
            System.out.println("Acima do limite permitido.");
        }
        setSaldo(saldo -= valor);
    }

    @Override
    public double imposto(double porcentagem) {
        return saldo/100 * porcentagem;
    }
}
