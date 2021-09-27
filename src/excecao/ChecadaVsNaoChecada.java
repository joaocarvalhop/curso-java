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

	// EXCE��O N�O CHECADA OU N�O VERIFICADA
	// tudo que herda da classe Throwable pode 
	// usar o throw new e o nome da classe
	static void geraErro01 () {
		throw new RuntimeException("Ocorreu um erro 01");
	}
	// EXCE��O CHECADA OU VERIFICADA
	// ent�o precisa ser declarada
	static void geraErro02 () throws Exception {
		throw new Exception("Ocorreu um erro 02");
	}
}
