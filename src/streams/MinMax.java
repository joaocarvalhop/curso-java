package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		
		FilterAluno a1 = new FilterAluno("Ana", 7.5);
		FilterAluno a2 = new FilterAluno("Luna", 8.5);
		FilterAluno a3 = new FilterAluno("Gui", 5.5);
		FilterAluno a4 = new FilterAluno("Gabi", 10);
		
		List<FilterAluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<FilterAluno> melhorNota = (aluno1, aluno2) -> {
			if (aluno1.nota > aluno2.nota) return 1;
			if (aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
	}

}
