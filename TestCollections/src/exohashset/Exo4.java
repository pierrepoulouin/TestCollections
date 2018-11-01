package exohashset;

import java.util.HashSet;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo4.
 */
public class Exo4 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	// Ecrire un programme Java pour vider un HashSet.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> fruits = new HashSet<String>();

		fruits.add("Orange");
		fruits.add("Pomme");
		fruits.add("Poire");
		fruits.add("Banane");
		
		System.out.println("Liste avant la methode clear :");
		System.out.println(fruits);
		// Similar to removeAll()
		fruits.clear();
		System.out.println("Liste après la methode clear : ");
		
		System.out.println(fruits);
	}

}
