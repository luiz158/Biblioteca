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

	public String getNome() {
		return nome;
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void addLivro(Livro l1) {
		this.livros.add(l1);
	}

	public void removeLivro(Livro l1) {
		this.livros.remove(l1);		
		
	}

}
