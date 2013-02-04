package org.biblioteca;

public class Livro {

	public String titulo;
	public String autor;

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

}
