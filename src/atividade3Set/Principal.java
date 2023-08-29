package atividade3Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Principal {

	
	static Scanner leia = new Scanner(System.in);
	static Set<Agenda> pessoas;
	
	public static void main(String[] args) {
		
		pessoas = new HashSet<Agenda>();
		
		menu();
	}

	private static void menu() {
		 System.out.println("\n1 - Adicionar Contato\n2 - Remover Contato\n"
		 		+ "3 - Listar Contatos\n4 - Pesquisar por nome\n5 - Atualizar contato");
		 			int opt = leia.nextInt();
		 				switch(opt) {
		 				case 1 :
		 					add();
		 					break;
		 				case 2 :
		 					remover();
		 					break;
		 				case 3 :
		 					listar();
		 					break;
		 				case 4 :
		 					pesquisar();
		 					break;
		 				case 5 :
		 					att();
		 					break;
		 				}
	}

	private static void att() {
 
		if(pessoas.size() > 0) {
			System.out.println("Digite o nome:\n");
				leia.nextLine();
					String nome = leia.nextLine();
					
			for(Agenda a : pessoas) {
				if(a.getNome().equalsIgnoreCase(nome)) {
						pessoas.remove(a);
							System.out.println("Digite o novo número:\n");
								int num = leia.nextInt();
							Agenda contato = new Agenda(nome, num);
								
								pessoas.add(contato);
								
				}
			}
		}
	menu();
	}

	private static void pesquisar() {
		if(pessoas.size() > 0) {
			System.out.println("Digite o nome:\n");
				leia.nextLine();
					String nome = leia.nextLine();
					
			for(Agenda a : pessoas) {
				if(a.getNome().equalsIgnoreCase(nome)) {
						System.out.println(a);
				}
			}
		}
	menu();
	}

	private static void listar() {

		 System.out.println("Contatos totais: " + pessoas.size() + "\n\n");
		 	for(Agenda a : pessoas) {
		 		System.out.println(a);
		 	}
	menu();
	}

	private static void remover() {
		if(pessoas.size() > 0) {
			System.out.println("Digite o nome:\n");
				leia.nextLine();
					String nome = leia.nextLine();
					
			for(Agenda a : pessoas) {
				if(a.getNome().equalsIgnoreCase(nome)) {
					pessoas.remove(a);
				}
			}
		}
	menu();
	}

	private static void add() {
		System.out.println("Digite o nome:\n");
			leia.nextLine();
				String nome = leia.nextLine();
		System.out.println("Digite o número:\n");
				int num = leia.nextInt();
				
					Agenda contato = new Agenda(nome, num);
						
						pessoas.add(contato);
	menu();
	}
}









class Agenda {
	String nome;
	int numero;
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected int getNumero() {
		return numero;
	}
	protected void setNumero(int numero) {
		this.numero = numero;
	}
	protected Agenda(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Agenda\nNome:" + getNome() + ", Número: " + getNumero();
	}
	
	
}
