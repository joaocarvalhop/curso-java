package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> imposto = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100: preco + 50;
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");
		
		Produto p = new Produto("iPad", 3525.89, 0.13);
		
		String preco = formatar.compose(arredondar).compose(frete).compose(imposto).compose(precoFinal).apply(p);
		// String preco = precoFinal.andThen(imposto).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);
		System.out.println("Preço final>>> " + preco);
	}
}
