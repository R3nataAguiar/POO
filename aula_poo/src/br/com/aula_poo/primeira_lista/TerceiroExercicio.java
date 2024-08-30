package br.com.aula_poo.primeira_lista;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TerceiroExercicio {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

       
        while (true) {
            try {
                System.out.print("Digite o primeiro número inteiro: ");
                num1 = scanner.nextInt();
                System.out.print("Digite o segundo número inteiro: ");
                num2 = scanner.nextInt();
                break;  
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, insira apenas números inteiros.");
                scanner.next();  
            }
        }

     
        System.out.println("Resultados das operações:");
        
      
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

       
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

 
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

       
        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("Erro: Não é possível dividir por zero.");
        }

        scanner.close();
    }
}






