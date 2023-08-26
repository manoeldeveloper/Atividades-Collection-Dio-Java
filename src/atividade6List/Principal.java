package atividade6List;

import java.util.ArrayList;
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
			System.out.println("\n1 - Adicionar Números\n2 - Listar Pessoas");
				int opt = leia.nextInt();
					switch(opt) {
					case 1:
						add();
						break;
					case 2 :
						listar();
						break;
					}
		}

		private static void listar() {
			if(numeros.size() > 0) {
				for(Numero n : numeros) {
					System.out.println(n);
				}
			} else {
				System.out.println("Não há números");
			}
			menu();
		}

		private static void add() {

			System.out.println("Adicionar número:\n");
				int opt = leia.nextInt();
					Numero numero = new Numero(opt);
						numeros.add(numero);
			Collections.sort(numeros);
						menu();
						
				
		}
}
