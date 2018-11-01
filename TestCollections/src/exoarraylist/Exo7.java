package exoarraylist;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo7.
 */
public class Exo7 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/* Ecrire un programme Java pour rechercher un élément dans une arraylist. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors = new ArrayList<String>();
		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Vert");
		colors.add("Jaune");

		boolean c = colors.contains(colors.get(1));

		if (c) {
			System.out.println(colors.get(1));
		}
		// Index of Pour cibler un élément avec son index
		System.out.println(colors.indexOf("Jaune"));

	}

}
