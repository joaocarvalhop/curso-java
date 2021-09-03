package fundamentos.desafios;

import java.util.Scanner;

public class Df1 {

	public static void main(String[] args) {
		// Criar um programa que leia a temperatura 
		// em Fahrenheit e converta para Celsius.
		// fahrenheit 32 e ceusius 0
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("temperatura em fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		double celsius = (fahrenheit - 32) * 5/9;
		System.out.println("temperatura em celsius: " + celsius);
		
		entrada.close();
	}

}
