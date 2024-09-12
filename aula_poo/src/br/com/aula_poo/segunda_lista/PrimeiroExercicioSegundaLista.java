package br.com.aula_poo.segunda_lista;

import java.util.logging.Logger;
import br.com.codeArt.uteis.Util;

class PrimeiroExercicioSegundaLista {

	Logger logger = Util.setupLogger();

	final int UNIVERSO = 42;

	public void executar() {

		logger.info("O significado da vida, do universo e tudo mais é: " + UNIVERSO);

	}

	public static void main(String[] args) {

		PrimeiroExercicioSegundaLista exercicio = new PrimeiroExercicioSegundaLista();

		exercicio.executar();

	}
}
