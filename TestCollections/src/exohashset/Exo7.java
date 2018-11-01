package exohashset;

import java.util.HashSet;

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
	// Ecrire un programme Java pour convertir un HashSet en un tableau.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> fruits = new HashSet<String>();

		fruits.add("Orange");
		fruits.add("Pomme");
		fruits.add("Poire");
		fruits.add("Banane");
		System.out.println(fruits);
		String[] tab = new String[fruits.size()];
		fruits.toArray(tab);
		// ForEach est plus rapide que le for
		for (String e : tab) {
			System.out.print(e + " ");
		}

	}

}
