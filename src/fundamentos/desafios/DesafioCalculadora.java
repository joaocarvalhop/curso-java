package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada1 = new Scanner(System.in);
		
		System.out.print("1°N ---> ");
		double num1 = entrada1.nextDouble();
		System.out.print("2°N ---> ");
		double num2 = entrada1.nextDouble();
		
		System.out.print("+ - * / ??? ");
		String op = entrada1.next();
		
		// Lógica com operador ternário
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", 
				num1, op, num2, resultado);
		
		entrada1.close();
	}

}
