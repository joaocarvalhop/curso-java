package generics;

// com o generics
// em <> pode ser passado qualquer letra MAIÚSCULA
// não é comum usar palavras de tipo generico o tipo T, A, X etc.
public class Caixa<T> {
	
	private T coisa;

	public void guardar(T coisa) {
		this.coisa = coisa;
	}

	public T abrir() {
		return coisa;
	}
}
