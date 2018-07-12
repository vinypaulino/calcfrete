package br.com.vinipaulino.bean;


import br.com.vinipaulino.dao.DAO;
import br.com.vinipaulino.modelo.Veiculo;

public class VeiculoRn {
	
	
	public VeiculoRn() {
		
	}

	public void gravarVeiculo(Veiculo veiculo) {
		System.out.println("tipo do Veiculo" + veiculo.getTipoVeiculo());
		if (veiculo.getId() == null) {
	        new DAO<Veiculo>(Veiculo.class).adiciona(veiculo);        
	    } else {
	        new DAO<Veiculo>(Veiculo.class).atualiza(veiculo);
	    }
	}
}
