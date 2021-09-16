package lambdas;

public class CalcTeste2 {

	public static void main(String[] args) {
		
		// Vai ter a mesma funcionalidade do calc1 s� que com Lambdas
		// Lambdas>>> s�o fun��es anonimas que n�o possuem nome e 
		// podem ser atribuidas a outras vari�veis
		
		// ou Calculo soma = (x, y) -> {return x + y;};
		Calculo calc = (x, y) -> { 
			return x + y;
		};
		
		System.out.println(calc.executar(2, 4));
		
		// se instanciar o metodo lambda assim sem as chaves o Java
		// s� vai aceitar um bloco de codigo no caso o x * y e n�o retorna mais nada
		calc = (x, y) -> x * y;
		
		System.out.println(calc.executar(2, 4));
	}
}
