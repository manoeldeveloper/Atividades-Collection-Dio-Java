package atividade4List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class Principal {
static Scanner leia = new Scanner(System.in);
	
	static ArrayList<Numero> numeros;
	
	public static void main(String[] args) {
		
		numeros = new ArrayList<Numero>();
		
		menu();
	}

	private static void menu() {
		double soma = 0;
		if(numeros.size() > 0) {
		    for(Numero c : numeros) {
		        soma += c.getNumero();
		    }
		    System.out.println("Valor total: " + soma + "\n");
	    	Collections.sort(numeros);
			System.out.println(numeros);
		} else {
		    System.out.println("Valor total: 0");
		}


	    
		System.out.println("\n1 - Adicionar Valor\n2 - Remover Valor");
		int opt = leia.nextInt();
		
		switch(opt) {
		case 1 :
			add();
			break;
		case 2 :
			remover();
			break;
		}
	}

	private static void remover() {
		if(numeros.size() > 0) {
			System.out.println("Digite o Valor\n");
			int num = leia.nextInt();
			for(int i = 0; i < numeros.size(); i++) {
				Numero n = numeros.get(i);
				if(n.getNumero() == num) {
					numeros.remove(i);
					break;
				}
			}
		}
		
		menu();
	}

	private static void add() {
		System.out.println("Valor:\n");
		int opt = leia.nextInt();
		Numero n = new Numero(opt);
		
		numeros.add(n);
		
		menu();
	}

}
