package br.com.poo.files;

import java.util.List;
import java.util.Scanner;
import br.com.poo.concessionaria.Concessionaria;
import br.com.poo.main.Main;

public class Menu {

    public void exibirMenu(List<Concessionaria> concessionarias) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Relatório 1 na Tela");
            System.out.println("2. Relatório 2 na Tela");
            System.out.println("3. Relatório 1 no Arquivo .txt");
            System.out.println("4. Relatório 2 no Arquivo .txt");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    Main.gerarRelatorio1Impresso(concessionarias);
                    break;
                case "2":
                    Main.gerarRelatorio2Impresso(concessionarias);
                    break;
                case "3":
                    Main.gerarRelatorio1Impresso(concessionarias); 
                    Main.lerRelatorioArquivo("./temp/relatorio1_concessionarias_carros.txt");
                    break;
                case "4":
                    Main.gerarRelatorio2Impresso(concessionarias); 
                    Main.lerRelatorioArquivo("./temp/relatorio2_concessionarias_carros.txt");
                    break;
                case "5":
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();
    }
}

