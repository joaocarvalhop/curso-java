package oo.heranca.desafio;

public class Ferrari extends Carro implements Sportivo {

	public Ferrari(int velAtual) {
		super(320);
		// TODO Auto-generated constructor stub
	}

	public void acelerar() {
		velAtual += 15;
	}
	
	@Override
	public void ligarTurbo() {
		velAtual += 35;	
	}
	
	@Override
	public void desligarTurbo() {
		velAtual += 15;
	}
}
