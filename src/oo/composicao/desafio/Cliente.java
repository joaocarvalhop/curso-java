package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final String nomeCliente;
	
	final List<Compra> compras = new ArrayList<>();
	
	Cliente (String nome){
		this.nomeCliente = nome;
	}
	
	double obterValorTotal () {
		double total = 0;
		
		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
	}
}