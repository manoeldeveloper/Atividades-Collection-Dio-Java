package atividade2List;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static Scanner leia = new Scanner(System.in);
	
	static ArrayList<Compra> compras;
	
	public static void main(String[] args) {
		
		compras = new ArrayList<Compra>();
		
		menu();
	}

	private static void menu() {
		double soma = 0;
		if(compras.size() > 0) {
		    for(Compra c : compras) {
		        soma += c.getPreco();
		    }
		    System.out.println("Valor da compra: " + soma);
		} else {
		    System.out.println("Valor da compra: 0");
		}

		
		System.out.println("Carrinho de compras\n\n1 - Adicionar item\n2 - Listar itens\n3 - Remover Item:");
		int opt = leia.nextInt();
		
		switch(opt) {
		case 1 :
			add();
			break;
		case 2 :
			listar();
			break;
		case 3 :
			remover();
		}
	}

	private static void remover() {
		if(compras.size() > 0) {
			System.out.println("Digite o nome do produto: \n");
			leia.nextLine();
			String nome = leia.nextLine();
			for(int i = 0; i < compras.size(); i++) {
				Compra c = compras.get(i);
				if(c.getNome().equalsIgnoreCase(nome)) {
					compras.remove(i);
					break;
				}
			}
		} else {
			System.out.println("Não existe produto com esse nome!");
		}
		menu();
	}

	private static void listar() {
       if(compras.size() > 0) {
    	   for(Compra c : compras) {
    		   System.out.println(c);
    	   }
       } else {
    	   System.out.println("Não há compras no carrinho");
       }
       menu();
	}

	private static void add() {
		System.out.println("Nome do produto:\n");
		leia.nextLine();
		String nome = leia.nextLine();
		System.out.println("Preço:\n");
		int preco = leia.nextInt();
		System.out.println("Quantidade que vai pegar:\n");
		int quantidade = leia.nextInt();
		
		Compra escolha = new Compra(nome, preco, quantidade);
		
		compras.add(escolha);
		menu();
	}


}
