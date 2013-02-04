package org.biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class LivroTest {

	public void testLivro() {
		Livro l1 = new Livro("Grandes expectativas");
		assertEquals("Grandes expectativas", l1.titulo);
		assertEquals("autor desconhecido", l1.autor);		
	}

}
