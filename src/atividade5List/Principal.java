package atividade5List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Principal {
	static Scanner leia = new Scanner(System.in);
	static ArrayList<Pessoa> pessoas;
	
	public static void main(String[] args) {
		
		pessoas = new ArrayList<Pessoa>();
		
		menu();
	}

	private static void menu() {
		 System.out.println("\n1 - Adicionar Pessoa\n2 - Remover Pessoa\n"
		 		+ "3 - Listar Pessoas");
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
		 				}
	}

	private static void listar() {

			for(Pessoa p : pessoas) {
				System.out.println(p);
			}
			menu();
	}

	private static void remover() {
	    if (pessoas.size() > 0) {
	        System.out.println("Digite o nome:\n");
	        leia.nextLine();
	        String nome = leia.nextLine();
	        for (int i = 0; i < pessoas.size(); i++) {
	            Pessoa pessoaRemover = pessoas.get(i);
	            if (pessoaRemover.getNome().equalsIgnoreCase(nome)) { 
	                pessoas.remove(i);
	                break;
	            }
	        }
	    }
		Collections.sort(pessoas);
	    menu();
	}

			

	private static void add() {

			System.out.println("Nome:\n");
				leia.nextLine();
				String nome = leia.nextLine();
			System.out.println("Altura:\n");
				double altura = leia.nextDouble();
			System.out.println("Idade:\n");
				int idade = leia.nextInt();
				
					Pessoa pessoa = new Pessoa(nome, altura, idade);
						pessoas.add(pessoa);
						
						Collections.sort(pessoas);
						
		menu();
	}	


}
