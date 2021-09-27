package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumNegativoException extends RuntimeException{

	private String nomeDoAtributo;
	
	public NumNegativoException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s est� negativo", nomeDoAtributo);
	}
}
