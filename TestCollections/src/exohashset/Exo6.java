package exohashset;

import java.util.HashSet;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo6.
 */
public class Exo6 {

/**
 * The main method.
 *
 * @param args the arguments
 */
// Ecrire un programme Java pour cloner un HashSet en un autre.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> fruits = new HashSet<String>();

		fruits.add("Orange");
		fruits.add("Pomme");
		fruits.add("Poire");
		fruits.add("Banane");
		
		HashSet<String> fruits2 = (HashSet<String>) fruits.clone();
		
		System.out.println(fruits2);
	}

}
