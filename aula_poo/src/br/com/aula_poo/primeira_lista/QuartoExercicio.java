package br.com.aula_poo.primeira_lista;

import java.util.Scanner;
import java.util.logging.Logger;
import br.com.codeArt.uteis.Util;

public class QuartoExercicio {

	static Logger logger = Util.setupLogger();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		logger.info("Digite a temperatura em graus Celsius:");
		double celsius = sc.nextDouble();

		double fahrenheit = celsius * 1.8 + 32;

		logger.info("A temperatura em Fahrenheit é: " + fahrenheit);

		sc.close();
	}
}
