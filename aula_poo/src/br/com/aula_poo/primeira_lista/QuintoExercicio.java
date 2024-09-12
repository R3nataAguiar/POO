package br.com.aula_poo.primeira_lista;

import java.util.Scanner;
import java.util.logging.Logger;
import br.com.codeArt.uteis.Util;

public class QuintoExercicio {

	static Logger logger = Util.setupLogger();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int resultadoA = 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66;
		logger.info(String.format("O resultado da expressão a é: %d", resultadoA));

		int resultadoB = 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9;
		logger.info(String.format("O resultado da expressão b é: %d", resultadoB));

		sc.close();

	}
}
