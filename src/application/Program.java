package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Para qual número você deseja a tabuada? ");
		int N = sc.nextInt();
		
		sc.close();
	}

}
