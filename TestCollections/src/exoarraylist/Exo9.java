package exoarraylist;

import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.copy;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo9.
 */
public class Exo9 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/* Ecrire un programme Java pour copier une arraylist dans une autre. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors = new ArrayList<String>();
		List<String> colors2 = new ArrayList<String>();

		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Vert");
		colors.add("Jaune");

		colors2.add("Noir");
		colors2.add("Violet");
		colors2.add("Orange");
		colors2.add("Blanc");
		// Methode addAll qui permet de rajouter une liste à une autre
		copy(colors2, colors);
		System.out.println(colors2);

	}

}
