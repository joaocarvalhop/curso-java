package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumNegativoException extends Exception {

	private String nomeDoAtributo;

	public NumNegativoException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}

	public String getMessage() {
		return String.format("O atributo '%s' está negativo.", nomeDoAtributo);
	}
}
