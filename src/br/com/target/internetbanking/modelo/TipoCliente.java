package br.com.target.internetbanking.modelo;

public enum TipoCliente {

	PESSOA_FISICA("Pessoa Física"), 
	PESSOA_JURIDICA("Pessoa Jurídica");
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	TipoCliente(String descricao){
		this.descricao = descricao;
	}
	
}
