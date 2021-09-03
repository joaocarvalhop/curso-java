package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data();
		
		d1.dia = 27;
		d1.mes = 11;
		d1.ano = 2021;
		
		d2.dia = 15;
		d2.mes = 12;
		d2.ano = 2018; 
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		System.out.println(d3.dataFormatada());

	}

}
