package oo.heranca;

public class Jogador {

	int hp = 100;
	int x;
	int y;
	
	boolean atacar(Jogador oponente) {
		// abs para o resultado seja sempre maior que 0
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if((deltaX == 0 && deltaY == 1) || 
				(deltaX == 1 && deltaY == 0)) {
			oponente.hp -= 10;
			return true;
		}else {
			return false;
		}
	}
	
	boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y++;
			break;
		case LESTE:
			x++;
			break;
		case OESTE:
			x--;
			break;
		case SUL:
			y--;
			break;
		}
		
// 		recoreria ao if em um programa mais apurado para tratar 
//		de erros como receber valores de x e y negativos ou nulos
//		if (direcao == Direcao.NORTE) {
//			y++;
//		}else if (direcao == Direcao.SUL) {
//			y--;
//		}else if (direcao == Direcao.LESTE) {
//			x++;
//		}else if (direcao == Direcao.OESTE) {
//			x--;
//		}
				
		return true;
	}
}
