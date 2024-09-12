package br.com.aula_poo.primeira_lista;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.codeArt.uteis.Util;

public class SegundoExercicio {

	Logger logger = Util.setupLogger();

	public static void main(String[] args) {

		SegundoExercicio exercicio = new SegundoExercicio();
		Scanner sc = new Scanner(System.in);

		int somaDasIdades = 0;

		exercicio.logger.info("Digite a sua idade: ");
		int minhaIdade = sc.nextInt();
		somaDasIdades += minhaIdade;

		for (int i = 1; i <= 5; i++) {
			exercicio.logger.info(String.format("Digite a idade do colega %d: ", i));
			int idade = sc.nextInt();
			somaDasIdades += idade;
		}

		exercicio.logger.info(String.format("A soma das idades é: %d", somaDasIdades));

		sc.close();
	}
}