package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Ana", "Bia", "Gui", "Bob");

		System.out.println("Forma tradicional...");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		// menor e mais flexível
		System.out.println("\nLambda forma 1#...");
		aprovados.forEach(nome -> System.out.println(nome + " !!!"));
		
		// dá pra simplificar ainda mais que forEach
		System.out.println("\nMethod Reference 1#...");
		// não dá pra concatenar 
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda forma 2#...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference 2#...");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Hi! my name is " + nome);
	}

}
