package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
	public static void main(String[] args) {
		int nb = 0;
		int somme =0;

		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Inserez un nombre");
			nb = scanner.nextInt();
			
		for (int i = 1; i <= nb; i++) {
			somme+=i;
			
		}
		System.out.println(somme);
	}

}
