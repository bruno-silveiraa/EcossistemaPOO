package base;

public abstract class Coisa {
    protected String nome;
    protected int energia;
    protected boolean vivo;

    public Coisa(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
        this.vivo = true;
    }

    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void perderEnergia(int quantidade) {
        energia -= quantidade;

        if (energia <= 0) {
            energia = 0;
            vivo = false;
        }
    }

    public void ganharEnergia(int quantidade) {
        if (vivo) {
            energia += quantidade;
        }
    }

    public abstract void mostrarEstado();
}
