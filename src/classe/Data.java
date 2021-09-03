package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	// se não receber nada o valor será esse
	Data(){
	//	dia = 1;
	//	mes = 1;
	//	ano = 1970;
	this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String dataFormatada () {
		return String.format("%d/%d/%d", this.dia, mes, ano);
	}
	
}
