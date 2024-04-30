package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		int nb = 0;
		int menu= 0;
		int[] array= new int[1];
		int count=0;

		
		while (menu!=3) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1. Ajouter un nombre \n2.Afficher les nombres existants\n3."
					+ "Arreter le programme en choisissant un nombre autre que 1 ou 2");
			menu = scanner.nextInt();
			if(menu==1) {
				System.out.println("Quel nombre il faut ajouter?");
				nb = scanner.nextInt();
				if(array.length-1<count) {
					array= Arrays.copyOf(array, array.length+1);
					array[count]=nb;
					count++;
					
				}
				else {array[count]=nb;
				count++;}
			}
			else if (menu==2) {System.out.println(Arrays.toString(array));}
			else {menu=3;}
		}
		 
		
		
		}


		

	

}
