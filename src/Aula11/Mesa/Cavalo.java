package Aula11.Mesa;

public class Cavalo extends Animal {
    @Override
    public String som() {
        return "Relinchando.";
    }

    @Override
    public String corre() {
        return super.corre();
    }
}
