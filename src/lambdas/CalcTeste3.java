package lambdas;

import java.util.function.BinaryOperator;

public class CalcTeste3 {

	public static void main(String[] args) {
		
		// troquei a interface Calculo por BinaryOperator
		BinaryOperator<Double> calc = (x, y) -> { return x + y; };
		// Vc está ref a classe Double então o num precisa ter ponto flutuante
		System.out.println(calc.apply(2.0, 4.0));
		
		calc = (x, y) -> x * y;		
		System.out.println(calc.apply(2.0, 4.0));
		
		BinaryOperator<Integer> calc2 = (x, y) -> { return x + y; };
		System.out.println(calc2.apply(2, 4));
		
		calc = (x, y) -> x * y;		
		System.out.println(calc2.apply(2, 4));
	}
}
