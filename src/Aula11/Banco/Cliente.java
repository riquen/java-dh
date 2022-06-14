package Aula11.Banco;

public class Cliente {
    private int idCliente;
    private String nome;
    private int numeroDocumento;
    private int cpf;

    public Cliente(int idCliente, String nome, int numeroDocumento, int cpf) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.numeroDocumento = numeroDocumento;
        this.cpf = cpf;
    }
}
