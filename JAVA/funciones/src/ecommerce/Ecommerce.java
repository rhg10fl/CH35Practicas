package ecommerce;
import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
	
	static class Producto { //Esta es una clase para representar un producto
		String nombre;
		double precio;
		
		Producto (String nombre, double precio){
			this.nombre = nombre;
			this.precio = precio;
		}
		
		static class CarritoCompra {
			List<Producto> productos = new ArrayList<>();
			
			void agregarProducto(Producto barbie) {
				productos.add(barbie);
			}
			
			double calcularTotal() {
				double total = 0;
				for(Producto barbie : productos) {  // for(Producto barbie : productos) de(lista Producto toma el producto llamado barbie : desde el array productos)
				total += barbie.precio;
			}
				return total;
		}
	} //class

	public static void main(String[] args) {
		
		Producto munieca1 = new Producto ("Panter", 98.70);
		Producto munieca2 = new Producto ("Benito", 85.40);
		
		CarritoCompra carrito =  new CarritoCompra ();
		
		carrito.agregarProducto(munieca1);
		carrito.agregarProducto(munieca2);
		
		double totalCarrito = carrito.calcularTotal();
		
		System.out.println("Total del carrito: $" + totalCarrito);
		
		
	}

	}
	}
