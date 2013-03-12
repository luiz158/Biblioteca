package org.biblioteca;

import java.util.ArrayList;

import junit.framework.TestCase;

public class BibliotecaTest extends TestCase {
	
	private Livro l1;
	private Livro l2;
	private Pessoa p1;
	private Pessoa p2;
	private Biblioteca b1;

	//Teste do Construtor
	
	public void testBiblioteca() {
		Biblioteca b1 = new Biblioteca("Unicentro");
		assertEquals("Unicentro", b1.nome);
		assertTrue(b1.livros instanceof ArrayList);
		assertTrue(b1.pessoas instanceof ArrayList);
	}
	
	public void setup() {
		l1 = new Livro("Livro1");
		l2 = new Livro("Livro2");
		p1 = new Pessoa();
		p2 = new Pessoa();
		
		p1.setNome("Bart");
		p2.setNome("Lisa");
		
		b1 = new Biblioteca("Teste");
	}
	
	public void testAddLivro() {
		// Cria os objetos
		setup();
		
		// Testa se a Biblioteca esta vazia
		assertEquals(0, b1.getLivros().size());
		
		b1.addLivro(l1);
		b1.addLivro(l2);
		
		assertEquals(2, b1.getLivros().size());
		assertEquals(0, b1.getLivros().indexOf(l1));
		assertEquals(1, b1.getLivros().indexOf(l2));
		
		b1.removeLivro(l1);
		
		assertEquals(1, b1.getLivros().size());
		assertEquals(0, b1.getLivros().indexOf(l2));
		
		b1.removeLivro(l2);
		
		assertEquals(0, b1.getLivros().size());
		
	}
}
