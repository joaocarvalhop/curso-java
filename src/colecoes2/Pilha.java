package colecoes2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		// Deque serve para Stack e tbm para Queue
		// Stack<String> pilha = new Stack<>();
		Deque<String> pilha = new ArrayDeque<>();

		// colocar algo na pilha
		pilha.push("Livro 1");
		pilha.push("Livro 2");
		pilha.push("Livro 3");

		System.out.println("Peek---> " + pilha.peek());

		// seleciona o ultimo da pilha e remove
		System.out.println("Pop...1° " + pilha.pop());
		System.out.println("Pop...2° " + pilha.pop());
		System.out.println("Pop...3° " + pilha.pop());
	}
}
