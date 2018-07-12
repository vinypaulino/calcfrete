package br.com.vinipaulino.modelo;

public class Configuracao {
	
	private double taxaCustoCarga;
	private int toneladaMinima;
	private double valorViaPavimentada;
	private double valorViaNaoPavimentada;
	
	
	public double getValorViaPavimentada() {
		return valorViaPavimentada;
	}
	public void setValorViaPavimentada(double valorViaPavimentada) {
		this.valorViaPavimentada = valorViaPavimentada;
	}
	public double getValorViaNaoPavimentada() {
		return valorViaNaoPavimentada;
	}
	public void setValorViaNaoPavimentada(double valorViaNaoPavimentada) {
		this.valorViaNaoPavimentada = valorViaNaoPavimentada;
	}
	public double getTaxaCustoCarga() {
		return taxaCustoCarga;
	}
	public void setTaxaCustoCarga(double taxaCustoCarga) {
		this.taxaCustoCarga = taxaCustoCarga;
	}
	public int getToneladaMinima() {
		return toneladaMinima;
	}
	public void setToneladaMinima(int toneladaMinima) {
		this.toneladaMinima = toneladaMinima;
	}
	

}
