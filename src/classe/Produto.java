package classe;

public class Produto {
	
	String nome;
	double preco;
	final static double desconto = 0.25;	
	
	Produto(){
		// caso eu queria instanciar o 
		// nome sem o construtor
	}
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}	
	
	Produto(String nomeInicial, double precoInicial){
		nome  = nomeInicial;
		preco = precoInicial;
	}
	
	double precoDescontado () {
		return preco * (1 - desconto);
	}
	
	double precoDescontado (double descGerente) {
		return preco * (1 - desconto + descGerente);
	}
}
