package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro01();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro02();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}

	// EXCEÇÃO NÃO CHECADA OU NÃO VERIFICADA
	// tudo que herda da classe Throwable pode 
	// usar o throw new e o nome da classe
	static void geraErro01 () {
		throw new RuntimeException("Ocorreu um erro 01");
	}
	// EXCEÇÃO CHECADA OU VERIFICADA
	// então precisa ser declarada
	static void geraErro02 () throws Exception {
		throw new Exception("Ocorreu um erro 02");
	}
}
