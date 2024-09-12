package br.com.banco.sistema;

import java.text.DecimalFormat;
import java.util.Locale;

import br.com.banco.contas.Conta;

public class SistemaInterno {
	Locale eua = new Locale("en", "US");

	public static void main(String[] args) {
		
	    DecimalFormat df = new DecimalFormat("#.##");
	    
		Conta minhaConta = new Conta(123, "Igor", Double.parseDouble(df.format(2500.0)));
		System.out.println(minhaConta);
		
		



	}

}
