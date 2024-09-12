package br.com.banco.contas;

public class Conta {
	
	private int numero;
	private String titular;
	private double saldo;
	public Conta() {
		
		
	}
	public Conta(int numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public String getTitular() {
		return titular;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}

	
}
