package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		int[] array = {1, 2, 56, 6};
		boolean result= array.length >= 1 && (array[0] == array[array.length - 1]);
		System.out.println(result);

	}

}
