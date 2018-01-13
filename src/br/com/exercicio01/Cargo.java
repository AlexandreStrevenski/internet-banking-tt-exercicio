package br.com.exercicio01;

public class Cargo {

	private String nome;

	public Cargo(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		return this.nome.length();
	}
}
