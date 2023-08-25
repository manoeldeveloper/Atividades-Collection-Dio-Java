package atividade2List;

public class Compra {
	
	String nome;
	double preco;
	int quantidade;
	
	
	
	protected Compra(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "\nProduto: " + getNome() + "\nPreço: " + getPreco() + "\nQuantidade: " + getQuantidade();
	}
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected double getPreco() {
		return preco;
	}
	protected void setPraco(double preco) {
		this.preco = preco;
	}
	protected int getQuantidade() {
		return quantidade;
	}
	protected void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
