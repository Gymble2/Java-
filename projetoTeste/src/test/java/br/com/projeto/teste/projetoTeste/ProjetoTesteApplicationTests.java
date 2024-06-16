package br.com.projeto.teste.projetoTeste;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class ProjetoTesteApplicationTests {

	private BigDecimal seuSalarioDeProgramador = new BigDecimal("10.00");

	@Test
	void contextLoads() {
		System.out.println("começando o debug");
		System.out.printf("o salário de programador é " + seuSalarioDeProgramador);
		System.out.printf("Fim do debug");

	}

}
