package org.biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class PessoaTest {

	@Test
	public void testPessoa() {
		Pessoa p1 = new Pessoa();
		assertEquals("Nome desconhecido", p1.getNome());
		assertEquals(3, p1.getMaxLivros());
	}

	@Test
	public void testSetNome() {
		Pessoa p2 = new Pessoa();
		p2.setNome("Bart");
		assertEquals("Bart", p2.getNome());
	}

	@Test
	public void testSetMaxLivros() {
		Pessoa p3 = new Pessoa();
		p3.setMaxLivros(10);
		assertEquals(10, p3.getMaxLivros());
	}

}
