package colecoes2;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {

		// map é uma mistura de set com list, pq recebe a chave assim como o set e tbm
		// recebe o valor como no list
		Map<Integer, String> aprovados = new HashMap<>();

		// add vira put aqui
		aprovados.put(1, "João");
		aprovados.put(2, "Ana");
		aprovados.put(3, "Bia");
		aprovados.put(4, "Pedro");

		// obter o conjunto de chaves
		System.out.println(aprovados.keySet());

		// obter valores
		System.out.println(aprovados.values());

		// obtem o conjunto completo de registros = chave+valor
		System.out.println(aprovados.entrySet());
		
		// substituindo bia por beatriz
		aprovados.put(3, "Beatriz");
		
		// buscando em aprovados o elemento de chave 3 
		System.out.println(aprovados.get(3));
	}
}
