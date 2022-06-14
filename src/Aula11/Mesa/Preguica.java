package Aula11.Mesa;

public class Preguica extends Animal {
    @Override
    public String som() {
        return "Som da preguiça.";
    }

    @Override
    public String sobeArvore() {
        return super.sobeArvore();
    }
}
