package exoarraylist;

import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.swap;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo11.
 */
public class Exo11 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/* Ecrire un programme Java pour inverser des éléments dans une arraylist. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors = new ArrayList<String>();
		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Vert");
		colors.add("Jaune");
		
		System.out.println(colors);
		//swap permet de permutter deux valeurs
		swap(colors, 1, 3);
		
		System.out.println(colors);
		
	}

}
