package br.com.aula_poo.primeira_lista;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.codeArt.uteis.Util;

public class TerceiroExercicio {

	static Logger logger = Util.setupLogger();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 0, y = 0;
		boolean entradaValida = false;

		while (!entradaValida) {
			logger.info("Digite o primeiro número inteiro: ");
			x = sc.nextInt();
			logger.info("Digite o segundo número inteiro: ");
			y = sc.nextInt();

			if (x < 0 || y < 0) {
				logger.info("Erro: Não é permitido digitar números negativos. Tente novamente.\n");
			} else {
				entradaValida = true;
			}
		}

		logger.info(String.format("Soma: %d", (x + y)));
		logger.info(String.format("Subtração: %d", (x - y)));
		logger.info(String.format("Multiplicação: %d", (x * y)));

		if (y == 0) {
			logger.info("Erro: Não é permitido dividir por zero.");
		} else {
			logger.info(String.format("Divisão: %d", (x / y)));
		}

		sc.close();
	}
}