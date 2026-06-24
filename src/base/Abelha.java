package base;

public class Abelha extends Animal {
    public Abelha(String nome) {
        super(nome, "Abelha", 25);
    }

    public void polinizar(Planta planta) {
        if (vivo && planta.isVivo()) {
            perderEnergia(2);
            System.out.println("  "+nome + " polinizou a planta " + planta.getNome());
            planta.crescer();
        }
    }

    @Override
    public void agir() {
        if (vivo) {
            perderEnergia(2);
            System.out.println("  "+nome + " voou pelo ecossistema.(-2 de energia)");
        }
    }
}
