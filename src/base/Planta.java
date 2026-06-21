package base;

public class Planta extends Coisa {
    private int tamanho;

    public Planta(String nome, int energia, int tamanho) {
        super(nome, energia);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void crescer() {
        if (vivo) {
            tamanho++;
            ganharEnergia(5);
            System.out.println(nome + " cresceu. Tamanho atual: " + tamanho);
        }
    }

    public void serConsumida(int quantidade) {
        if (vivo) {
            perderEnergia(quantidade);
            tamanho--;

            if (tamanho < 0) {
                tamanho = 0;
            }

            System.out.println(nome + " foi consumida e perdeu energia.");
        }
    }

    @Override
    public void mostrarEstado() {
        String estado = vivo ? "viva" : "morta";
        System.out.println("Planta " + nome + " esta " + estado + ", tamanho " + tamanho + " e energia " + energia);
    }
}
