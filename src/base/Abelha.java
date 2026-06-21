package base;

public class Abelha extends Animal {
    public Abelha(String nome) {
        super(nome, "Abelha", 25);
    }

    public void polinizar(Planta planta) {
        if (vivo && planta.isVivo()) {
            planta.crescer();
            perderEnergia(2);
            System.out.println(nome + " polinizou a planta " + planta.getNome());
        }
    }

    @Override
    public void agir() {
        if (vivo) {
            perderEnergia(2);
            System.out.println(nome + " voou pelo ecossistema.");
        }
    }
}
