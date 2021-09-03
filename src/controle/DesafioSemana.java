package controle;

import java.util.Scanner;

public class DesafioSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		String diaSemana = entrada.next().trim();
		
		// equalsIgnoreCase ele ignora caso vc escreva com/sem mai�scula
		
		if (diaSemana.equals("Domingo")) {
			System.out.println("1");
		}else if (diaSemana.equalsIgnoreCase("Segunda")) {
			System.out.println("2");
		}else if (diaSemana.equalsIgnoreCase("Ter�a") 
				|| diaSemana.equalsIgnoreCase("Terca")) {
			System.out.println("3");
		}else if (diaSemana.equalsIgnoreCase("Quarta")) {
			System.out.println("4");
		}else if (diaSemana.equalsIgnoreCase("Quinta")) {
			System.out.println("5");
		}else if (diaSemana.equalsIgnoreCase("Sexta")) {
			System.out.println("6");
		}else if (diaSemana.equalsIgnoreCase("S�bado") 
				|| diaSemana.equalsIgnoreCase("Sabado")) {
			System.out.println("7");
		}else {
			System.out.println("Dia inv�lido!");
		}
		
		entrada.close();
	}

}
