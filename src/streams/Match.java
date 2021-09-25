package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {

		FilterAluno a1 = new FilterAluno("Ana", 7.5);
		FilterAluno a2 = new FilterAluno("Luna", 8.5);
		FilterAluno a3 = new FilterAluno("Gui", 5.5);
		FilterAluno a4 = new FilterAluno("Gabi", 10);
		
		List<FilterAluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<FilterAluno> aprovado = a -> a.nota >= 7.0;
		Predicate<FilterAluno> reprovado = aprovado.negate();
		
		// se todos foram aprovados
		System.out.println(alunos.stream().allMatch(aprovado));
		
		// algum foi aprovado? return true or false
		System.out.println(alunos.stream().anyMatch(aprovado));
		
		// nenhum foi aprovado?
		System.out.println(alunos.stream().noneMatch(aprovado));		
		
		// nenhum foi reprovando?
		System.out.println(alunos.stream().noneMatch(reprovado));		
	}

}
