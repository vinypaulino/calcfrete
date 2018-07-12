package br.com.vinipaulino.modelo;

public class Veiculo {
	
	private Long id;
	private String tipoVeiculo;
	private double fatorValor;

	public Veiculo() {
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public double getFatorValor() {
		return fatorValor;
	}

	public void setFatorValor(double fatorValor) {
		this.fatorValor = fatorValor;
	}

	public Long getId() {
		return id;
	}
	
}