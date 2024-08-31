package br.com.aula_poo.primeira_lista;

import java.util.Scanner;

public class ExercicioZeus {
	
	public static void main(String[] args) {

        int x = 0, y = 0;
        boolean entradaValida;

        entradaValida = false;

        Scanner sc = new Scanner(System.in);

        while (!entradaValida) {
            System.out.print("Digite o primeiro número inteiro: ");
            x = sc.nextInt();
            System.out.print("Digite o segundo número inteiro: ");
            y = sc.nextInt();

            if (x < 0 || y < 0) {
                System.out.println("Erro: Não é permitido digitar números negativos. Tente novamente.\n");
            } else {
                entradaValida = true;
            }
        }

        System.out.println("Soma: " + (x + y));
        System.out.println("Subtração: " + (x - y));
        System.out.println("Multiplicação: " + (x * y));

        if (y == 0) {
            System.out.println("Erro: Não é permitido dividir por zero.");
        } else {
            System.out.println("Divisão: " + (x / y));
        }

        sc.close();
    }
}