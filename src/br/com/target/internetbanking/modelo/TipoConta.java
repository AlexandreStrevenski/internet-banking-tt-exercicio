package br.com.target.internetbanking.modelo;

public enum TipoConta {

	CONTA_CORRENTE("Conta Corrente", 30d, 70d), 
	CONTA_POUPANCA("Conta Poupança", 5d, 20d), 
	CONTA_SALARIO("Conta Salário", 0d, 0d), 
	CONTA_DEPOSITO_JUDICIAL("Conta Depósito Judicial", 20d, 50d);
	
	private String nomeParaExibir;
	private Double valorTaxaPF;
	private Double valorTaxaPJ;

	public String getNomeParaExibir() {
		return nomeParaExibir;
	}

	TipoConta(String nomeParaExibir, Double valorTaxaPF, Double valorTaxaPJ){
		this.nomeParaExibir = nomeParaExibir;
		this.valorTaxaPF = valorTaxaPF;
		this.valorTaxaPJ = valorTaxaPJ;
	}

	public Double getValorTaxaPF() {
		return this.valorTaxaPF;
	}
	
	public Double getValorTaxaPJ() {
		return this.valorTaxaPJ;
	}

}
