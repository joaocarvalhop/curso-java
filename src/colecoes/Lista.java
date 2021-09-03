package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);

		lista.add(new Usuario("Jo�o"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Matilda"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3));
		
		for (Usuario u : lista) {
			System.out.println(u);
		}
	}
}
