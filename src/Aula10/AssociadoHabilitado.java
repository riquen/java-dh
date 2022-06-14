package Aula10;

import Aula10.Associado;

public class AssociadoHabilitado extends Associado {
    private double custoPiscina = 50.0;
    private boolean habilitado;

    public AssociadoHabilitado(String numeroAssociado, String nome, double valorMensal, String atividade, boolean habilitado) {
        super(numeroAssociado, nome, valorMensal, atividade);
        this.habilitado = habilitado;
    }

    @Override
    public double custoMensal() {
        if (!habilitado) {
            System.out.println("Não habilitado.");
        }
        return custoMensal() + custoPiscina;
    }
}
