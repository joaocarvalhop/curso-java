package oo.composicao;

public class Motor {

	boolean ligado = false;
	double fatorInjecao = 1;
	
	int Giros() {
		if (!ligado) {
			return 0;
		}else {
			// round arredonda o num resultante
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
