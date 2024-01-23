package loops;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 * El ciclo For, nos proporciona una forma compacta de iterar sobre los valores.
		 * for (inialización: condición; contador) {
		 * bloque de código)
		 * }
		 * */
		

		//for con variable local
		for (int numero = 0; numero <=10; numero++) {
			System.out.println("Número es igual a "+ numero);
		}
		
		//for con variables globales
	
		int contador;
		for(contador =  1;  contador <=5; contador++) {
			System.out.println("La cuenta es " + contador);
		}
		
		//Bucles anidados - Blucle dentro de otro bucle
		//Impriomir un tringulo con asteriscos
		
		int filas = 5;
		for(int i = 0; i < filas; i++)  {
			//bloque de código que va iterar con el bucle
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
			
			/*
			 * Las variables globales se pueden usar en cualquier parte de la clase, incluso fuera de una clase o un paquete (Dependiendo de su modificador de acceso), sin embargo una variable local solo puede ser utilizada dentro del bloque de código donde fue creada y no lleva ningún modificador de acceso. 

Las variables globales se inicializan por defecto (por ejemplo una variable global int se inicializa con 0), una variable local no se inicializa. 

El tiempo de vida de una variable local dura hasta que termina de ejecutarse el bloque de código que la contiene, sin embargo, una variable global dura todo el tiempo de vida en que es usada una clase. 

Las variables globales son muy útiles sobre todo porque pueden ser usadas en cualquier momento en una aplicación, sin embargo, las variables globales ocupan más espacio de memoria que una variable local (Y su tiempo de vida es mayor) y el uso de éstas deben ser las menores posibles para no aumentar la carga de memoria a nuestra aplicación.*/

	} // not delete método
}// not delete clase