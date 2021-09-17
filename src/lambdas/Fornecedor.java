package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {

		// não recebe nenhum parametro e devolve alguma coisa
		// ( ) vazios faz parte da sintaxe
		Supplier<List<String>> umLista = () -> Arrays.asList("Ana", "Bob", "Bia");

		System.out.println(umLista.get());
	}

}
