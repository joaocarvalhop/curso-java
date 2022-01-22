package arrays.desafio;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantas notas deseja informar? ...");
		int a = entrada.nextInt();

		double[] notas = new double[a];

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota: " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}

		System.out.println(Arrays.toString(notas));

		entrada.close();
	}

}
