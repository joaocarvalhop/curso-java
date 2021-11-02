package colecoes2;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoArrumado {

	public static void main(String[] args) {

		// conjunto homogeneo
		// LinkedHashSet respeita a ordem de inser��o
		// TreeHashSet organiza em ordem alfabetica
		Set<String> aprovados = new HashSet<>();
		aprovados.add("Jo�o");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Mario");

		for (String nome : aprovados) {
			System.out.println(nome);
		}
	}

}
