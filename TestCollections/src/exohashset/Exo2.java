package exohashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo2.
 */
public class Exo2 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/* . Ecrire un programme Java pour parcourir tous les éléments d'un HashSet. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> fruits = new HashSet<String>();

		fruits.add("Orange");
		fruits.add("Pomme");
		fruits.add("Poire");
		fruits.add("Banane");
		
		// ListIterator pour les listes et ici on utilise Iterator car HashSet n'est pas une liste.
		Iterator<String> it = fruits.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		

	}

}
