package base;

public class Planta extends SerVivo {
    private int tamanho;

    public Planta(String nome, int energia, int tamanho) {
        super(nome, energia);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void crescer() {
        if (!vivo) {
            System.out.println("  " + nome + " esta morta e nao pode mais crescer.");
            return;
        }
        if (tamanho >= 10) {
            System.out.println("  " + nome + " ja atingiu o tamanho maximo!");
            return;
        }
        tamanho ++;
        ganharEnergia(5);
        System.out.println("  " + nome + " cresceu! Tamanho: " + tamanho + " (+5 de energia)");
    }

    public void serConsumida(int quantidade) {
        if (!vivo) return;
        perderEnergia(quantidade);
        tamanho = Math.max(0, tamanho - 1);
        if (energia <= 0) {
            vivo = false;
            System.out.println("  " + nome + " foi totalmente consumida e morreu.");
        } else {
            System.out.println("  " + nome + " foi consumida -> Energia restante: " + energia + " | Tamanho atual: "+tamanho);
        }
    }

    @Override
    public void mostrarEstado() {
        String estado = vivo ? "viva" : "morta";
        System.out.println("  [Planta] : " + nome + " | Estado: " + estado + " | Tamanho: " + tamanho + " | Energia: " + energia);
    }
}
