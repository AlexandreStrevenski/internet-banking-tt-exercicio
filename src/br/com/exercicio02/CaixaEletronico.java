package br.com.exercicio02;

import br.com.target.internetbanking.modelo.Conta;

//TODO: 1 - Criar uma nova classe SaldoInsuficienteException que extende de Exception

public class CaixaEletronico {

	private Double valorDisponivel;
	
	
	public void sacar(Conta conta, Double valorSaque) {
		
		
		//TODO: 3 - Criar o try catch para SaldoInsuficienteException
		conta.sacar(valorSaque);

		//TODO: 5 - Criar uma nova classe ValorIndisponivelException
		
		//TODO: 6 - lançar exceção
	}
	
}
