package br.com.aula_poo.primeira_lista;
import java.util.Scanner;

public class SegundoExercicio {
    
	public static void main(String[] args) {

        
       
 Scanner scanner = new Scanner(System.in);
           
        int somaDasIdades = 0;

        
        System.out.print("Digite a sua idade: ");
        int minhaIdade = scanner.nextInt();
        somaDasIdades += minhaIdade; 

        for (int i = 1; i <= 5; i++) {  
            System.out.print("Digite a idade do colega " + i + ": ");
            int idade = scanner.nextInt();
            somaDasIdades += idade;  
        }

        System.out.println("A soma das idades é: " + somaDasIdades);
        
        scanner.close();  
    }
}