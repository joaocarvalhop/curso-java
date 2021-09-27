package excecao;

public class Basico {

	public static void main(String[] args) {

		FilterAluno a1 = null;
		
		try {
		imprimirAluno(a1);
		// usando a forma gen�rica Exception 
		// mas d� pra usar a classe expecifica do erro
		}catch(Exception excecao) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do usu�rio!");
		}
		
		try {
			System.out.println(7 / 0);
		// como nesse exemplo, o ideal � 
		// tratar de forma mais expecifica
		} catch (ArithmeticException e) {
			// vc pode silenciar o erro comentando a linha do catch
			System.out.println("Ocorreu o erro: " + e.getMessage());
		}

		System.out.println("Fim :)");
	}

	public static void imprimirAluno(FilterAluno aluno) {
		// esse m�todo est� vulner�vel pois pode receber um aluno nulo
		System.out.println(aluno.nome);
	}
}
