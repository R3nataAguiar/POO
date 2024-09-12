package br.com.aula_poo.segunda_lista;

import java.util.Scanner;
import java.util.logging.Logger;
import br.com.codeArt.uteis.Util; // Assumindo que essa é a biblioteca util para o logger

public class TerceiroExercicioSegundaLista {

	static Logger logger = Util.setupLogger();

	static String[] produtos = { "Produto A", "Produto B", "Produto C", "Produto D", "Produto E" };
	static int[] quantidades = { 10, 0, 5, 0, 8 };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;

		while (continuar) {

			logger.info("1. Listar Produtos com estoque");
			logger.info("2. Listar Produtos sem estoque");
			logger.info("3. Sair");
			logger.info("Escolha uma opção: ");

			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				listarComEstoque();
				break;
			case 2:
				listarSemEstoque();
				break;
			case 3:
				continuar = confirmarSaida(scanner);
				break;
			default:
				logger.info("Opção inválida. Por favor, tente novamente.");
			}
		}

		logger.info("Programa encerrado.");
		scanner.close();
	}

	private static void listarComEstoque() {
		logger.info("\nProdutos com estoque:");
		boolean temEstoque = false;
		for (int i = 0; i < produtos.length; i++) {
			if (quantidades[i] > 0) {
				logger.info(String.format("%s - Quantidade: %d", produtos[i], quantidades[i]));
				temEstoque = true;
			}
		}
		if (!temEstoque) {
			logger.info("Não há produtos com estoque.");
		}
	}

	private static void listarSemEstoque() {
		logger.info("\nProdutos sem estoque:");
		boolean semEstoque = false;
		for (int i = 0; i < produtos.length; i++) {
			if (quantidades[i] == 0) {
				logger.info(produtos[i]);
				semEstoque = true;
			}
		}
		if (!semEstoque) {
			logger.info("Todos os produtos têm estoque.");
		}
	}

	private static boolean confirmarSaida(Scanner scanner) {
		logger.info("Você realmente deseja sair? (sim/não): ");
		String resposta = scanner.nextLine().trim().toLowerCase();
		return !resposta.equals("não");
	}
}


