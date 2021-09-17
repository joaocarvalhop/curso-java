package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
	
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		// a sa�da do m�todo deve ser a entrada do outro, se na primeira 
		// fun��o saiu uma String a pr�xima fun��o se inicia com uma String
		Function<String, String> resultadoE = valor -> "O resultado � " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		// na 1� fun��o foi passado um inteiro para string ent�o � possivel concatenar dessa forma
		String resultFinal = parOuImpar.andThen(resultadoE).andThen(empolgado).apply(58);
		
		// System.out.println(parOuImpar.apply(52));
		System.out.println(resultFinal);
	}

}
