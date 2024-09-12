package br.com.aula_poo.segunda_lista;

import java.util.Scanner;
import java.util.logging.Logger;
import br.com.codeArt.uteis.Util;

public class SetimoExercicioSegundaLista {

	static Logger logger = Util.setupLogger();

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			logger.info("Digite o número de estudantes na turma: ");
			int numeroDeEstudantes = sc.nextInt();

			double porcentagemPrimeiraDisciplina = 35.0;
			double porcentagemSegundaDisciplina = 30.0;

			double mediaPorcentagem = (porcentagemPrimeiraDisciplina + porcentagemSegundaDisciplina) / 2.0;

			double estudantesMadrugada = (mediaPorcentagem / 100) * numeroDeEstudantes;

			logger.info(String.format("Em média, %.2f estudantes estudam de madrugada nas duas primeiras disciplinas.",
					estudantesMadrugada));
		}
	}
}