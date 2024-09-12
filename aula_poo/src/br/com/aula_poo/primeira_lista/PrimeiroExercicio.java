package br.com.aula_poo.primeira_lista;

import java.util.Scanner;

import br.com.codeArt.uteis.Util;

/*
 * Lista 1 - Exercicio 1
 * Escreva e leia o nome e sobrenome
 */

public class PrimeiroExercicio {

	private static final java.util.logging.Logger logger = Util.setupLogger();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		String sobrenome;

		logger.info("Digite seu nome:");

		nome = sc.nextLine();
		logger.info("Nome digitado: " + nome);

		logger.info("Digite seu sobrenome:");

		sobrenome = sc.nextLine();
		logger.info("Sobrenome digitado: " + sobrenome);

		logger.info("Olá, " + nome + " " + sobrenome + ". Seja bem-vindo ao mundo de POO!");

		sc.close();
		logger.info("Scanner fechado");

	}
}