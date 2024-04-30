package fr.algorithmie;

import java.util.Scanner;


public class InteractifTantQue {

	public static void main(String[] args) {
		int nb= 0;
		// TODO Auto-generated method stub
		while(nb<1 || nb>10) {
			Scanner scanner = new Scanner(System.in) ;
			System.out.println("Inserez un nombre compris entre 1 et 10");
			 nb = scanner.nextInt() ;
		}
		System.out.println("Voici le nombre: " + nb);

	}

}
