package colecoes2;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// funciona igual ao add, s� que se n�o conseguir inserir o dado por algum
		// motivo ele retorna false
		fila.offer("Maria");
		fila.offer("Jo�o");
		// j� o m�todo add ele joga um erro caso n�o insira o dado
		fila.add("Pedro");

		// trazem o primeiro da fila sem remover
		System.out.println("Peek and Element... ");
		System.out.println(fila.peek());
		System.out.println(fila.element());

		// trazem o primeiro da fila e remove
		System.out.println("Poll and remove... ");
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
	}
}
