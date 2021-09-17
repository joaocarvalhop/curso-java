package lambdas;

// recebe UM parametro e retorna um BOOLEAN
import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook", 5899.99, 0.20);
		System.out.println(isCaro.test(produto));
	}

}
