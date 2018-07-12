package br.com.vinipaulino.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.vinipaulino.modelo.Veiculo;


@ManagedBean
@ViewScoped
public class CalculoBean {
	
	private Integer veiculoId;
	
	
	public Integer getVeiculoId() {
		return veiculoId;
	}

	public void setVeiculoId(Integer veiculoId) {
		this.veiculoId = veiculoId;
	}

	public List<Veiculo> getVeiculos() {
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		System.out.println("Criando lista");

		Veiculo caminhaoBau = new Veiculo();
		caminhaoBau.setTipoVeiculo("Caminhao Bau");
		caminhaoBau.setFatorValor(1.00);
		
		Veiculo caminhaoCacamba = new Veiculo();
		caminhaoCacamba.setTipoVeiculo("Caminhao Cacamba");
		caminhaoCacamba.setFatorValor(1.20);
		
		veiculos.add(caminhaoBau);
		veiculos.add(caminhaoCacamba);
		return veiculos;
	}

	public void calcular() {
	    System.out.println("Calcular");   
	}
	
	public void setVeiculos(List<Veiculo> veiculos) {
	}
     
}
