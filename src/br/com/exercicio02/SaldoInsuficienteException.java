package br.com.exercicio02;

public class SaldoInsuficienteException extends Exception {
	private Double valorSaldo;
	private Double valorSaque;
	
	public SaldoInsuficienteException(Double valorSaldo, Double valorSaque){
		this.valorSaldo = valorSaldo;
		this.valorSaque = valorSaque;
	}
	
	public Double getValorSaque() {
		return valorSaque;
	}


	public Double getValorSaldo() {
		return valorSaldo;
	}
	
	
}
