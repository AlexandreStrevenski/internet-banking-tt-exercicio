package br.com.target.internetbanking.modelo;

public class ClienteEspecial extends Cliente {

	public ClienteEspecial(String nome, String email, Conta conta, TipoCliente tipoCliente) {
		super(nome, email, conta, tipoCliente);
	}
	
	@Override
	public Double getValorTaxaMensal() {
		return 1.7d * super.getValorTaxaMensal();
	}

}
