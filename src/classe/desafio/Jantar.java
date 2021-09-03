package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Carne", 0.48);
		
		Pessoa p1 = new Pessoa("João", 70.1);
		
		System.out.println(c1.nome.concat(" ---> ") + c1.pesoC);
		System.out.println(p1.nome.concat(" ----> ") + p1.peso);
		System.out.println("Peso após comer: " + (p1.peso + c1.pesoC));
		
	}
}
