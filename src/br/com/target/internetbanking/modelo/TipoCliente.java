package br.com.target.internetbanking.modelo;

public enum TipoCliente {

	PESSOA_FISICA("Pessoa F�sica"), 
	PESSOA_JURIDICA("Pessoa Jur�dica");
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	TipoCliente(String descricao){
		this.descricao = descricao;
	}
	
}
