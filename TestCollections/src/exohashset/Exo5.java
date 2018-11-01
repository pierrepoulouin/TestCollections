package exohashset;

import java.util.HashSet;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo5.
 */
public class Exo5 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	// . Ecrire un programme Java pour tester un HashSet vide ou non
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> fruits = new HashSet<String>();

		fruits.add("Orange");
		fruits.add("Pomme");
		fruits.add("Poire");
		fruits.add("Banane");

		boolean b = fruits.isEmpty();
		System.out.println("La liste est elle vide ? " + b);
	}

}
