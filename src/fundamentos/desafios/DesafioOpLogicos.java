package fundamentos.desafios;

public class DesafioOpLogicos {

	public static void main(String[] args) {
		
		// Exponenciação 3 elevado a 2 que resulta em 9
		double a = Math.pow(3, 2);
		
		// posso tb fazer um CAST para que o resutado seja
		// explicitamente inteiro caso deseje
		// 2 elevado a 2 resulta em 4
		int b = (int)Math.pow(2, 2);
		
		System.out.println(a);
		System.out.println(b);
	}

}
