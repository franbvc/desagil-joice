package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraCFCTest {
	private static double DELTA = 0.05;
	private CalculadoraCFC calculadora1;

	@BeforeEach
	private void setUp() {
		calculadora1 = new CalculadoraCFC();
	}

	@Test
	public void testaDensidadeCobre() {
		double peso = 63.55;
		double raio = 0.128;
		assertEquals(8.89, calculadora1.calcula(peso, raio), DELTA);
	}
	
	@Test
	public void testaDensidadeOuro() {
		double peso = 196.97;
		double raio = 0.144;
		assertEquals(19.36, calculadora1.calcula(peso, raio), DELTA);
	}
	
	@Test
	public void testaDensidadePrata() {
		double peso = 107.87;
		double raio = 0.144;
		assertEquals(10.60, calculadora1.calcula(peso, raio), DELTA);
	}

}

