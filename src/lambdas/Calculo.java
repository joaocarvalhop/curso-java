package lambdas;

// Só pode ter um único método 
@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);
	
}
