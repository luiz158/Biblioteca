package org.biblioteca;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class LivroTest extends TestCase{

	public void testLivro() {
		Livro l1 = new Livro("Grandes expectativas");
		assertEquals("Grandes expectativas", l1.titulo);
		assertEquals("autor desconhecido", l1.autor);		
	}

	public void testGetPessoa() {
		Livro l2 = new Livro("Guerra e Paz");
		Pessoa p2 = new Pessoa();
		p2.setNome("Elvis");
		
		// Método para dizer que este Livro está com esta Pessoa
		l2.setPessoa(p2);
		
		//Pegar o nome da Pessoa que está com o Livro
//		Pessoa testPessoa = l2.getPessoa();
//		String testNome = testPessoa.getNome();
		String testNome = l2.getPessoa().getNome();
		assertEquals("Elvis", testNome);
		
	}
}
