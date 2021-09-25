package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		// soma total = 45
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		// somar todos usando Reduce
		
		BinaryOperator<Integer> soma = (acumulador, n) -> acumulador + n;
		
		// Reduce assim como ForEach termina a stream
		// ou seja nada vem dps do Reduce quando se trata de stream
		// get é responsável por pegar os n da lista
		int total = nums.stream().reduce(soma).get();
		System.out.println(total);
		
		// colocando valor inicial a 100.
		// não precisei do get
		Integer total2 = nums.parallelStream().reduce(100, soma);
		System.out.println(total2);
		
		// resultado foi um opcional Integer
		// ifPresent == se tiver presente faça...syso
		nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println);;
	}
}
