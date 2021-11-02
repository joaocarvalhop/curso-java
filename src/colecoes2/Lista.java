package colecoes2;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		List<String> aprovados = new ArrayList<>();
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Mario");

		// posso pegar/buscar por indice
		System.out.println("get... " + aprovados.get(2));

		// aceita elementos iguais
		System.out.println("add... " + aprovados.add("Maria"));
		System.out.println("size... " + aprovados.size());
		
		System.out.println("remove... " + aprovados.remove("Maria"));
		System.out.println("size... " + aprovados.size());
	}
}
