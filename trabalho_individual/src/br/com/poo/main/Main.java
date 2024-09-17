package br.com.poo.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.carro.Carro;
import br.com.poo.concessionaria.Concessionaria;
import br.com.poo.files.Menu;

public class Main {  
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    private static final String RELATORIO1_FILE = "./temp/relatorio1_concessionarias_carros.txt";
    private static final String RELATORIO2_FILE = "./temp/relatorio2_concessionarias_carros.txt";

    public static void main(String[] args) {
        Concessionaria concessionaria1 = new Concessionaria(1, "Concessionária Poo", "Rua Serratec, 12345");
        Concessionaria concessionaria2 = new Concessionaria(2, "Concessionária Mágica", "Rua da Magia, 2045");
        Concessionaria concessionaria3 = new Concessionaria(3, "Concessionária Fadinha cor de rosa", "Rua dos Amores, 3050");

        Carro corolla = new Carro(1, "Corolla", "Toyota", 90000, LocalDate.of(2020, 5, 10), 1);
        Carro hondaCivic = new Carro(2, "Civic", "Honda", 95000, LocalDate.of(2019, 3, 15), 1);
        Carro ferrari = new Carro(3, "Ferrari F8", "Ferrari", 1500000, LocalDate.of(2021, 8, 22), 1);
        Carro lamborghini = new Carro(4, "Lamborghini Aventador", "Lamborghini", 2000000, LocalDate.of(2021, 6, 11), 1);
        Carro porsche911 = new Carro(5, "Porsche 911", "Porsche", 1200000, LocalDate.of(2020, 10, 15), 3);
        Carro nissanGTR = new Carro(6, "Nissan GT-R", "Nissan", 1500000, LocalDate.of(2021, 12, 5), 1);

        
        concessionaria1.adicionarCarro(hondaCivic);
        concessionaria2.adicionarCarro(corolla);
        concessionaria3.adicionarCarro(ferrari);
        concessionaria3.adicionarCarro(lamborghini);
        concessionaria2.adicionarCarro(porsche911);
        concessionaria1.adicionarCarro(nissanGTR);

      
        List<Concessionaria> concessionarias = List.of(concessionaria1, concessionaria2, concessionaria3);

        
        Menu menu = new Menu(); 
        menu.exibirMenu(concessionarias);
    }

    
    public static void gerarRelatorio1Impresso(List<Concessionaria> concessionarias) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RELATORIO1_FILE))) {
            for (Concessionaria concessionaria : concessionarias) {
                writer.write("Concessionária: " + concessionaria.getNome());
                writer.newLine();
                for (Carro carro : concessionaria.getCarros()) {
                    writer.write("  Modelo: " + carro.getModelo());
                    writer.newLine();
                }
                writer.newLine();  
            }
            writer.flush();
            logger.info("Relatório 1 gerado com sucesso no arquivo " + RELATORIO1_FILE);
        } catch (IOException e) {
            logger.log(Level.WARNING, "Erro ao gerar o Relatório 1.", e);
        }
    }

    
    public static void gerarRelatorio2Impresso(List<Concessionaria> concessionarias) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RELATORIO2_FILE))) {
            for (Concessionaria concessionaria : concessionarias) {
                writer.write("Concessionária: " + concessionaria.getNome() + " - Endereço: " + concessionaria.getEndereco());
                writer.newLine();
                writer.write("Carros disponíveis:");
                writer.newLine();
                for (Carro carro : concessionaria.getCarros()) {
                    writer.write("  Modelo: " + carro.getModelo() + " | Marca: " + carro.getMarca() + " | Preço: R$" + carro.getPreco() + " | Ano: " + carro.getAnoFabricacao());
                    writer.newLine();
                }
                writer.newLine();  
            }
            writer.flush();
            logger.info("Relatório 2 gerado com sucesso no arquivo " + RELATORIO2_FILE);
        } catch (IOException e) {
            logger.log(Level.WARNING, "Erro ao gerar o Relatório 2.", e);
        }
    }

    
    public static void lerRelatorioArquivo(String nomeArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);  
            }
            logger.info("Relatório lido com sucesso do arquivo " + nomeArquivo);
        } catch (IOException e) {
            logger.log(Level.WARNING, "Erro ao ler o arquivo " + nomeArquivo, e);
        }
    }
}


