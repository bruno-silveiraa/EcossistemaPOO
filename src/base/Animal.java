package base;

public abstract class Animal extends SerVivo {
    protected String especie;

    public Animal(String nome, String especie, int energia) {
        super(nome, energia);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public abstract void agir();

    @Override
    public void mostrarEstado() {
        String estado = vivo ? "vivo" : "morto";
        System.out.println("  [" + especie + "] : " + nome + " | Estado: " + estado + " | Energia: " + energia);
    }
}
