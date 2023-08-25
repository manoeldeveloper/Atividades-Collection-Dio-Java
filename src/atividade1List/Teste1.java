package atividade1List;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste1 {
	static Scanner leia = new Scanner(System.in);
		
	static ArrayList<Tarefas> tarefas;
	
	public static void main(String[] args) {
		tarefas = new ArrayList<Tarefas>();

		 menu();
		
			
	}

	
	
	
	
	private static void menu() {
		
			System.out.println("Adicionar tarefa digite 1\nRetira Tarefa digite 2\nListar Tarefas digite 3");
			
			int opt = leia.nextInt();
			
			switch(opt) {
			
			case 1 :
				add();
				break;
				
			case 2 :
				retirar();
				break;
				
			case 3 :
				listar();
				
				default:
					System.out.println("Digite o valor correto!");
			
			}
			
		} 
		
	





	private static void listar() {
		if(tarefas.isEmpty() == false) {
		
		for(Tarefas t : tarefas) {
			System.out.println(t + "\n");
		}
	} else {
		System.out.println("Lista vazia");
	}
		menu();
		}




	private static void retirar() {
	    if (tarefas.size() > 0) {
	        System.out.println("Digite a tarefa");
	        leia.nextLine();
	        String le = leia.nextLine();
	        for (int i = 0; i < tarefas.size(); i++) {
	            Tarefas l = tarefas.get(i);
	            if (l.getTarefa().equals(le)) {
	                tarefas.remove(i);
	                break;
	            }
	        }
	    }
	    menu();
	}






	private static void add() {

				System.out.println("Digite a sua tarefa:\n");
				leia.nextLine();
				String l = leia.nextLine();
				
				Tarefas t = new Tarefas(l);
				
				tarefas.add(t);
				menu();
	}
	

}
