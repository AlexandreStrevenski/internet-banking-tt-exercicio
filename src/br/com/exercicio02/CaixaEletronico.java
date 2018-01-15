package br.com.exercicio02;

import br.com.target.internetbanking.modelo.Conta;

 
public class CaixaEletronico {

	private Double valorDisponivel;
	
	
	public void sacar(Conta conta, Double valorSaque) {
		
		try {
			conta.sacar(valorSaque);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo insuficiente: valor de saque" + e.getValorSaque() 
			+ " valor disponível é de " + e.getValorSaldo());
		} catch (ValorSaqueInvalidoException e) {
			System.out.println("Valor de saque não pode ser menor ou igual a zero");
		}catch(Exception e){
			System.out.println("Não foi possível completar a operação");
		}

		//TODO: 5 - Criar uma nova classe ValorIndisponivelException
		
		//TODO: 6 - lançar exceção
	}
	
}
