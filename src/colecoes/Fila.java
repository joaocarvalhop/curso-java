package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		 
		Queue<String> fila= new LinkedList<>();
		
		// Add e Offer -> adicionam elementos a 
		// diferen�a � quando a fila est� cheia
		fila.add("Ana");   // retorna false
		fila.offer("Bia"); // lan�a uma exce��o
		fila.add("Jo�o");
		fila.offer("Caio");
		fila.add("Susy");
		fila.offer("Malu");
		
		// Peek e Element -> Obter o pr�ximo 
		// elemento da fila (sem remover)
		
		// diferen�a � o comportamento que 
		// ocorre quando a fila est� vazia
		System.out.println(fila.peek());    // retorna false
		System.out.println(fila.element()); // lan�a uma exce��o
		
		// fila.clear();
		// fila.size();
		// fila.isEmpty()
		
		System.out.println(fila.poll());
		System.out.println(fila.remove());		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());

		
	}
}
