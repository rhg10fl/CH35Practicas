package ecommerce;
import java.util.Scanner;

public class FuncionDescuento {

	public static void main(String[] args) {

Scanner scanner = new  Scanner(System.in);

System.out.println("Ingresa el costo del producto"); //obtener el precio del producto
double precioProducto = scanner.nextDouble();

double porcentajeDescuento = 35;
double descuento = calcularDescuento (precioProducto, porcentajeDescuento);

double porcentajeImpuesto = 14;
double impuesto = calcularImpuesto (precioProducto, porcentajeImpuesto);

double total = calcularTotal(precioProducto, descuento, impuesto); //calcular el total

total = redondear (total,2);

System.out.println("Precio del producto $ " + precioProducto);
System.out.println("Descuento aplicado al producto $"+descuento);
System.out.println("Impuesto aplicado $"+ impuesto);
System.out.println("Total a pagar $"+ total);

	} //las funciones o métodos dependen de las variables declaradas y retornan la operación que se requiere para cada uno
		
	static double calcularDescuento (double precioProducto, double porcentajeDescuento) { //función / método para calcular el descuento
			return(precioProducto * porcentajeDescuento) / 100; //return: se hace la operación 
		}//static double calcularDescuento
		
		static double calcularImpuesto(double precioProducto, double porcentajeImpuesto) { //función / método
			return(precioProducto * porcentajeImpuesto) / 100;
		}//static double calcularImpuesto
		
		static double calcularTotal (double precioProducto, double descuento, double impuesto) {
			return (precioProducto - descuento) + impuesto;
		}//static double calcularTotal
		
		static double  redondear (double valor, int decimales) {
			double factor = Math.pow(10, decimales);
			return Math.round(valor*factor)/factor;
			
	} //
} //

/*La refactorizacion es reestructurar código que ya existe sin alterar su comportamiento. Tiene como objetivo mejorar la legibilidad, mantenibilidad y optimizacion de nuestro codigo*/