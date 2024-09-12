package br.com.aula_poo.balanco;

import java.math.BigDecimal;

public class BigDecimalBalancoTri {
	
	
	 public static void main(String[] args) {
      
        BigDecimal gastosJaneiro = new BigDecimal("15000");
        BigDecimal gastosFevereiro = new BigDecimal("23000");
        BigDecimal gastosMarco = new BigDecimal("17000");

      
        BigDecimal gastosTrimestre = gastosJaneiro.add(gastosFevereiro).add(gastosMarco);

      
        System.out.println("Gasto total no trimestre é: R$ " + gastosTrimestre);
    }
}

