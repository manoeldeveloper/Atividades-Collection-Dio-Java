package atividade5List;

public class Pessoa implements Comparable<Pessoa>{
    String nome;
    double altura;
    int idade;

    protected Pessoa(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected double getAltura() {
        return altura;
    }

    protected void setAltura(double altura) {
        this.altura = altura;
    }

    protected int getIdade() {
        return idade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa: " + getNome() + ", Altura:" + getAltura() + ", Idade:" + getIdade() + "]";
    }

    @Override
    public int compareTo(Pessoa o) {
        if (this.getIdade() < o.getIdade()) {
            return -1;
        } else if (this.getIdade() > o.getIdade()) {
            return 1;
        } else {
            // Se as idades forem iguais, compare com base na altura
            if (this.getAltura() < o.getAltura()) {
                return -1;
            } else if (this.getAltura() > o.getAltura()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

}
