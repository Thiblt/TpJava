package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		int nb = 0;
		int counter= 0;
		int rand= (int)(Math.random() * 100);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Essayer de trouver le nombre compris entre 1 et 100");
		nb = scanner.nextInt();
		while(nb != rand) {
			if(nb>rand) {System.out.println("Raté, c'est moins grand!");}
			else {System.out.println("Raté, c'est plus grand!");}
			
			counter +=1;
			nb = scanner.nextInt();
		}

		
			System.out.println("Bravo vous avez trouvé "+rand+" en "+counter+" coup(s)");
		

	}

}
