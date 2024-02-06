package hilos;

public class Prueba1 extends Thread {
	public String numeroDePedido;
	
	
	public Prueba1(String numeroDePedido) {
		this.numeroDePedido = numeroDePedido;
	}
	public void run () {
		System.out.println("Pedido preocesado " + numeroDePedido);
	}
}//class

/*
 * Differences between "extending" and "implementing" Threads

The major difference is that when a class extends the Thread class, you cannot extend any other class, but by implementing the Runnable interface, it is possible to extend from another class as well, like: class MyClass extends OtherClass implements Runnable.
*/
