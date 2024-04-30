package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		int nb = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserez un nombre");
		nb = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(nb + i);
		}

	}

}
