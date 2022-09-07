package com.ricardo.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientesTests {

	@Test
	void validarPropriedadesCliente() {
		var cliente = new Cliente();
		cliente.setNome("Ricardo");
		cliente.setEmail("teste@teste.com");
		cliente.setSenha("teste1234");
		cliente.setLogradouro("Rua teste123");
		cliente.setNumero("E123");
		cliente.setBairro("Bairro teste");
		cliente.setCidade("Cidade teste");
		cliente.setEstado("Estado teste");
		cliente.setCep("00000-000");
		cliente.setComplemento("Casa teste");
	
		assertEquals("Ricardo", cliente.getNome());
		assertEquals("teste@teste.com", cliente.getEmail());
		assertEquals("teste1234", cliente.getSenha());
		assertEquals("Rua teste123", cliente.getLogradouro());
		assertEquals("E123", cliente.getNumero());
		assertEquals("Bairro teste", cliente.getBairro());
		assertEquals("Cidade teste", cliente.getCidade());
		assertEquals("Estado teste", cliente.getEstado());
		assertEquals("00000-000", cliente.getCep());
		assertEquals("Casa teste", cliente.getComplemento());
	}

}
