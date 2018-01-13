package br.com.exercicio01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//------------------------------------------
		//MAP
		List<Cargo> lista = new ArrayList<>();

		lista.add(new Cargo("Funcionário"));
		lista.add(new Cargo("Diretor"));
		lista.add(new Cargo("Estagiário"));
		lista.add(new Cargo("Diretor"));
		lista.add(new Cargo("Gerente"));
	
		for(int i = 0; i < lista.size() ;i++){
			System.out.println(lista.get(i).getNome() + " - " + lista.get(i).hashCode());
		}
		
		for (Cargo cargo: lista){
			System.out.println(cargo);
		}
		
		lista.forEach(s -> System.out.println(s));
		
		lista.forEach(System.out::println);
		
		//------------------------------------------
		//SET
		Set<Cargo> set = new HashSet<>();

		set.add(new Cargo("Funcionário"));
		set.add(new Cargo("Diretor"));
		set.add(new Cargo("Estagiário"));
		set.add(new Cargo("Diretor"));
		set.add(new Cargo("Gerente"));
		
		Iterator<Cargo> iterator = set.iterator();
		
		while(iterator.hasNext()){
			Cargo next = iterator.next();
			System.out.println(next.getNome());
		}
		
		//------------------------------------------
		//MAP------------------------------------------

		Map<Integer, String> map = new HashMap();
		
		map.put(1, "Funcionário");
		map.put(2, "Diretor");
		map.put(3, "Estagiário");
		map.put(4, "Diretor");
		
		
		for (Map.Entry<Integer, String> item : map.entrySet()){
			System.out.println(item.getKey() + " - " + item.getValue());
		}
		
	}
	
}
