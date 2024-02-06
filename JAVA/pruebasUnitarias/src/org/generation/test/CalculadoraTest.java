package org.generation.test;

import static org.junit.Assert.assertEquals;

import org.generation.calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	//1. Mandar a llamar un objeto de tipo Calculador
	private Calculadora calculadoraTest;
	
	//1.1. Crear un método llamado setUp para instanciar mi calculadoraTest como nuevo objeto de tipo Calculadora y le debo indicar que se ejecute antes de todos los test con la anotación @BeforeEach
	
		@BeforeEach
	public void setUp() {
		calculadoraTest = new Calculadora();
	}
	
	//2. Comenzar a crear métodos de prueba (test) que no retornan (void)
	@Test // para indicarle que es una anotación de prueba
	public void sumarTest() {
		//assertEquals(resultado esperado, variable+método(parámetros a evaluar));
		assertEquals(24, calculadoraTest.sumar(14,10));
	}
	//3. Revisar el archivo 'module-info.java' y elimianr los módulos que se importaron
	//Importar 'Assert.assertEquals'
	
	@Test
	public void restarTest() {
		assertEquals(-1,  calculadoraTest.restar(17,18));
	}
	@Test
	public void multiplicarTest() {
		assertEquals(18,  calculadoraTest.multiplicar(6,3));
	}
	@Test
	public void dividirTest() {
		assertEquals(12,  calculadoraTest.dividir(96,8));
	}
	
	//error siempre será con código, algo no esta bien escrito en él
	//falla es que el test no recibio loe sperado (parámetros)

}
