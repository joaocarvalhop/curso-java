package classe;

public class ValorVsRef {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(12, 12, 2012);
		Data d2 = d1; // atribuição por referência(objeto)
		
		d1.dia = 11;
		d1.mes = 11;
		d1.ano = 2011;
		
		System.out.println("\n" + d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		VoltarDataParaValorPadrao(d1);
		
		System.out.println("\n" + d1.dataFormatada());
		System.out.println(d2.dataFormatada());
	}
	
	static void VoltarDataParaValorPadrao (Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
