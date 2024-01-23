package controlFlujo;
import java.util.Scanner; //Importación Scanner es para recibir datos desde el usuario. Solo se impporta 1 vez y se implementa indefinidamente.
//Todas las importaciones se realizan fuera de la clase

public class FlujoControl {

	public static void main(String[] args) { // debe coincidir la clase con el combre del documento
		// Recuerda que para que algo se ejecute, siiempre debe de ir en el metodo
		// principal

		// Primero definir una variable de tipo String donde se almacena un dato
		/*
		 * String viaje = "16-01-2024"; //Dejar en null y después agregar fecha
		 * //Variable declarada e inicializada en null a propósito para tener un
		 * "espacio" de memoria ya asignada y sólo reemplazarlo con un nuevo dato.
		 * 
		 * //Para validar si podemos vajar en cierta fecha if (viaje != null) {
		 * //Variable vacía
		 * System.out.println("Ya no tenemos fechas disponibles, una disculpa."); } else
		 * { System.out.println("Puede reservar su viaje"); }
		 */
		///////////////////////////////////////////////////////////////
		
		// Validacion de contraseña
	/* Scanner scanner = new Scanner(System.in);

		// Solicitar la primera contraseña
		System.out.print("Ingrese la contraseña: ");
		String contraseña1 = scanner.nextLine();

		// Solicitar la segunda contraseña
		System.out.print("Ingrese la contraseña nuevamente: ");
		String contraseña2 = scanner.nextLine();

		// Verificar si las contraseñas coinciden
		if (contraseña1.equals(contraseña2)) {
			System.out.println("Las contraseñas coinciden. Acceso permitido.");
		} else {
			System.out.println("Las contraseñas no coinciden. Acceso denegado.");
		}

		// Cerrar el scanner
		scanner.close();
		*/
		
	///////////////////////////////////////////////////////////////////////
		
		//switch: para seleccionar la comida de la dulcería del cine
		//Selección de opciones, variable que almacena dicha opción
		/*  int menu = 4;
		
		//Crear un menu
		
		System.out.println("Bienvenido a la dulcería");
		System.out.println("1. Palomitas");
		System.out.println("2. Refresco");
		System.out.println("3. Nachos");
		System.out.println("4. Hot Dog");
		System.out.println("5. Pagar");
		System.out.println("No contamos con eso en nuestro menu, por favor seleccione un opción válida (1-5).");
		
		switch (menu) {
		case 1:
			System.out.println("Usted ha agregado palomitas.");
			//Aquí agregamos una opción y mensaje
			break;
		case 2:
			System.out.println("Usted ha agregado refresco a su orden");
			break;
		case 3:
			System.out.println("Usted ha agregado nachos  a su orden");
			break;
		case 4:
			System.out.println("Usted ha agregado HotDog  a su orden");
			break;
		case 5:
			System.out.println("Usted ha seleccionada pagar su orden");
			break;
			default:
			System.out.println("Por el momento no contamos con esa opción en nuestro menú, lo invitamos a seleccionar un opción válida");
			break;		
			*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa una opción: ");
		int menu = scanner.nextInt();
		
		//Crear un menu		
		System.out.print("Bienvenido a la dulcería, que desea ordenar?  \n");
		System.out.print("Dulceria\n"
				+ "1. Palomitas\n"
				+ "2. Refresco\n"
				+ "3. Nachos\n"
				+ "4. HotDog\n"
				+ "5. Pagar/n"
				+ "\n");
		
		switch (menu) {
		case 1:
			System.out.println("Usted ha agregado palomitas.");
			//Aquí agregamos una opción y mensaje
			break;
		case 2:
			System.out.println("Usted ha agregado refresco a su orden");
			break;
		case 3:
			System.out.println("Usted ha agregado nachos  a su orden");
			break;
		case 4:
			System.out.println("Usted ha agregado HotDog  a su orden");
			break;
		case 5:
			System.out.println("Usted ha seleccionada pagar su orden");
			break;
			default:
			System.out.println("Por el momento no contamos con esa opción en nuestro menú, lo invitamos a seleccionar un opción válida");
			break;
		}
		scanner.close();
		//////////////////////////////////////////////
		
		
	}  //don't deleate from here
}
		
