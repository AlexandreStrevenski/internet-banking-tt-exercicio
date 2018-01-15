package br.com.target.internetbanking.aplicacao;

import br.com.target.internetbanking.modelo.Cliente;
import br.com.target.internetbanking.modelo.Conta;
import br.com.target.internetbanking.modelo.TipoCliente;
import br.com.target.internetbanking.modelo.TipoConta;

public class Aplicacao {
 
	public static void main(String[] args) {
		
		Conta conta1 = new Conta("31.232.323-X",TipoConta.CONTA_CORRENTE);
		Cliente cliente1 = new Cliente("Alexandre", "alexandre.strevenski@gmail.com", conta1, TipoCliente.PESSOA_JURIDICA);
		
		Conta conta2 = new Conta("31.232.323-X",TipoConta.CONTA_CORRENTE);
		Cliente cliente2 = new Cliente("Alexandre", "alexandre.strevenski@gmail.com", conta2, TipoCliente.PESSOA_JURIDICA);
		
		
		Relatorio.imprimirCliente(cliente1);
		Relatorio.imprimirCliente(cliente2);
		
	}
}
