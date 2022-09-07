package com.ricardo.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProdutosTests {

	@Test
	void validarPropriedadesProduto() {
		var produto = new Produto();
		produto.setCodigo("mte5487");
		produto.setNome("Nome produto teste");
		produto.setDescricao("Descricao teste");
		produto.setQtd(100);
		produto.setValor(5.80);
	
		assertEquals("MTE5487", produto.getCodigo());
		assertEquals("Nome produto teste", produto.getNome());
		assertEquals("Descricao teste", produto.getDescricao());
		assertEquals(100, produto.getQtd());
		assertEquals(5.80, produto.getValor());

	}
	
	@Test
	void aoSetarNomeGeraCodigoVazio() {
		var produto = new Produto();
		produto.setNome("Nome produto teste");
		assertEquals("NOM-18", produto.getCodigo());
	}

	@Test
	void aoSetarNomeNaoGeraCodigoPreenchido() {
		var produto = new Produto();
		produto.setCodigo("TTT-001");
		produto.setNome("Nome produto teste");
		assertEquals("TTT-001", produto.getCodigo());
	}
}
