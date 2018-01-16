package br.com.exercicio02;

import br.com.target.internetbanking.modelo.Conta;

 
public class CaixaEletronico {

	private Double valorDisponivel;
	
	
	public void sacar(Conta conta, Double valorSaque) throws SaldoInsuficienteException, ValorSaqueInvalidoException {
		conta.sacar(valorSaque);
		

		//TODO: 5 - Criar uma nova classe ValorIndisponivelException
		
		//TODO: 6 - lançar exceção
	}
	
	public void depositar(Conta conta, Double valorDeposito){
		conta.depositar(valorDeposito);
	}
	
}
