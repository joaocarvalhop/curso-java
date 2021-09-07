package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> itens = new ArrayList<>();
	
	void adicionarItem (Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}
	
	void adicionarItem (String nome, double preco, int qtde) {
		this.itens.add(new Item(new Produto(nome, preco), qtde));
	}
	
	double obterValorTotal () {
		double total = 0;
		
		for (Item item : itens) {
			total += item.qtde * item.produto.preco;
		}
		
		return total;
	}
}
