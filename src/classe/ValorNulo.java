package classe;

public class ValorNulo {

	public static void main(String[] args) {
		
		// Usa-se o nulo quando se acha que uma variável 
		// pode ou não apontar para um objeto valido
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));

		// gera um n° entre 0 e 1
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		if (d1 != null) {
			d1.mes = 3;
			System.out.println(d1.dataFormatada());
		}
		
		String s2 = Math.random() > 0.5 ? "Opa..." : null;

		if (s2 != null) {
			System.out.println(s2.concat("123456789"));
		}
		
	}

}
