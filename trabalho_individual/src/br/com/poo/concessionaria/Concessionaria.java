package br.com.poo.concessionaria;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import br.com.poo.carro.Carro;

public class Concessionaria {

	private static final Logger logger = Logger.getLogger(Concessionaria.class.getName());

	private int idConcessionaria;
	private String nome;
	private String endereco;
	private List<Carro> carros;

	public Concessionaria(int idConcessionaria, String nome, String endereco) {
		this.idConcessionaria = idConcessionaria;
		this.nome = nome;
		this.endereco = endereco;
		this.carros = new ArrayList<>();
	}

	public void adicionarCarro(Carro carro) {
		carros.add(carro);
		logger.info("Carro adicionado: " + carro.toString());
	}

	public void removerCarro(Carro carro) {
		if (carros.remove(carro)) {
			logger.info("Carro removido: " + carro.toString());
		} else {
			logger.warning("Carro não encontrado: " + carro.toString());
		}
	}

	public int getIdConcessionaria() {
		return idConcessionaria;
	}

	public void setIdConcessionaria(int idConcessionaria) {
		this.idConcessionaria = idConcessionaria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

	@Override
	public String toString() {
		return String.format("Concessionaria{id=%d, nome='%s', endereco='%s', carros=%d}", idConcessionaria, nome,
				endereco, carros.size());
	}
}