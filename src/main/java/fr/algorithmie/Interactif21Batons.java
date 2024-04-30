package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {
		int nb = 0;
		int baton = 21;
		boolean first = false;
		boolean winner = false;
		Scanner scanner = new Scanner(System.in);
		String batonsVisuel = "|||||||||||||||||||||";
		System.out.println(
				"Ceci est le jeu des batons, tour a tour avec l'ordinateur vous pouvez enlever de 1 à 3 batons");
		System.out.println("Celui qui ramasse le dernier baton à perdu");
		System.out.println("Voila le départ: \n" + batonsVisuel);

		if (Math.random() < 0.5) {
			System.out.println("L'ordinateur commence");
			first = true;
		} else {
			System.out.println("Tu commences");
		}

		while (baton > 0) {
			if (!first) {
				System.out.println("Voila le jeu: \n" + batonsVisuel+"\n"+baton+"baton(s)");
				System.out.println("Combien de baton prends-tu?");
				nb = scanner.nextInt();
				while (nb<1 || nb>3) {
					System.out.println("Tu dois en prendre 1 à 3 seulement");
					nb = scanner.nextInt();
				}
				if (nb >= baton) {
					winner = false;
					baton = 0;
				} else {
					baton -= nb;
					batonsVisuel=batonsVisuel.substring(0, batonsVisuel.length() - nb);
				}

			}
			if (baton == 0) {
			} else if (baton == 1) {
				System.out.println("Voila le jeu: \n" + batonsVisuel+"\n"+baton+"baton(s)");
				int rand = 1;
				System.out.println("l'ordinateur a pris " + rand + " baton(s)");
				baton -= rand;
				batonsVisuel=batonsVisuel.substring(0, batonsVisuel.length() - rand);
				winner = true;
			} else if (baton == 2 || baton == 3 || baton == 4) {
				System.out.println("Voila le jeu: \n" + batonsVisuel+"\n"+baton+"baton(s)");
				int rand = baton - 1;
				System.out.println("l'ordinateur a pris " + rand + " baton(s)");
				baton -= rand;
				batonsVisuel=batonsVisuel.substring(0, batonsVisuel.length() - rand);

			}

			else if (baton>4){
				System.out.println("Voila le jeu: \n" + batonsVisuel+"\n"+baton+"baton(s)");
				int rand = (int) (Math.random() * 2) + 1;
				System.out.println("l'ordinateur a pris " + rand + " baton(s)");
				baton -= rand;
				batonsVisuel=batonsVisuel.substring(0, batonsVisuel.length() - rand);
				first = false;
			}

		}
		if (winner == true) {
			System.out.println("Vous avez gagné!");
		} else {
			System.out.println("Vous avez perdu... Peut-être une prochaine fois!");
		}

	}

}
