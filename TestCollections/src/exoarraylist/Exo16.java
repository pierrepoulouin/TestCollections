package exoarraylist;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo16.
 */
public class Exo16 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/* Ecrire un programme Java pour cloner une arraylist en une autre liste. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Vert");
		colors.add("Jaune");
		System.out.println(colors);
		//Clonage de la première liste
		ArrayList<String> colors2 = (ArrayList<String>)colors.clone();
		
		System.out.println("Deuxième liste :");
		System.out.println(colors2);
	}
	
}
