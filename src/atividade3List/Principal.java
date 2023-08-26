package atividade3List;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
static Scanner leia = new Scanner(System.in);
	
	static ArrayList<Livro> livros;
	
	public static void main(String[] args) {
		
		livros = new ArrayList<Livro>();
		
		menu();
	}

	private static void menu() {
		System.out.println("Livros\n1 - Adicionar Livro\n2 - Listar Livros por autor\n"
				+ "3 - Pesquisar Livro\n4 - Pesquisar por intervalo de anos");
		int opt = leia.nextInt();
		
		switch(opt) {
		case 1 :
			add();
			break;
		case 2 :
			listarPorAutor();
			break;
		case 3 :
			listarLivros();
			break;
		case 4 :
			listarPorAnos();
			break;
		}
	}

	private static void listarPorAnos() {
		 boolean autorEncontrado = false;
	        if(livros.size() > 0) {
	            System.out.println("Digite o ano máximo:");
	            leia.nextLine();
	            int ano = leia.nextInt();
	            for(Livro a : livros) {
	                if(a.getAno() <= ano) {
	                    autorEncontrado = true;
	                    System.out.println(a);
	                }
	            }
	        } else {
	            System.out.println("Não há livros com esse autor registrado para consulta");
	        }

			menu();
	}

	private static void listarPorAutor() {
        boolean autorEncontrado = false;
        if(livros.size() > 0) {
            System.out.println("Digite o nome do Autor:");
            leia.nextLine();
            String autor = leia.nextLine();
            for(Livro a : livros) {
                if(a.getAutor().equalsIgnoreCase(autor)) {
                    autorEncontrado = true;
                    System.out.println(a);
                }
            }
        } else {
            System.out.println("Não há livros com esse autor registrado para consulta");
        }

		menu();
	}

	private static void listarLivros() {
		boolean livroEncontrado = false;
        if(livros.size() > 0) {
     	   System.out.println("Digite o nome do livro:");
     	   leia.nextLine();
     	   String livro = leia.nextLine();
               for(Livro l : livros) {
             	  if(l.getNome().equalsIgnoreCase(livro)) {
             		  livroEncontrado = true;
             		  System.out.println(l);
             		  
             	}
               }
        } else {
     	   System.out.println("Não há esse livros registrado para consulta");
        }
		menu();
	}

	private static void add() {
			System.out.println("Nome do Livro: ");
			leia.nextLine();
			String nome = leia.nextLine();
			System.out.println("Autor: ");
			leia.nextLine();
			String autor = leia.nextLine();
			System.out.println("Ano de publicação: ");
			int ano = leia.nextInt();
			
			Livro livro = new Livro(nome, autor, ano);
			
			livros.add(livro);

			menu();
	}
}
