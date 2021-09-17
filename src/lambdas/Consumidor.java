package lambdas;

import java.util.Arrays;
import java.util.List;

// recebe UM parametro e não retorna nada
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		Consumer<Produto> imprimir = p -> System.out.print(p.nome + "\n");

		Produto p1 = new Produto("iPhone 13", 15000.00, 0.0);
		imprimir.accept(p1);

		Produto p2 = new Produto("SSD 256gb", 200.00, 0.09);
		Produto p3 = new Produto("Acer Nitro 5", 6599.00, 0.01);

		List<Produto> produtos = Arrays.asList(p1, p2, p3);
		produtos.forEach(imprimir);
		// method reference
		produtos.forEach(System.out::println);
	}

}
