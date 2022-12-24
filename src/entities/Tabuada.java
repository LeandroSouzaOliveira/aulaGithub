package entities;

public class Tabuada {

	public static void calculaTabuada(int N) {
		
		for (int i = 1; i <= 10; i++) {
			int result = N * i;
			System.out.println(N + " X " + i + " = " + result);
		}
	}
}
