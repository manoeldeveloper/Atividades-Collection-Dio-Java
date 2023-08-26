package atividade6List;


public class Numero implements Comparable<Numero> {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public int compareTo(Numero outroNumero) {
        return Integer.compare(this.numero, outroNumero.numero);
    }

    @Override
    public String toString() {
        return Integer.toString(getNumero());
    }
}
