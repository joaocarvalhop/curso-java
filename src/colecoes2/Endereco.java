package colecoes2;

public class Endereco {

		// Exemplo de HashCode e Equals
		
		String rua;
		int numero;
		String complemento;
		
		Endereco(String rua, int numero, String complemento) {
			this.rua = rua;
			this.numero = numero;
			this.complemento = complemento;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
			result = prime * result + numero;
			result = prime * result + ((rua == null) ? 0 : rua.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Endereco other = (Endereco) obj;
			if (complemento == null) {
				if (other.complemento != null)
					return false;
			} else if (!complemento.equals(other.complemento))
				return false;
			if (numero != other.numero)
				return false;
			if (rua == null) {
				if (other.rua != null)
					return false;
			} else if (!rua.equals(other.rua))
				return false;
			return true;
		}
}