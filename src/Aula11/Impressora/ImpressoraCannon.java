package Aula11.Impressora;

public class ImpressoraCannon extends Impressora {
    @Override
    public String imprimir() {
        return "Impresso.";
    }

    @Override
    public boolean precisaTinta() {
        return super.precisaTinta();
    }
}
