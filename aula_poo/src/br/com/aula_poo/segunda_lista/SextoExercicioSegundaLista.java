package br.com.aula_poo.segunda_lista;

import java.util.Scanner;
import java.util.logging.Logger;
import br.com.codeArt.uteis.Util;

public class SextoExercicioSegundaLista {

	static Logger logger = Util.setupLogger();

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int inicioDoIntervalo = 0, fimDoIntervalo = 0;
			int contPrimeiros = 0, contUltimos = 0, soma = 0;
			int primeiro = 0, segundo = 0, terceiro = 0;
			int antiPenultimo = 0, penultimo = 0, ultimo = 0;

			logger.info("Digite o início do intervalo: ");
			inicioDoIntervalo = sc.nextInt();

			logger.info("Digite o fim do intervalo: ");
			fimDoIntervalo = sc.nextInt();

			if (inicioDoIntervalo >= fimDoIntervalo) {
				logger.info("Intervalo inválido. Certifique-se de que o início é menor que o fim.");
				return;
			}

			for (int i = inicioDoIntervalo; i <= fimDoIntervalo; i++) {
				if (i % 6 == 0) {
					contPrimeiros++;
					switch (contPrimeiros) {
					case 1:
						primeiro = i;
						break;
					case 2:
						segundo = i;
						break;
					case 3:
						terceiro = i;
						break;
					default:
						break;
					}
					if (contPrimeiros == 3) {
						break;
					}
				}
			}

			for (int i = fimDoIntervalo; i >= inicioDoIntervalo; i--) {
				if (i % 6 == 0) {
					contUltimos++;
					if (contUltimos == 1) {
						ultimo = i;
					} else if (contUltimos == 2) {
						penultimo = i;
					} else if (contUltimos == 3) {
						antiPenultimo = i;
						break;
					}
				}
			}

			if (contPrimeiros < 3 || contUltimos < 3) {
				logger.info("O intervalo não contém múltiplos de 6 suficientes.");
			} else {

				soma = primeiro + segundo + terceiro + antiPenultimo + penultimo + ultimo;

				logger.info(
						String.format("Os três primeiros múltiplos de 6 são: %d, %d, %d", primeiro, segundo, terceiro));
				logger.info(String.format("Os três últimos múltiplos de 6 são: %d, %d, %d", antiPenultimo, penultimo,
						ultimo));
				logger.info(String.format("O resultado da soma é: %d", soma));
			}
		}
	}
}