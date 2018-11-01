package exo;

import java.util.ArrayList;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class ExerciceArrayList.
 */
public class ExerciceArrayList {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nb = new ArrayList<Integer>();
		ArrayList<Integer> moyenneSup = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer 20 valeurs numériques :");
		
		
		while(nb.size() < 20) {
			int inputNumber = sc.nextInt();
			System.out.println("Vous avez entré le nombre " + inputNumber);
			nb.add(inputNumber);
			if(inputNumber > 10) {
				moyenneSup.add(inputNumber);
			}
		}
		System.out.println("Il y a " + moyenneSup.size() + " notes au dessus de la moyenne");

	}
}
