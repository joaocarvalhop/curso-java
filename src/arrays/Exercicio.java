package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAluno1 = new double[3];

		System.out.println(Arrays.toString(notasAluno1));

		notasAluno1[0] = 7.8;
		notasAluno1[1] = 5;
		notasAluno1[2] = 8.8;

		System.out.println(Arrays.toString(notasAluno1));

		double totalAluno1 = 0;
		for (int i = 0; i < notasAluno1.length; i++) {
			totalAluno1 += notasAluno1[i];
		}

		System.out.println("Média do aluno 1: " + (totalAluno1 / notasAluno1.length));

		double[] notasAluno2 = { 6.7, 8.8, 5.6, 9 };
		
		double totalAluno2 = 0;
		for (int i = 0; i < notasAluno2.length; i++) {
			totalAluno2 += notasAluno2[i];		
		}
		
		System.out.println("Média do aluno 2: " + (totalAluno2 / notasAluno2.length));
	}

}
