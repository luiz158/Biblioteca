package org.biblioteca;

public class Pessoa {
	//Atributos		
	private String nome;		//Nome da pessoa
	private int maxLivros;		//Número máximo de livros que a pessoa pode emprestar
	private float exemplo;
	
	//Construtores
	public Pessoa() {
		nome = "Nome desconhecido";
		maxLivros = 3;
	}
	
	//Métodos
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMaxLivros() {
		return maxLivros;
	}

	public void setMaxLivros(int maxLivros) {
		this.maxLivros = maxLivros;
	}
}
