package br.com.aula_poo.primeira_lista;
import java.util.Scanner;


public class ExemploDebyAula {
	
	
	public static void main(String[] args) {
		//instância
		Scanner sc =  new Scanner(System.in);
		//Cadeia Nome
		String nome;
		//cadeia Sobrenome
		String sobrenome;
		//escreva("Digite seu nome")
		System.out.print("Digite seu nome: ");
		//leia (nome)
		nome = sc.nextLine();
		//Escreva("Digite seu sobrenome")
		System.out.print("Digite seu sobrenome: ");
		//leia sobrenome
		sobrenome = sc.nextLine();
		System.out.println("Olá, " + nome + " " + sobrenome + ". Seja bem-vindo ao mundo de POO!");
		//System.out.printf("Olá, %s %s", nome, sobrenome);
		sc.close();
		
		
	}

}
