package org.biblioteca;

public class Livro {

	String titulo;
	String autor;
	Pessoa pessoa;

	public Livro(String string) {
		this.titulo = string;
		this.autor = "autor desconhecido";
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa p2) {
		this.pessoa = p2;
		
	}

}
