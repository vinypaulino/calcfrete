package br.com.vinipaulino.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaMundoBean {

		private String mensagem = "Teste de JSF";

		public String getMensagem() {
			return mensagem;
		}

		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}
		
		public void enviarNome() {
			System.out.println("mensagem: " + this.mensagem);
		}
		
}
