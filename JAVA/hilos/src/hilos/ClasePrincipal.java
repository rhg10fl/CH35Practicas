package hilos;

public class ClasePrincipal {

	public static void main(String[] args) {
		
		Prueba1 pedido1 = new Prueba1("65");
		Prueba1 pedido2 = new Prueba1("87");
		
		Prueba2 pedido3 = new Prueba2 ("41");
		Prueba2 pedido4 = new Prueba2 ("96");
		
		Thread hiloPedido1 = new Thread(pedido1);
		Thread hiloPedido2 = new Thread(pedido2);
		
		pedido1.start(); 
		pedido2.start();
		
		hiloPedido1.start (); 
		hiloPedido2.start ();
		
	}//main
}//class
