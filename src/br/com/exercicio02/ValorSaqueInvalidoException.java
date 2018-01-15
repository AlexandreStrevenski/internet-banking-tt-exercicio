package br.com.exercicio02;

public class ValorSaqueInvalidoException extends Exception {

	private Double valorSaque;

	public ValorSaqueInvalidoException(Double valorSaque){
		this.valorSaque = valorSaque;
	}
	
	public Double getValorSaque() {
		return valorSaque;
	}
	
}
