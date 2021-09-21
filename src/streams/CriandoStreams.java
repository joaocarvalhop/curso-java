package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		
		// passando os valores literais
		Stream<String> langs = Stream.of("Java", ", Go", ", Python\n");
		// imprimindo os valores
		langs.forEach(print);
		
		// construindo um array 
		String[] maisLangs = {"C# ", "Perl ", "JS ", ".NET\n"};
		Stream.of(maisLangs).forEach(print);
		
		// passando um array por uma stream para ser impresso
		Arrays.stream(maisLangs).forEach(print);
		
		// usando arrays posso pegar os conjuntos
		// no caso vai do 1 ao 3 por isso só mostra Pearl e JS pq para no 3
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C++ ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		
		
	}

}
