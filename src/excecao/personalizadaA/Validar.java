package excecao.personalizadaA;

import excecao.FilterAluno;

public class Validar {
	
	// private para a classe n?o ser instanciada
	private Validar() {}

	public static void aluno(FilterAluno aluno) {
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno est? nulo!");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumNegativoException("nota");
		}
	}
}
