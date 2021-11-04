package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {

		Arroz a = new Arroz();
		a.setPeso(0.35);
		
		Feijao f = new Feijao();
		f.setPeso(0.22);
		
		Sorvete s = new Sorvete();
		s.setPeso(0.12);
		
		Pessoa p = new Pessoa(70);
		p.comer(a);
		p.comer(f);
		p.comer(s);
		
		System.out.println(p.getPeso());
	}
}
