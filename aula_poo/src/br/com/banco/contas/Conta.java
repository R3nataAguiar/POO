package br.com.banco.contas;

public class Conta {
	// atributos privados
	private int numero;
	private String titular;
	private double saldo;

	public Conta() {

	}

	// Construtor
	public Conta(int numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	// Get e Set
	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public double setSaldo() {
		return saldo;
	}

	// Método para realizar o saque.
	public void Saque(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
		} else {
			System.out.println("\nSaldo insuficiente para o saque.");
		}
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
}
