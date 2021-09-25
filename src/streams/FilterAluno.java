package streams;

public class FilterAluno {

	final String nome;
	final double nota;

	public FilterAluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public String toString() {
		return nome + " tem nota " + nota;
	}
}
