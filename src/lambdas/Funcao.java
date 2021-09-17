package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
	
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		// a saída do método deve ser a entrada do outro, se na primeira 
		// função saiu uma String a próxima função se inicia com uma String
		Function<String, String> resultadoE = valor -> "O resultado é " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		// na 1ª função foi passado um inteiro para string então é possivel concatenar dessa forma
		String resultFinal = parOuImpar.andThen(resultadoE).andThen(empolgado).apply(58);
		
		// System.out.println(parOuImpar.apply(52));
		System.out.println(resultFinal);
	}

}
