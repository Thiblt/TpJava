package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifFibonnaci {

	public static void main(String[] args) {
		int nb = 0;
		int[] array = { 0, 1 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quelle rang de la suite de fibonnachi voulez vous?");
		nb = scanner.nextInt();
		if (nb == 0 || nb == 1) {
			System.out.println(array[nb]);
		} else {
			array = Arrays.copyOf(array, nb+13);
			for (int i = 2; i <= nb; i++) {
				array[i] = (array[i - 1] + array[i - 2]);
			}
			System.out.println("voici le résultat: " + array[nb]);
		}

	}

}
