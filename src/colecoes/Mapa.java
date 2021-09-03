package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> Usuarios = new HashMap<>();
		Usuarios.put(1, "Tony");
		Usuarios.put(2, "Thor");
		Usuarios.put(3, "Tamy");
		Usuarios.put(4, "Titi");
		
		System.out.println(Usuarios.isEmpty());
		System.out.println(Usuarios.size());
		
		System.out.println(Usuarios.keySet());
		System.out.println(Usuarios.values());
		System.out.println(Usuarios.entrySet());
		
 	}

}
