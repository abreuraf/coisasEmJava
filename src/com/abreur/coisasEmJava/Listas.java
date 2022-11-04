package com.abreur.coisasEmJava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Listas {
	
	public static void main(String[] args) {
		
		// declarando uma lista
		List<String> nomes = new ArrayList<>();
		
		// adicionando elementos
		nomes.add("Diana Prince");
		nomes.add("Clark Kent");
		nomes.add("Bruce Wayne");
		nomes.add("Barry Allen");
		nomes.add("Artur Curry");
		
		// exibindo
		System.out.println("Justice League Members: "+nomes);
		System.out.println("Members:"+nomes.size());
		
		// excluindo
		nomes.remove(1);
		System.out.println("The Death of Superman: "+nomes);
		System.out.println("Members: "+nomes.size());
		
		// adicionando
		nomes.add("Clark Kent");
		System.out.println("The Return of Superman:"+nomes);
		System.out.println("Justice League: "+nomes.size());
		// iteração
		for (int i=0;i<nomes.size();i++) {
			System.out.println("Name of Hero: "+nomes.get(i));
		}
		System.out.println("Second iteration...");
		// iteração aprimorada
		for (String nome : nomes) {
			System.out.println("Name of Hero: "+nome);
		}
		System.out.println("Third iteration...");
		nomes.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);			
			}
		});
		System.out.println("Fourth iteration...");
		nomes.forEach(nome -> System.out.println(nome));
		System.out.println("Fifth iteration...");
		nomes.forEach(System.out::println);
	}

}
