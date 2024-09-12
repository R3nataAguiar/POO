package br.com.aula_poo.segunda_lista;

import java.util.Scanner;
import java.util.logging.Logger;
import br.com.codeArt.uteis.Util;

public class QuintoExercicioSegundaLista {

	static Logger logger = Util.setupLogger();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		logger.info("Digite o valor em horas:");
		double horas = sc.nextDouble();

		logger.info("\nPasso a passo da conversão:");

		double minutos = horas * 60;
		logger.info(
				String.format("1. Multiplicando as horas por 60 para converter em minutos: %.2f * 60 = %.2f minutos",
						horas, minutos));

		double segundos = minutos * 60;
		logger.info(String.format(
				"2. Multiplicando os minutos por 60 para converter em segundos: %.2f * 60 = %.2f segundos", minutos,
				segundos));

		logger.info(
				String.format("\nO total de segundos equivalentes a %.2f horas é: %.2f segundos.", horas, segundos));

		sc.close();
	}
}