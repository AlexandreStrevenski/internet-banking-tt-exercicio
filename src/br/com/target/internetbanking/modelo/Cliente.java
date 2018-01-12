package br.com.target.internetbanking.modelo;

public class Cliente extends Pessoa {

	private Conta conta;
	private TipoCliente tipoCliente;
	private String cpf;

	public Cliente(String nome, String email, Conta conta, TipoCliente tipoCliente) {
		super(nome, email);
		this.conta = conta;
		this.tipoCliente = tipoCliente;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public Double getValorTaxaMensal(){

		if (tipoCliente == TipoCliente.PESSOA_FISICA){
			return this.conta.getTipoConta().getValorTaxaPF();
		}else{
			return this.conta.getTipoConta().getValorTaxaPJ();
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Cliente cliente = (Cliente)obj;
		return (this.cpf == cliente.getCpf());
	}

	@Override
	public int hashCode() {
		return super.hashCode() + this.getNome().length();
	}


}
