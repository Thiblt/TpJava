package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		
		System.out.println("Nombres entre 0 et 10:");
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("Nombres pairs entre 0 et 10:");
		for (int i=0; i<=10; i++) {
			if(i%2==0) {System.out.println(i);}
			
		}
		
		System.out.println("Nombres impairs entre 0 et 9:");
		for (int i=0; i<10; i++) {
			if(i%2!=0) {System.out.println(i);}
			
		}
		System.out.println("Nombres entre 0 et 10:");
		int i = 0;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("Nombres pairs entre 0 et 10:");
		int x = 0;
		while (x<=10) {
			if(x%2==0) {System.out.println(x);}
			x++;
			
		}
		int y = 0;
		System.out.println("Nombres impairs entre 0 et 9:");
		while (y<10) {
			if(y%2!=0) {System.out.println(y);}
			y++;
			
		}

	}

}
