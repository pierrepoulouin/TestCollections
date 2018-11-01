package exotreeset;

import java.util.Iterator;

import java.util.TreeSet;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo2.
 */
// 2. Ecrire un programme Java pour parcourir tous les éléments d'un TreeSet.
public class Exo2 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> colors = new TreeSet<String>();
		colors.add("Orange");
		colors.add("Rouge");
		colors.add("Jaune");

		Iterator<String> it = colors.iterator();

		while (it.hasNext())
			System.out.println(it.next());
	}

}
