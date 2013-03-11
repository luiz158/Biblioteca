package org.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

	String nome;
	ArrayList<Livro> livros;
	ArrayList<Pessoa> pessoas;

	public Biblioteca(String nome) {
		this.nome = nome;
		
		livros = new ArrayList<Livro>();
		pessoas = new ArrayList<Pessoa>();
	}

}
