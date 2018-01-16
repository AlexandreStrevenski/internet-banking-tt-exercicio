package br.com.target.internetbanking.aplicacao;

import java.util.List;

import br.com.target.internetbanking.modelo.Cliente;
import br.com.target.internetbanking.modelo.Conta;

public class Relatorio {

	public static void imprimirCliente(Cliente cliente) {
		
		
		Conta conta = cliente.getConta();
		
		System.out.println("Nome: " + cliente.getNome() + " / " + cliente.getEmail());
		System.out.println("Tipo de Cliente: " + cliente.getTipoCliente().getDescricao());
		System.out.println("Conta: " + conta.getNumeroComDigito() + " / Tipo de Conta: " + conta.getTipoConta().getNomeParaExibir());
		System.out.println("Taxa: " + cliente.getValorTaxaMensal());
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("----------------------------------");
	}



}
