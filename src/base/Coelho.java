package base;

public class Coelho extends Animal {
    public Coelho(String nome) {
        super(nome, "Coelho", 40);
    }

    public void comer(Planta planta) {
        if (vivo && planta.isVivo()) {
            ganharEnergia(8);
            System.out.println("  "+nome + " comeu parte da planta " + planta.getNome() + " (+8 de energia)");
            planta.serConsumida(10);
        }
    }

    @Override
    public void agir() {
        if (vivo) {
            perderEnergia(3);
            System.out.println("  "+nome + " pulou pelo ecossistema.(-3 de energia)");
        }
    }
}
