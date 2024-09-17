package br.com.poo.carro;

import java.time.LocalDate;

public class Carro {

	private int idCarro;
	private String modelo;
	private String marca;
	private double preco;
	private LocalDate anoFabricacao;
	private int idConcessionaria;

	
	public Carro(int idCarro, String modelo, String marca, double preco, LocalDate anoFabricacao,
			int idConcessionaria) {
		this.idCarro = idCarro;
		this.modelo = modelo;
		this.marca = marca;
		this.preco = preco;
		this.anoFabricacao = anoFabricacao;
		this.idConcessionaria = idConcessionaria;
	}

	
	public int getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public LocalDate getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(LocalDate anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getIdConcessionaria() {
		return idConcessionaria;
	}

	public void setIdConcessionaria(int idConcessionaria) {
		this.idConcessionaria = idConcessionaria;
	}

	@Override
	public String toString() {
		return String.format("Carro{id=%d, modelo='%s', marca='%s', preco=%.2f, anoFabricacao=%s, idConcessionaria=%d}",
				idCarro, modelo, marca, preco, anoFabricacao, idConcessionaria);
	}
}
