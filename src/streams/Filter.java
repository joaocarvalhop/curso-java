package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		
	FilterAluno	a1 = new FilterAluno("Ana", 7.8);
	FilterAluno	a2 = new FilterAluno("Bia", 5.8);
	FilterAluno	a3 = new FilterAluno("Daniel", 9.8);
	FilterAluno	a4 = new FilterAluno("Gui", 6.8);
	FilterAluno	a5 = new FilterAluno("Rebeca", 7.1);
	FilterAluno	a6 = new FilterAluno("Pedro", 8.8);
	
	List<FilterAluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
	
	// posso criar um Predicate para colocar 
	// como parametro do filter, dessa forma>>>
	
	// Predicate<FilterAluno> aprovado = a -> a.nota >= 7.0; só retorna boolean
	// alunos.stream().filter(aprovado).map(a -> a.nome + " Aprovado").forEach(System.out::println);
	
	// posso tbm passar uma saudação em forma de Function
	//Function<FilterAluno, String> saudacao = a -> a.nome + " Parabens!!!";
	
	alunos.stream()
	.filter(a -> a.nota >= 7.0)
	.map(a -> a.nome + " Aprovado")
	.forEach(System.out::println);
	}
}
