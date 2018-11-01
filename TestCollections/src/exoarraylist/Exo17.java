package exoarraylist;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo17.
 */
public class Exo17 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/* Ecrire un programme Java pour vider une arraylist. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Vert");
		colors.add("Jaune");
		System.out.println(colors);
		colors.clear();
		System.out.println("Liste après delete :" + colors);
	}

}
