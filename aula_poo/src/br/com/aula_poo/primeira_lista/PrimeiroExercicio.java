package br.com.aula_poo.primeira_lista;
import java.util.Scanner;

/*
 * Lista 1 - Exercicio 1
 * Escreva e leia o nome e sobrenome
 */


public class PrimeiroExercicio {

	public static void main(String[] args) {
		//declaro scanner para input de dados
		Scanner sc = new Scanner(System.in);
		// perguntar nome
		System.out.print("Qual seu nome?"); 
		// espera e captura a entrada do usuário
		String nome = sc.nextLine();
		
		System.out.print("Qual seu sobrenome?");
		String sobrenome = sc.nextLine();
		
		System.out.println("Olá " + nome + " " + sobrenome  + ", seja bem vindo ao universo da programação!");
	    System.out.printf("Olá %s %s, seja bem vindo ao universo da programação!", nome, sobrenome);
		sc.close();
		
	
		
	}

}
