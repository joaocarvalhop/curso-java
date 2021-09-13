package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador j1 = new Heroi();
		j1.x = 10;
		j1.y = 10;
		
		Jogador j2 = new Monstro();
		j2.x = 10;
		j2.y = 11;

		System.out.println("Heroi hp>>> " + j1.hp);
		System.out.println("Monstro hp>>> " + j2.hp);
		
		j1.atacar(j2);
		j2.atacar(j1);
		
		System.out.println("\n Heroi hp>>> " + j1.hp);
		System.out.println("Monstro hp>>> " + j2.hp);
		
		j1.atacar(j2);
		j2.atacar(j1);
		
		System.out.println("\n Heroi hp>>> " + j1.hp);
		System.out.println("Monstro hp>>> " + j2.hp);
		
		j2.andar(Direcao.NORTE);
		j1.atacar(j2);
		j2.atacar(j1);
		
		System.out.println("\n Heroi hp>>> " + j1.hp);
		System.out.println("Monstro hp>>> " + j2.hp);
	}
}
