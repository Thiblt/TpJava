package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		int nb= 0;
		
		while(nb<1 || nb>10) {
			Scanner scanner = new Scanner(System.in) ;
			System.out.println("Inserez un nombre compris entre 1 et 10");
			 nb = scanner.nextInt() ;
		}
		for (int i =1; i<=10; i++) {
			System.out.println(nb+" * "+i+" = "+nb*i);
		}
		

	}

	

}
