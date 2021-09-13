package lambdas;

public class CalcTeste1 {

	public static void main(String[] args) {
		
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(2, 4));
		
		// polimorfismo
		calculo = new Multiplicar();	
		System.out.println(calculo.executar(2, 4));
	}

}
