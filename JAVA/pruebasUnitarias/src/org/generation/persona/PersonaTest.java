package org.generation.persona;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersonaTest {

		/*
	 * Requirimientos:
	 * 1. Instanciar objetos con los parámetros establecidos en el constructor
	 * 2. Crear métodos para probar cada objeto instanciado con los valores de los atributos (fgetters)
	 * 3.  Crear un método de válidación de email, dónde el email debe cumplir con al condición de dominio @gmail.com . Si cumple con la condición, el test se evalúa correcto, si no, se evalúa como falla (método de test booleano, regex)
	 */
  
	@Test
    public void testValidarEmail() {
        Persona persona1 = new Persona("Rocio", "Hernandez", "chiicat@gmail.com", 29);
        assertTrue(persona1.validarEmail());
	}

}
