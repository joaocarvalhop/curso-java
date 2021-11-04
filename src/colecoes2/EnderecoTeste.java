package colecoes2;

public class EnderecoTeste {

	public static void main(String[] args) {

		// Exemplo de HashCode e Equals

		Endereco e1 = new Endereco("Rua 1", 1, "Complemento 1");
		Endereco e2 = new Endereco("Rua 1", 1, "Complemento 1");

		// os dois retornam falso pq comparam o endere�o de memoria de cada objeto em
		// vez dos valores de cada um
		System.out.println(e1 == e2);
		// System.out.println(e1.equals(e2));

		// para compararmos o conte�do dos objetos devemos instanciar um m�todo equals
		// na classe do objeto a ser instanciado, no caso o Endereco	
		
		// agora o equals vale true
		System.out.println(e1.equals(e2));
	}
}
