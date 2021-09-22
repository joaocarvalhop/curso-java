package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		// 1# número para String binária ... 6 => 110
		// nums.stream().map(Integer::toBinaryString).forEach(System.out::println);
		
		// 2# Inverter a String... "110" =>	"011"
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		
		// 3# Converter de volta para int "011" => 3
		Function<String, Integer> binarioToInt = s -> Integer.parseInt(s, 2);
		
		// completo
		nums.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(binarioToInt)
			.forEach(System.out::println);
	}

}
