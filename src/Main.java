import base.Abelha;
import base.Animal;
import base.Coelho;
import base.Planta;
import base.Raposa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Planta planta = new Planta("Planta geral", 50, 3);
        Coelho coelho = new Coelho("Nino");
        Raposa raposa = new Raposa("Rubi");
        Abelha abelha = new Abelha("Mel");

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(coelho);
        animais.add(raposa);
        animais.add(abelha);

        int opcao;

        do {
            System.out.println("\n=== Menu do Ecossistema ===");
            System.out.println("1 - Mostrar estado do ecossistema");
            System.out.println("2 - Fazer a planta crescer");
            System.out.println("3 - Fazer o coelho comer a planta");
            System.out.println("4 - Fazer a abelha polinizar a planta");
            System.out.println("5 - Fazer a raposa cacar o coelho");
            System.out.println("6 - Fazer todos os animais agirem");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    mostrarEcossistema(planta, animais);
                    break;
                case 2:
                    planta.crescer();
                    break;
                case 3:
                    coelho.comer(planta);
                    break;
                case 4:
                    abelha.polinizar(planta);
                    break;
                case 5:
                    raposa.cacar(coelho);
                    break;
                case 6:
                    for (Animal animal : animais) {
                        animal.agir();
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o ecossistema...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void mostrarEcossistema(Planta planta, ArrayList<Animal> animais) {
        System.out.println("\n=== Estado do ecossistema ===");
        planta.mostrarEstado();

        for (Animal animal : animais) {
            animal.mostrarEstado();
        }
    }
}
