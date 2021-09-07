package oo.composicao.desafio;

public class Test {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1.89, 5);
		compra1.adicionarItem("Notebook", 2799.89, 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Mochila", 189.79, 1);
		compra2.adicionarItem("Garrafa", 11.89, 9);
	
		Cliente c1 = new Cliente("Jota pe");
		// não é a abordagem correta... mas vai
		// ser usado no exemplo 
		c1.compras.add(compra1);
		c1.compras.add(compra2);
		
		System.out.println(c1.obterValorTotal());
	}

}
