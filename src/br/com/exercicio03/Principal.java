package br.com.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		
		List<Funcionario> listFuncionario = consultaListaDeFuncionario();
		
		for(Funcionario funcionario : listFuncionario){
			System.out.println("valor total a pagar:" + funcionario.calcularValorTotalDePagamento());
		}
		
	}

	private static List<Funcionario> consultaListaDeFuncionario() {
		
		List<Funcionario> list = new ArrayList<>();
		list.add(new Estagiario());
		list.add(new Gerente());
		list.add(new Programador());
		list.add(new Secretario());
		list.add(new Estagiario());
		
		return list;
	}
	
}
