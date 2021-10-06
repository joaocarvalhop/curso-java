package generics;

public class CaixaTeste<TIPO> {

	public static void main(String[] args) {

		// posso usar Caixa<> no come�o da instancia��o
		// ap�s colocar o tipo os retornos do obj caixaA ser�o do tipo String
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar(":D");
		
		// pode ser assim: System.out.println(caixaA.abrir()); ou
		String coisaA = (String) caixaA.abrir(); 
		System.out.println(coisaA);
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(2323.23);
		
		Double coisaB = (Double) caixaB.abrir(); 
		System.out.println(coisaB);
	}
}
