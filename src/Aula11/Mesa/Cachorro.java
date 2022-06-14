package Aula11.Mesa;

public class Cachorro extends Animal {
    @Override
    public String som() {
        return "Latindo.";
    }

    @Override
    public String corre() {
        return super.corre();
    }
}
