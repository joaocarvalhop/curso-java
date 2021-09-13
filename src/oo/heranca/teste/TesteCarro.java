package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TesteCarro {

	public static void main(String[] args) {
		 
		Carro c1 = new Civic(100);
		
		c1.acelerar();
		
		System.out.println("Civic=> " + c1);
		
		Ferrari c2 = new Ferrari(100);
		c2.ligarTurbo();
		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		
		System.out.println(c2);

	}

}
