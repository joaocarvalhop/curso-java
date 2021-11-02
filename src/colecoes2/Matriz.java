package colecoes2;

public class Matriz {

	public static void main(String[] args) {
		
		double[][] notasJoao = { {7.7, 8.6}, {6.2, 9.7}};
		
		double[][] notasPedro = new double[2][];
		notasPedro[0] = new double[2]; 
		notasPedro[1] = new double[2]; 
		notasPedro[0][0] = 7.7; 
		notasPedro[0][1] = 8.6; 
		notasPedro[1][0] = 6.2; 
		notasPedro[1][1] = 9.7; 
		
		// com o la�o for
		double totalJoao = 0;
		int qntNotasJoao = 0;
		for (int i = 0; i < notasJoao.length; i++) {
			for (int j = 0; j < notasJoao[i].length; j++) {
				totalJoao += notasJoao[i][j];
				qntNotasJoao++;
			}
		}
		
		// com foreach
		double totalPedro = 0;
		int qntNotasPedro = 0;
		for (double[] notasParciais : notasPedro) {
			for (double notas : notasParciais) {
				totalPedro += notas;
				qntNotasPedro++;
			}
		}
		
		System.out.println(totalJoao / qntNotasJoao);
		System.out.println(totalPedro / qntNotasPedro);
	}
}
