package base;

public class Coelho extends Animal {
    public Coelho(String nome) {
        super(nome, "Coelho", 40);
    }

    public void comer(Planta planta) {
        if (vivo && planta.isVivo()) {
            planta.serConsumida(10);
            ganharEnergia(8);
            System.out.println(nome + " comeu parte da planta " + planta.getNome());
        }
    }

    @Override
    public void agir() {
        if (vivo) {
            perderEnergia(3);
            System.out.println(nome + " pulou pelo ecossistema.");
        }
    }
}
