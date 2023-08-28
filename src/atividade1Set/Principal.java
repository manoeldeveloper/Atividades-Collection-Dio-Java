package atividade1Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {
	
	static Scanner leia = new Scanner(System.in);
	static Set<Convidado> convidados;
	
	public static void main(String[] args) {
		
		convidados = new HashSet<Convidado>();
		
		menu();
	}

	private static void menu() {
		 System.out.println("\n1 - Adicionar Convidado\n2 - Remover Convidado\n"
			 		+ "3 - Listar Convidados\n4 - Contar convidados");
		 				int opt =leia.nextInt();
		 		switch(opt) {
		 		case 1 :
		 			adicionar();
		 			break;
		 		case 2 :
		 			remover();
		 			break;
		 		case 3 :
		 			listar();
		 			break;
		 		case 4 :
		 			contarConvidados();
		 			break;
		
		 		}
		 
	}

	private static void contarConvidados() {
		System.out.println(convidados.size() + " Convidados");
	menu();
	}

	private static void remover() {

		if(convidados.size() > 0) {
			System.out.println("Digite o Id do Convidado:\n");
				int id = leia.nextInt();
					for(Convidado c : convidados) {
						if(c.getId() == id) {
							convidados.remove(c);
						}
					}
		} else {
			System.out.println("Não há convidados");
		}
	menu();
	}

	private static void listar() {

			if(convidados.size() > 0) {
				for(Convidado c : convidados) {
					System.out.println(c);
				}
			} else {
				System.out.println("Não há convidados");
			}
		menu();
	}

	private static void adicionar() {
			System.out.println("Nome do convidado:\n");
			leia.nextLine();
			String nome = leia.nextLine();
			System.out.println("Id do convite:\n");
			int id = leia.nextInt();
			
			Convidado convidado = new Convidado(nome, id);
			
			convidados.add(convidado);
			menu();
	}
}
