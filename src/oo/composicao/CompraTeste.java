package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.nomeCliente = "Jo�o Pedro";

		compra1.itens.add(new Item("Escova", 1, 8.25));
		compra1.itens.add(new Item("Milho", 5, 4.75));
		compra1.itens.add(new Item("P�o de forma", 2, 6.89));

		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
	}

}
