package hilos;

public class Prueba2 implements Runnable{
	
	public String numeroDePedido; 
	
	public Prueba2(String numeroDePedido) {
		this.numeroDePedido = numeroDePedido;
	}
	
	public void run() {
		System.out.println("Pedido procesado " + numeroDePedido);
	}
}//class