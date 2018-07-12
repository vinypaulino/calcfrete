package br.com.vinipaulino.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.vinipaulino.modelo.Veiculo;

@ManagedBean
@ViewScoped
public class VeiculoBean implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private VeiculoRn veiculoRn;
	private Veiculo veiculo = new Veiculo();
	
	
	public VeiculoBean() {
		this.veiculoRn = new VeiculoRn();
	}
	
	public void gravar() {		
		veiculoRn.gravarVeiculo(this.veiculo);	
		this.veiculo = new Veiculo();
	}
	
	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
}
