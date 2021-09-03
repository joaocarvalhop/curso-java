package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("Escaravelho do diabo");
		livros.push("Arte da guerra");
		livros.push("Milagre da manhã");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println("");
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println("");
//		System.out.println(livros.remove());
	}
}
