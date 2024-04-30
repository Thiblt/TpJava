package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		int[] array = {1, 2, 56, 6};
		boolean result= array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6);
		System.out.println(result);
	}

}
