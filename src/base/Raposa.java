package base;

public class Raposa extends Animal {
    public Raposa(String nome) {
        super(nome, "Raposa", 55);
    }

    public void cacar(Animal presa) {
        if (vivo && presa.isVivo() && presa instanceof Coelho) {
            presa.perderEnergia(20);
            ganharEnergia(15);
            System.out.println("  "+nome + " cacou o coelho " + presa.getNome());
            System.out.println("  ("+nome + ": +15 de energia | "+ presa.getNome() + ": -20 de energia)");
        } else {
            perderEnergia(5);
            System.out.println("  "+nome + " tentou cacar, mas nao conseguiu.");
        }
    }

    @Override
    public void agir() {
        if (vivo) {
            perderEnergia(5);
            System.out.println("  "+nome + " caminhou procurando alimento. (-5 de energia)");
        }
    }
}
