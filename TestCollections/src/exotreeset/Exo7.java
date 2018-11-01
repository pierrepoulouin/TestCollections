package exotreeset;

import java.util.TreeSet;

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
/* Ecrire un programme Java pour obtenir le nombre d'éléments d'un TreeSet. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> colors = new TreeSet<String>();
		colors.add("Orange");
		colors.add("Rouge");
		colors.add("Jaune");
		
		System.out.println("Il y a dans ma liste " + colors.size() + " éléments");
	}

}
