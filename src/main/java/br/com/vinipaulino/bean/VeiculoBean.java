package br.com.vinipaulino.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.vinipaulino.modelo.Veiculo;

@ManagedBean
@ViewScoped
public class VeiculoBean {
	
	private Veiculo veiculo = new Veiculo();

	
	public void gravar() {
		VeiculoRn veiculoRN = new VeiculoRn();
		veiculoRN.gravarVeiculo(this.veiculo);	
		this.veiculo = new Veiculo();
	}
	
	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
}
