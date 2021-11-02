package colecoes2;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncadoSetEx {

	public static void main(String[] args) {

		Set conjunto = new HashSet();
		conjunto.add('A');
		conjunto.add("Abc");
		conjunto.add(5);
		conjunto.add(3.14);
		conjunto.add(false);

		System.out.println("Add... ");
		// add retorna verdadeiro ou falso
		System.out.println(conjunto.add(5));
		System.out.println(conjunto.add(10));

		System.out.println("Size... " + conjunto.size());

		// return true or false
		System.out.println("Remove... " + conjunto.remove("a") + " - " + conjunto.remove('a'));

		// se contém determinado elemento
		System.out.println("Contains... " + conjunto.contains(3.14));
	}
}
