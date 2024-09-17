package br.com.banco.sistema;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import br.com.banco.contas.Conta;

public class Sistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Define o Locale para os EUA
		Locale eua = new Locale("en", "US");
		// Define o fuso horário
		ZoneId zoneId = ZoneId.of("America/New_York");
		// Pega a data e hora
		ZonedDateTime zdt = ZonedDateTime.now(zoneId);
		// Pega a data atual
		LocalDate.now(zoneId);
		// Define o formato da data e hora
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss", eua);
		// Cria um objeto DecimalFormat
		DecimalFormat df = new DecimalFormat("#,##0.00");
		// Cria conta usuário
		Conta minhaConta = new Conta(123, "Renata", 2500.0);
		System.out.println(minhaConta);
		// Pede o valor do saque ao usuário
		System.out.print("\nQual é o valor do saque\n\nValor: R$ ");
		// Lê o valor que o usuário digitou
		Double valor = sc.nextDouble();
		// Realiza o saque na cont
		minhaConta.Saque(valor);
		// Exibe o saldo atualizado
		System.out
				.println("\nSaldo atualizado: R$ " + df.format(minhaConta.getSaldo()) + "  " + zdt.format(formatador));

		sc.close();

	}
}