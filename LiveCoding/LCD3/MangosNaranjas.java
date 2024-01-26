/* Rocio Hernández 3/5
 * Explicas lo que vas haciendo en ciertas ocasiones pero no siempre
 * */
package org.generation.livecoding;

import java.util.Scanner;

public class MangosNaranjas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de mangos: ");
        int mangos = scanner.nextInt();

        System.out.print("Ingrese el número de naranjas: ");
        int naranjas = scanner.nextInt();

        if (mangos <= 0 || naranjas <= 0) {
            System.out.println("Por favor, ingrese números válidos y mayores a cero.");
            return;
        } 
       //cerrar el scanner
        scr.close();
        
	}//
	}//
