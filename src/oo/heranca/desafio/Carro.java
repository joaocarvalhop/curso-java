package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	public int velAtual;
	
	Carro (int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (velAtual + 5 > VELOCIDADE_MAXIMA) {
			velAtual = VELOCIDADE_MAXIMA;
		} else {
			velAtual += 5;
		}
	}
	
	public void frear() {
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
