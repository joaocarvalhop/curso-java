package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Lu", "Gui", "Tue", "Ana");

		System.out.println("Foreach...");
		for (String aprovado : aprovados) {
			System.out.println(aprovado + " ");
		}

		// quer dizer repetição, ñ confunda com interação
		System.out.println("\nIterator...");
		Iterator<String> it = aprovados.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + " ");
		}

		System.out.println("\nStream...");
		Stream<String> str = aprovados.stream();
		str.forEach(System.out::println);
	}
}
