package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {

		// todas essas s�o opera��es intermedi�rias 
		
		FilterAluno a1 = new FilterAluno("Ana", 7.5);
		FilterAluno a2 = new FilterAluno("Luna", 8.5);
		FilterAluno a3 = new FilterAluno("Gui", 5.5);
		FilterAluno a4 = new FilterAluno("Gabi", 10);
		FilterAluno a5 = new FilterAluno("Ana", 7.5);
		FilterAluno a6 = new FilterAluno("Pedro", 7.4);
		FilterAluno a7 = new FilterAluno("Gui", 5.5);
		FilterAluno a8 = new FilterAluno("Tati", 9.8);

		List<FilterAluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("distinct... ");
		// para n�o haver duplica��o
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		// pulou 2 alunos
		alunos.stream().distinct().skip(2).forEach(System.out::println);
		
		// estipulando um limite de impress�es
		alunos.stream().distinct().limit(2).skip(1).forEach(System.out::println);
		
		// pegue elementos enquanto acontecer x situa��o
		System.out.println("\ntakeWhile");
		alunos.stream().distinct().takeWhile(a -> a.nota > 7).forEach(System.out::println);
	}
}