package com.abreur.coisasEmJava;

public class Cliente {
	
	private long id;
	private String nome;
	public Cliente(long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
}