package colecoes2;

public class ArrayAndForeach {

	public static void main(String[] args) {

		// duas formas de criar um array
		// forma literal
		double[] notasJoao = { 7.0, 8.7, 6.2, 4.9, 9.7 };

		// e por indexação
		double[] notasPedro = new double[5];
		notasPedro[0] = 7.0;
		notasPedro[1] = 8.5;
		notasPedro[2] = 9.0;
		notasPedro[3] = 7.5;
		notasPedro[4] = 4.0;

		double totalJoao = 0;
		// foreach ---> vc usa ele quando vc quiser percorrer uma lista partindo do começo
		// dela e terminando no final, que é o que acontece na maioria das vezes.
		for (double notasJ : notasJoao) {
			totalJoao += notasJ;
		}
		// for (int i = 0; i < notasJoao.length; i++) {
		// totalJoao += notasJoao[i];
		// }

		double totalPedro = 0;
		for (double notasP : notasPedro) {
			totalJoao += notasP;
		}
		// for (int i = 0; i < notasPedro.length; i++) {
		// totalPedro += notasPedro[i];
		// }

		System.out.println(totalJoao / notasJoao.length);
		System.out.println(totalPedro / notasPedro.length);
	}
}
