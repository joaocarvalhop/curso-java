package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
//		Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Jo�o");
		listaAprovados.add("Jos�");
		listaAprovados.add("Julia");
		listaAprovados.add("Joana");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
	}
}
