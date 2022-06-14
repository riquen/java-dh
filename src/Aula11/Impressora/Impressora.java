package Aula11.Impressora;

import java.util.Date;

public abstract class Impressora {
    private String modelo;
    private String tipoConexao;
    private Date dataFabricacao;
    private int folhasDisponiveis;
    private double porcentagemTinta;

    public boolean temPapel() {
        return folhasDisponiveis > 0;
    }
    public boolean precisaTinta() {
        return porcentagemTinta <= 0;
    }
    public abstract String imprimir();
}
