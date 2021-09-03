package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);     // double to Double
		conjunto.add(true);    // boolean to Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1);       // int to Integer
		conjunto.add('x');     // char to Character
		
		System.out.println("tamanho é: " + conjunto.size());
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);	
	}
}
