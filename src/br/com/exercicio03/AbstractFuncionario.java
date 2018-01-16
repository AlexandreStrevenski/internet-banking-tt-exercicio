package br.com.exercicio03;

public abstract class AbstractFuncionario implements Funcionario {

	public Double calcularValorTotalDePagamento(){
		
		Double valorTotalBeneficios = getTotalBeneficios();
		Double valorSalario = getSalario();
		
		
		//Double valor = calcularTotalHorasExtras();
		
		Double valorTotalAPagar = valorTotalBeneficios + valorSalario;
		
		return valorTotalAPagar;
		
	}
	
	public abstract Double getTotalBeneficios();
	
	public abstract Double getSalario();
	
}
