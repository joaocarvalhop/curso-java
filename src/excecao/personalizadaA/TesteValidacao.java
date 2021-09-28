package excecao.personalizadaA;

import excecao.FilterAluno;

public class TesteValidacao {

	public static void main(String[] args) {

		try {
			FilterAluno a1 = new FilterAluno("Ana", 7);
			Validar.aluno(a1);
		} catch (StringVaziaException | NumNegativoException e) {
			System.out.println(e.getMessage());
		}
		// posso fazer outro bloco para especificar melhor
		// catch (NumNegativoException e) {
		// System.out.println(e.getMessage()); }

		System.out.println("Fim :D");
	}

}
