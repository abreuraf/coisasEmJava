package com.abreur.coisasEmJava;

import java.util.ArrayList;
import java.util.List;

public class Listas2 {
	
	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente(1,"Sheila Rubens de Palma"));
		clientes.add(new Cliente(2,"José Maria Tibério"));
		clientes.add(new Cliente(3,"Rubens da Silva"));
		
		clientes.forEach(cliente -> System.out.printf("Id: %d - Nome: %s%n",cliente.getId(),cliente.getNome()));
	}
	
}
