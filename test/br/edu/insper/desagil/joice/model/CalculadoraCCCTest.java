package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraCCCTest {
	private static double DELTA = 0.05;
	private CalculadoraCCC calculadora1;
	
	@BeforeEach
	private void setUp() {
		calculadora1 = new CalculadoraCCC();
	}
	
	@Test
	public void testaDensidadeNiobio() {
		double peso = 92.91;
		double raio = 0.143;
		assertEquals(8.57, calculadora1.calcula(peso, raio), DELTA);
	}
	
	@Test
	public void testaDensidadeTungstenio() {
		double peso = 183.84;
		double raio = 0.137;
		assertEquals(19.28, calculadora1.calcula(peso, raio), DELTA);
	}
	
	@Test
	public void testaDensidadeLitio() {
		double peso = 6.94;
		double raio = 0.152;
		assertEquals(0.53, calculadora1.calcula(peso, raio), DELTA);
	}
	

}
