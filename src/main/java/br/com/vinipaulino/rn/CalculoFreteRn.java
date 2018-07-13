package br.com.vinipaulino.rn;

import br.com.vinipaulino.modelo.Configuracao;
import br.com.vinipaulino.modelo.Frete;

public class CalculoFreteRn {
	private Frete frete;
	private double custoPercurso;
	private Configuracao config;
	private int pesoExcedido;

	public CalculoFreteRn(Frete frete, Configuracao config) {
		// testar frete nulo
		this.frete = frete;
		this.config = config;
	}

	public double calculaFrete() {
		
		if (frete.getDistanciaPavimentada() > 0) {
			custoPercurso = frete.getDistanciaPavimentada() * config.getValorViaPavimentada();
		}

		if (frete.getDistanciaNaoPavimentada() > 0) {
			custoPercurso += frete.getDistanciaNaoPavimentada() * config.getValorViaNaoPavimentada();
		}
		
		custoPercurso = custoPercurso * frete.getVeiculo().getFatorValor();
		
		if (frete.getCargaTransportada() > config.getToneladaMinima()) {
			 pesoExcedido = frete.getCargaTransportada() - config.getToneladaMinima();
			 custoPercurso += (pesoExcedido * config.getTaxaCustoCarga()) * (frete.getDistanciaPavimentada() + frete.getDistanciaNaoPavimentada());
		} 
		 
		return custoPercurso;
	}

	public Frete getCalculoFrete() {
		return frete;
	}

	public void setCalculoFrete(Frete frete) {
		this.frete = frete;
	}
	

}
