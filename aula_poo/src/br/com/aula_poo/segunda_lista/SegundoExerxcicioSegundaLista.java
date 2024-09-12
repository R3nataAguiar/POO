package br.com.aula_poo.segunda_lista;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.logging.Logger;
import br.com.codeArt.uteis.Util;

public class SegundoExerxcicioSegundaLista {

	static Logger logger = Util.setupLogger();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		logger.info("Digite o ano de nascimento: ");
		int ano = sc.nextInt();

		logger.info("Digite o mês de nascimento: ");
		int mes = sc.nextInt();

		logger.info("Digite o dia de nascimento: ");
		int dia = sc.nextInt();

		LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

		LocalDate dataAtual = LocalDate.now();

		Period periodo = Period.between(dataNascimento, dataAtual);
		int idade = periodo.getYears();

		logger.info(String.format("Sua idade é: %d anos.", idade));

		sc.close();
	}
}

