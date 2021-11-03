package colecoes2;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// funciona igual ao add, só que se não conseguir inserir o dado por algum
		// motivo ele retorna false
		fila.offer("Maria");
		fila.offer("João");
		// já o método add ele joga um erro caso não insira o dado
		fila.add("Pedro");
		
		System.out.println("Peek and Element... ");
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println("Poll and remove... ");
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
	}
}
