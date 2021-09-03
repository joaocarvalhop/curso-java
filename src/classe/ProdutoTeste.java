package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		// criei o produto p1 com uma só linha de cód
		Produto p1 = new Produto("Celular", 1899.89);
/*		p1.nome  = "Celular";
		p1.preco = 1899.89;
		p1.desconto = 0.25; */
		
		Produto p2 = new Produto("Notebook");
		// p2.nome  = "Notebook";
		p2.preco = 2000.89;
		
		System.out.println(p1.nome + " " + p1.precoDescontado());
		System.out.println(p2.nome + " " + p2.precoDescontado());
		
		double precoFinal1 = p1.precoDescontado(0);
		double precoFinal2 = p2.precoDescontado(0.2);
		double precoMedia = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho R$%.2f.\n", precoMedia);
		System.out.printf("Preço final 1>>>%.2f.\n", precoFinal1);
		System.out.printf("Preço final 2>>>%.2f.\n", precoFinal2);
	}

}
