package oo.polimorfismo;

public class Pessoa {

	// peso em Kg
	private double peso = 0;

	public Pessoa(double pesoInicial) {
		this.peso = pesoInicial;
	}

	public double getPeso() {
		return peso;
	}

	// isso não é recomendado pq é polimorfismo estático
	// public void comer(Arroz arroz) {
	// this.peso += arroz.getPeso();
	// }

	// public void comer(Feijao feijao) {
	// this.peso += feijao.getPeso();
	// }

	// o ideal é dinamico onde posso criar qualquer tipo de comida e instanciar com
	// mais facilidade na classe jantar
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
}
