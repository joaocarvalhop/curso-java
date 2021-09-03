package fundamentos.desafios;

import java.util.Scanner;

public class Df2 {

	public static void main(String[] args) {
		// Criar um programa que leia a temperatura 
		// em Celsius e converta para Fahrenheit.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("temperatura em celsius: ");
		double celsius = entrada.nextDouble();
		
		double conversao = (celsius * (9/5) + 32);
		System.out.print("temperatura em fahrenheit: " + conversao);
		
		entrada.close();
	}

}
