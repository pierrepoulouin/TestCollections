package exoarraylist;

import java.util.ArrayList;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo4.
 */
public class Exo4 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/*
	 * Ecrire un programme Java pour extraire un élément (à un index spécifié) d'une
	 * arraylist donnée.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Vert");
		colors.add("Jaune");
		
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Veuillez saisir l'index du tableau que vous voulez extraire : ");
	int index = sc.nextInt();
	System.out.println(colors.get(index));

	}

}
