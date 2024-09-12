package br.com.aula_poo.segunda_lista;

import java.util.Scanner;
import java.util.logging.Logger;
import br.com.codeArt.uteis.Util;  // Assumindo que essa é a biblioteca util para o logger

public class QuartoExercicioSegundaLista {

    // Instanciando o Logger 
    static Logger logger = Util.setupLogger();

    public static void main(String[] args) {
        // Criando um objeto Scanner 
        Scanner sc = new Scanner(System.in);

        // Solicitando ao usuário os três ângulos
        logger.info("Digite o valor do primeiro ângulo:");
        int angulo1 = sc.nextInt();

        logger.info("Digite o valor do segundo ângulo:");
        int angulo2 = sc.nextInt();

        logger.info("Digite o valor do terceiro ângulo:");
        int angulo3 = sc.nextInt();

        // Verificando se os ângulos formam um triângulo válido (soma deve ser 180)
        if (angulo1 + angulo2 + angulo3 == 180) {
            // Classificando o triângulo com base nos ângulos
            if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
                logger.info("Triângulo Acutângulo: Todos os ângulos são menores que 90 graus.");
            } else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
                logger.info("Triângulo Retângulo: Um dos ângulos é exatamente 90 graus.");
            } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
                logger.info("Triângulo Obtusângulo: Um dos ângulos é maior que 90 graus.");
            }
        } else {
            logger.info("Os ângulos fornecidos não formam um triângulo válido. A soma dos ângulos deve ser 180 graus.");
        }

        // Exibindo os ângulos inseridos usando String.format
        logger.info(String.format("Ângulos fornecidos: %d, %d, %d", angulo1, angulo2, angulo3));

        sc.close();
    }
}