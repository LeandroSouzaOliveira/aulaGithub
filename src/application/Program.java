package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Tabuada;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp = 's';
		
		do {
			System.out.print("Para qual número você deseja a tabuada? ");
			int N = sc.nextInt();
			Tabuada.calculaTabuada(N);
			System.out.println("-------------------------------");
			System.out.print("Precisa de outra tabuada (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		
		sc.close();
	}

}
