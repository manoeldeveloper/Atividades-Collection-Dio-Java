package atividade2Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Principal {

	static Scanner leia = new Scanner(System.in);
	static Set<Palavra> palavras;
	
	public static void main(String[] args) {
		
		palavras = new HashSet<Palavra>();
		
		menu();
	}

	private static void menu() {
		 System.out.println("\n1 - Adicionar Palavra\n2 - Remover Palavra\n"
		 		+ "3 - Listar Palavras\n4 - Verificar Palavra");
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
		 					verificar();
		 					break;
		 				}
	}

	private static void verificar() {
		System.out.println("Digite a palavra:\n");
		leia.nextLine();
			String palavra = leia.nextLine();
			
			if(palavras.size() > 0) {
				for(Palavra p : palavras) {
					if(p.getPalavra().equalsIgnoreCase(palavra)) {
						System.out.println(p);
					}
				}
			}
	menu();
	}

	private static void listar() {
		for(Palavra p : palavras) {
			System.out.println(p);
		}
	menu();
	}

	private static void remover() {
		System.out.println("Digite a palavra:\n");
			leia.nextLine();
				String palavra = leia.nextLine();
				
				if(palavras.size() > 0) {
					for(Palavra p : palavras) {
						if(p.getPalavra().equalsIgnoreCase(palavra)) {
							palavras.remove(p);
						}
					}
				}
		menu();
	}

	private static void add() {
		System.out.println("Adicionar palavra:\n");
			leia.nextLine();
				String palavra = leia.nextLine();
					
					Palavra p = new Palavra(palavra);
					
							palavras.add(p);
		menu();
	}

}















class Palavra {
	String palavra;

	protected String getPalavra() {
		return palavra;
	}

	protected void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	protected Palavra(String palavra) {
		super();
		this.palavra = palavra;
	}

	@Override
	public String toString() {
		return "Palavra: " + getPalavra();
	}


	
}
