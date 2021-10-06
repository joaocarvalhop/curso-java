package generics;

public class CaixaIntTeste {
	
	public static void main(String[] args) {
		
		CaixaInt caixaB = new CaixaInt();
		caixaB.guardar(2323);
		
		Integer coisaB = caixaB.abrir(); 
		System.out.println(coisaB);
	}
}
