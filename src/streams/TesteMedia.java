package streams;

public class TesteMedia {

	public static void main(String[] args) {

		// posso fazer dessa forma usando o nome da classe
		// como retorno no método Adicionar
		Media m1 = new Media().adicionar(8.5).adicionar(7.5);
		// ainda posso fazer do jeito tradicional
		// m1.adicionar(5.5);
		Media m2 = new Media().adicionar(7.5).adicionar(5.5);
		
		System.out.println(m1.getValor());
		System.out.println(m2.getValor());
	}

}
