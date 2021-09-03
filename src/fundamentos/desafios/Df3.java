package fundamentos.desafios;

import java.util.Scanner;

public class Df3 {

	public static void main(String[] args) {
		//Criar um programa que leia o peso e a altura 
		// do usuário e imprima no console o IMC.
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o peso:");
		double peso = scanner.nextDouble();

		System.out.println("Digite a altura:");
		double altura = scanner.nextDouble();

		double imc = peso / (altura * altura);

		System.out.print("IMC: " + imc);

		scanner.close();

	}

}
