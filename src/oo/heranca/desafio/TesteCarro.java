package oo.heranca.desafio;

public class TesteCarro {

	public static void main(String[] args) {
		 
		Carro c1 = new Civic(100);
		
		c1.acelerar();
		
		System.out.println("Civic=> " + c1);
		
		Carro c2 = new Ferrari(100);
		
		c2.acelerar();
		
		System.out.println("Ferrari=> " + c2);

	}

}
