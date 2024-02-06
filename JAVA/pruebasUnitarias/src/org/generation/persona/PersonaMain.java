package org.generation.persona;

public class PersonaMain {
	public static void main(String[] args) {
		//instanciar los objetos			
		Persona persona1 = new Persona("Rocio", "Hernandez", "chiicat@gmail.com", 29);
		Persona persona2 = new Persona("Monito", "Lopez", "mlopez@yahoo.com", 30);
		Persona persona3 = new Persona("Juan", "Bodoque", "bodoque@gmail.com", 22);
        Persona persona4 = new Persona("David", "Perez", "davidp@hotmail.com", 27);

         System.out.println("Su nombre completo es: " + persona1.getNombre() + " " + persona1.getApellido() +
                " y su correo personal es  " + persona1.getEmail() + ". Tiene  " + persona1.getEdad() + " años.");
         
         if (persona1.validarEmail()) {
        	 System.out.println("El email de " + persona1.getNombre() + " es válido.");
         } else {
             System.out.println("El email de " + persona1.getNombre() + " no es válido.");
         }
         
         System.out.println("Su nombre completo es: " + persona2.getNombre() + " " + persona2.getApellido() +
        		 ", y su correo personal es  " + persona2.getEmail() + ". Tiene  " + persona2.getEdad() + " años.");
         
         if (persona2.validarEmail()) {
        	 System.out.println("El email de " + persona2.getNombre() + " es válido.");
         } else {
             System.out.println("El email de " + persona2.getNombre() + " no es válido.");
         }
         
         System.out.println("Su nombre completo es: " + persona3.getNombre() + " " + persona3.getApellido() +
        		 ", y su correo personal es  " + persona3.getEmail() + ". Tiene  " + persona3.getEdad() + " años.");
         
         if (persona3.validarEmail()) {
        	 System.out.println("El email de " + persona3.getNombre() + " es válido.");
         } else {
             System.out.println("El email de " + persona3.getNombre() + " no es válido.");
         }
         
         System.out.println("Su nombre completo es: " + persona4.getNombre() + " " + persona4.getApellido() +
        		 ", y su correo personal es  " + persona4.getEmail() + ". Tiene  " + persona4.getEdad() + " años.");
         
         if (persona4.validarEmail()) {
        	 System.out.println("El email de " + persona4.getNombre() + " es válido.");
         } else {
             System.out.println("El email de " + persona4.getNombre() + " no es válido.");
         }
         
     
         
    }
}
