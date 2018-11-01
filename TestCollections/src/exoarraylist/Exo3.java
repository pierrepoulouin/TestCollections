package exoarraylist;

import java.util.ArrayList;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo3.
 */
public class Exo3 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Ecrire un programme Java pour insérer un élément dans l’ arraylist à la première position. */
		ArrayList<String> colors = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		boolean c = false;
		while(c == false) {
		System.out.println("Veuillez saisir une couleur: ");
		String line = sc.nextLine();
		colors.add(0, line);
		
		System.out.println(colors);
		}
	}

}
