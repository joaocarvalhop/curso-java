package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		/* Extremamente raro usar Switch sem o Break */
		
		// ele executa todos que estão abaixo da 
		// sua escolha caso não tenha um break 
		int idade = 3;
		
		switch (idade) {
		case 3:
			System.out.println("Sabe falar");
		case 2:
			System.out.println("Sabe andar");
		case 1: 
			System.out.println("Sabe respirar");
			
			// o break impede que a linha default seja 
			// executada mesmo quando o valor entra no caso
			break;
		
		// caso nenhum dos casos seja chamado
		default:
			System.out.println("Nem nasceu ainda");		
		}

	}

}
