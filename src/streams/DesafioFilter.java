package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Prod p1 = new Prod("Fone", 44.99, 0.02, 5.25);
		Prod p2 = new Prod("Caderno ben 10", 27.89, 0.03, 3.90);
		Prod p3 = new Prod("Mochila", 139.59, 0.30, 0.00);
		Prod p4 = new Prod("Cadeira", 789.89, 0.35, 0.0);
		Prod p5 = new Prod("Monitor", 1489.69, 0.45, 0.0);
		
		List<Prod> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		Predicate<Prod> superPromo = p -> p.desconto >= 0.30;
		Predicate<Prod> freteGratis = p -> p.frete == 0.0;
		
		Function<Prod, String> propaganda = p -> "Venha aproveitar " + p.nome + "por R$" +p.preco;
		
		produtos.stream().filter(superPromo).filter(freteGratis).map(propaganda).forEach(System.out::println);
	}

}
