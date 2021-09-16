package lambdas;

public class CalcTeste2 {

	public static void main(String[] args) {
		
		// Vai ter a mesma funcionalidade do calc1 só que com Lambdas
		// Lambdas>>> são funções anonimas que não possuem nome e 
		// podem ser atribuidas a outras variáveis
		
		// ou Calculo soma = (x, y) -> {return x + y;};
		Calculo calc = (x, y) -> { 
			return x + y;
		};
		
		System.out.println(calc.executar(2, 4));
		
		// se instanciar o metodo lambda assim sem as chaves o Java
		// só vai aceitar um bloco de codigo no caso o x * y e não retorna mais nada
		calc = (x, y) -> x * y;
		
		System.out.println(calc.executar(2, 4));
	}
}
