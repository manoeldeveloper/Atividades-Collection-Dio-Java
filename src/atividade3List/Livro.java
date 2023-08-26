package atividade3List;

public class Livro {
	
	String nome, autor;
	int ano;
	protected Livro(String nome, String autor, int ano) {
		this.nome = nome;
		this.autor = autor;
		this.ano = ano;
	}
	@Override
	public String toString() {
		return "\nLivro: " + getNome() + "\nAutor: " + getAutor() + "\nAno: " + getAno();
	}
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected String getAutor() {
		return autor;
	}
	protected void setAutor(String autor) {
		this.autor = autor;
	}
	protected int getAno() {
		return ano;
	}
	protected void setAno(int ano) {
		this.ano = ano;
	}
	
	

}
