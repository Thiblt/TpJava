package fr.algorithmie;
import java.util.Arrays;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		 int[] arrayCopy = new int [array.length];
		 for (int i = 0; i < arrayCopy.length; i++) {
	            arrayCopy[i]=array[array.length-1-i];
	            }
		 System.out.println("Tableau 1: \n"+ Arrays.toString(arrayCopy)+"\nTableau 2: \n" + Arrays.toString(array));

	}

}
