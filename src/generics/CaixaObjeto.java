package generics;

// sem o generics
public class CaixaObjeto {

	// Object � o tipo mais generico de java
	private Object coisa;
	
	public void guardar(Object coisa) {
		this.coisa = coisa;
	}
	
	public Object abrir() {
		return coisa;
	}
}
