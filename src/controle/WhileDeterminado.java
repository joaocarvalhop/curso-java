package controle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		int contador = 1;
		
		// n�o � a estrutura mais adequada para 
		// se ter uma repeti��o determinada, o melhor � o For
		while (contador <= 20){
			System.out.printf("i = %d\n", contador);
			contador++;
		}
	}

}
