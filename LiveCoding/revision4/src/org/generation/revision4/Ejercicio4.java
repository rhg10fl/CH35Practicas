package org.generation.revision4;

import java.util.Scanner; //importar scanner si se usa

public class Ejercicio4 {
	public static void main (String[] agrs) {
		 Scanner scanner = new Scanner(System.in); //  se agrega scanner
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = scanner.nextLine(); //se modifica s a scanner
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    Scanner scanner2 = new Scanner(System.in); //se agrega un scanner que lea al jugador 2
    String j2 = scanner.nextLine(); //se agrega scanner
    
    if (j1 == j2) { //tiene un ')' demás
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          } //  se agrega el cierre de sentencia
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
  
    }
}
