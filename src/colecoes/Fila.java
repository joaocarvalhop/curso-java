package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		 
		Queue<String> fila= new LinkedList<>();
		
		// Add e Offer -> adicionam elementos a 
		// diferença é quando a fila está cheia
		fila.add("Ana");   // retorna false
		fila.offer("Bia"); // lança uma exceção
		fila.add("João");
		fila.offer("Caio");
		fila.add("Susy");
		fila.offer("Malu");
		
		// Peek e Element -> Obter o próximo 
		// elemento da fila (sem remover)
		
		// diferença é o comportamento que 
		// ocorre quando a fila está vazia
		System.out.println(fila.peek());    // retorna false
		System.out.println(fila.element()); // lança uma exceção
		
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
