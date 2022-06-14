package Aula11.Banco;

public class Cheque {
    private double valor;
    private String bancoEmissor;
    private String dataPagamento;

    public Cheque(double valor, String bancoEmissor, String dataPagamento) {
        this.valor = valor;
        this.bancoEmissor = bancoEmissor;
        this.dataPagamento = dataPagamento;
    }

    public double getValor() {
        return valor;
    }
}
