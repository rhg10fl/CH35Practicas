package tiposDeDatosyVariables;

public class EjercicioDatos {

	public static void main(String[] args) {

		System.out.println("Hola Michi");

		/*
		 * Comentarios multilínea
		 */

		// comentario de una sola línea

		byte edad = 15; // Sirve para representar un numero entero 8bits (-128 al 127)

		System.out.println("Edad del participante " + edad);

		short usuariosNuevos = 200; // Sirve para representar un numero entero 16 bits (-23768 al 32767)

		System.out.println("Usuarios Nuevos: " + usuariosNuevos);

		int usuariosTotales = 8752; // sirve para representar un numero entero 32 bits (-2147483648 al 2147483647)

		System.out.println("Usuarios Totales: " + usuariosTotales);

		long usuariosPremium = 9512; // Sirve para un número entero con valores mucho mayores

		System.out.println("Usuarios Premium: " + usuariosPremium);

//Tipos de datos con numero decimales 

		float altura = 1.61f;// Sirve para representar un valor numerico con numeros decimales, cuyo valor es de 23 bits, puede tener 8 caracteres despues del punto decimal y que tiene que llevar una f al final

		System.out.println("Altura del usuario " + altura);

		double peso = 78.500;// Sirve para representar valores numericos con decimales, cuyo valor es de 64 bits y puede tener hasta quince caracteres despues del punto decimal
		
		System.out.println("Su peso es: "+peso);
		
		// String nombreUsuario = "Rocio"; Es una clase para tener cadenas de texto
		
		String costoBoleto = "500";//Es una clase para tener cadenas de texto
		String zonaBoleto = "52";
		System.out.println("Usuarix "+costoBoleto);
		System.out.println("Zona a la que pertenece "+zonaBoleto);
		
		char section = 'f';
		
		System.out.println("Sección "+section);
		
		boolean clienteFrecuente = true; // Sirve para obtner true o false utilizanso condicionales
		
		System.out.println("Es un cliente frecuente: "+clienteFrecuente);
		
		//Conversión de tipos
		
		//Casteo a entero
		
		int pesoCambio = (int) peso;
		
		//casteo entero
		long pesoCambiol = (long) peso;
		
		System.out.println("double "+peso);
		System.out.println("int "+pesoCambio);
		System.out.println("long "+pesoCambiol);
		
		int nombreCambio = Integer.parseInt(costoBoleto);
		double zonaCambio = Double.parseDouble(zonaBoleto);
		
		System.out.println("Zona del usuario segun su boleto: "+(nombreCambio*zonaCambio));
		
		/* Operadores aritmeticos
		+ suma
		- resta
		* multiplicación
		/ división
		% Residuo */
		
		/* Operadores de comparación
		 == compara si un operando es igual a otro
		 != compara si es diferente
		 < menor que
		 > mayor que
		 <= menor o igual 
		 >= mayor o igual
		 */
		
		double precioEntrada = 75.50;
		double prePalomitas = 89.70;
		double precioBebida = 35.50;
		int capacidadTotal = 500;
		
		int personasDentro = 342;
		
		if (personasDentro > capacidadTotal) {
			System.out.println("Ya se encuentra lleno");
		}
		
		double totalEntrada = personasDentro * precioEntrada;
		double totalPalomitas = personasDentro * prePalomitas;
		double totalBebidas = personasDentro * precioBebida;
		
		System.out.println ("Total de personas" + personasDentro);
		System.out.println ("Total de entradas " + totalEntrada);
		System.out.println ("Total de palomitas " + totalPalomitas);
		System.out.println ("Total de bebidas " + totalBebidas);
	}
}
