/*
 *Rocio hernández 3/5
 *Tiene la idea, sin embargo no la puede plantear totalmente 
 */

package org.generation.livecoding;

public class LiveCoding4 {
		public static void main(String[] args) {
	        for (int i = 1; i <= 100; i++) {
	            if (i % 3 == 0 && i % 5 == 0) {
	                System.out.println("FizzBuzz");
	            } else if (i % 3 == 0) {
	                System.out.println("Fizz");
	            } else if (i % 5 == 0) {
	                System.out.println("Buzz");
	            } 
	        }
	    }
}
