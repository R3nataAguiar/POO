package br.com.aula_poo.balanco;

public class IntegerBalancoTri {
	
	public static void main(String[] args) {
      
        Integer gastosJaneiro = 15000;
        Integer gastosFevereiro = 23000;
        Integer gastosMarco = 17000;

       
        Integer gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

      
        System.out.println("Gasto total no trimestre é: R$ " + gastosTrimestre);
    }
}



