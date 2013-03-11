package org.biblioteca;

import java.util.ArrayList;

import junit.framework.TestCase;

public class BibliotecaTest extends TestCase {
	//Teste do Construtor
	
	public void testBiblioteca() {
		Biblioteca b1 = new Biblioteca("Unicentro");
		assertEquals("Unicentro", b1.nome);
		assertTrue(b1.livros instanceof ArrayList);
		assertTrue(b1.pessoas instanceof ArrayList);
		
		b1.livros.add("teste");
	}
}
