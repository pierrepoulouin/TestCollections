package exotreeset;

import java.util.TreeSet;

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
// Ecrire un programme Java pour ajouter tous les éléments d'un TreeSet spécifié à un autre
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> colors = new TreeSet<String>();
		TreeSet<String> colors2 = new TreeSet<String>();
		colors.add("Orange");
		colors.add("Rouge");
		colors.add("Jaune");
		
		colors2.addAll(colors);
		
		System.out.println(colors2);
	}

}
