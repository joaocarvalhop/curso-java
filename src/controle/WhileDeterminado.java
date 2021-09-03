package controle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		int contador = 1;
		
		// não é a estrutura mais adequada para 
		// se ter uma repetição determinada, o melhor é o For
		while (contador <= 20){
			System.out.printf("i = %d\n", contador);
			contador++;
		}
	}

}
