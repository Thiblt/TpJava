package fr.declaration.tableau;

public class ExerciceTableauChaine {

	public static void main(String[] args) {
		String[] tableau = {"Nantes", "Montpellier", "Angers", "Nimes", "Paris"};
		System.out.println(tableau[0] +" "+ tableau[1]+" "+ tableau[2]+" "+ tableau[3]+" "+ tableau[4]);
		System.out.println(tableau.length);
		tableau[3]= "Reims";
		System.out.println(tableau[0] +" "+ tableau[1]+" "+ tableau[2]+" "+ tableau[3]+" "+ tableau[4]);
		// TODO Auto-generated method stub

	}

}
