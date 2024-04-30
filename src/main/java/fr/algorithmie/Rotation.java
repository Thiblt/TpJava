package fr.algorithmie;

import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] arrayCopy =Arrays.copyOf(array, array.length);
		
		
		System.out.println("Rotation:");
		for (int i = 0; i<array.length; i++) {
			if (i==array.length-1) {arrayCopy[0]=array[i];}
			else {arrayCopy[i+1]=array[i];}
			
		}
		
		
		
		System.out.println(Arrays.toString(arrayCopy));

	}

}
