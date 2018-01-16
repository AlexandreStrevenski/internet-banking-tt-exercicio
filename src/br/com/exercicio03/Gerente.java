package br.com.exercicio03;

public class Gerente extends AbstractFuncionario{

	@Override
	public Double getTotalBeneficios() {
		return 800d;
	}

	@Override
	public Double getSalario() {
		return 5000d;
	}

}
