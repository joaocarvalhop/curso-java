package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {

	public static void main(String[] args) {

		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(8.9, 7.5));

		BiFunction<Double, Double, String> mediaFinal = (n1, n2) -> ((n1 + n2) / 2) >= 7.0 ? "Aprovado!" : "Reprovado...";
		System.out.println(mediaFinal.apply(7.9, 6.9));
	}
}
