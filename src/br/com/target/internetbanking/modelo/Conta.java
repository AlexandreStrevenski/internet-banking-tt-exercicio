package br.com.target.internetbanking.modelo;

import br.com.exercicio02.SaldoInsuficienteException;
import br.com.exercicio02.ValorSaqueInvalidoException;

public class Conta {

	private Long idConta;
	private String numeroComDigito;
	private Double saldo;
	private TipoConta tipoConta;
	
	public Conta(String numeroComDigito, TipoConta tipoConta) {
		this.numeroComDigito = numeroComDigito;
		this.tipoConta = tipoConta;
		this.saldo = 0d;
	}
	public Long getIdConta() {
		return idConta;
	}
	public void setIdConta(Long idConta) {
		this.idConta = idConta;
	}
	public String getNumeroComDigito() {
		return numeroComDigito;
	}
	public void setNumeroComDigito(String numeroComDigito) {
		this.numeroComDigito = numeroComDigito;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public TipoConta getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}
	public void depositar(Double valorDeposito) {
		this.saldo += valorDeposito;
	}
 
	public void sacar(Double valorSaque) throws SaldoInsuficienteException, ValorSaqueInvalidoException { 
		if (valorSaque <= 0 ){
			throw new ValorSaqueInvalidoException(valorSaque);
		}
		
		if (valorSaque > this.saldo){
			throw new SaldoInsuficienteException(this.saldo, valorSaque);
		}
		
		this.saldo -= valorSaque;
	}
	
	
}
