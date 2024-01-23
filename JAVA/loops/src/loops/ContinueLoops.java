package loops;

public class ContinueLoops {
	public static void main(String[] args) {
		/*
		 * Instrucciones de salto:
		 ** continue--
		 *Interrumpe la iteración del bucle, si se procede una condición especifica y continua con la siguiente
		 *
		 */
		
		//Con *continue* ejecutando la sentencia condicional, pero cumpliendo la condición de bucle for.
		
		for (int cliente = 1; cliente  <= 20; cliente++) {
			if(cliente == 5)  {
				System.out.println("Cliente número " + cliente +" ¡¡Ganaste!!");
				continue;
		} System.out.println("Eres el cliente número " + cliente);
	}
		
			
	} //Method
} //Class