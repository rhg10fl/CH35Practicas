package operadoresLogicos;

public class EjerciciosOperadores {
	public static void main(String[] args) {

		/*
		 && OPERADOR AND 
		 devuelve true si ambas expresiones son verdaderas 
		 || OPERADOR OR 
		 devuelve true si almenos una de las dos condiciones se cumple 
		 ! OPERADOR
		 NOT si la expresion booleana es flase devuelve true y viceversa
		 */
		
		//&& and
		
		int anios = 5;
		
		boolean esInfante = true;
		
		boolean costoInfante = anios <= 12 && esInfante;
		
		System.out.println("Es peque " + costoInfante);
		
		
		String cliente = "cliente123"; 
		String credenciales = "fertakisfuego123";
		
		boolean credencialCorrecta = cliente.equals("cliente123") && credenciales.equals("fertakisfuego123");
		
		System.out.println("Las credenciales si son válidas "+credencialCorrecta);
		
		// || or
		
		double costoPasaje = 380.50;
		int edad = 58;
		boolean credenInapam = false;
		
		boolean descuentoAdultoMayor = edad >= 60 || credenInapam;
		
		System.out.println("¿Tiene descuento? "+ descuentoAdultoMayor);
		
		// ! not 
		
		boolean asientosDisponibles = true;
		boolean libres = true;
		boolean asientosConDescuento = !libres;
		
		
		System.out.println("Tenemos asientos con descuento " +asientosConDescuento);
		
		double costoBoleto = 350;
		double numTotalAsientos = 62;
		double numMayorAsientos = 4;
		double numEstuAsientos = 6;
		
		int edadPasajero = 45;
		boolean credInapam = false;
				
		boolean descAdultoMayor = edadPasajero >= 60 || credInapam;
		
		System.out.println("Descuento Aplicado: " +descAdultoMayor);
		
		
		boolean credEstudiante = false;
		
		boolean asientosDescuento = !libres;
				
		boolean descEstudiante = a  ;
		
		System.out.println("Descuento Aplicado: " +descAdultoMayor);
				
}
}
