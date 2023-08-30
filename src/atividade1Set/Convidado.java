package atividade1Set;

public class Convidado {
	
	String nome;
	int id;
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Nome: " + getNome() + ", Id: " + getId();
	}
	protected Convidado(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
	}
	
	

}
