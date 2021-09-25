package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {
		
		FilterAluno a1 = new FilterAluno("Ana", 7.5);
		FilterAluno a2 = new FilterAluno("Luna", 8.5);
		FilterAluno a3 = new FilterAluno("Gui", 5.5);
		FilterAluno a4 = new FilterAluno("Gabi", 10);
		
		List<FilterAluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<FilterAluno> aprovado = a -> a.nota >= 7.0;
		Function<FilterAluno, Double> apenasNota = a -> a.nota;
		BinaryOperator<Double> somatorio = (a, b) -> a + b;
		
		alunos.parallelStream().filter(aprovado).map(apenasNota).reduce(somatorio).ifPresent(System.out::println);
		
		// <Acumulador, Valor de cada um dos elementos, Resultado>
		BiFunction<Media, Double, Media> calcMedia = (media, nota) -> media.adicionar(nota);
		
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);
		
		Media media = alunos.parallelStream().filter(aprovado).map(apenasNota).reduce(new Media(), calcMedia, combinarMedia);
		System.out.println("A média do aluno é " + media.getValor());
	}
}
