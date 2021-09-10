package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	int velAtual;
	
	Carro (int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	void acelerar() {
		if (velAtual + 5 > VELOCIDADE_MAXIMA) {
			velAtual = VELOCIDADE_MAXIMA;
		} else {
			velAtual += 5;
		}
	}
	
	void frear() {
		if (velAtual >= 5) {
			velAtual -= 5;
		} else {
			velAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual é: " + velAtual + "km/h.";
	}
}
