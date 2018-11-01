package exohashset;

import java.util.HashSet;

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
	/* Ecrire un programme Java pour obtenir le nombre d'éléments d'un HashSet. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> fruits = new HashSet<String>();

		fruits.add("Orange");
		fruits.add("Pomme");
		fruits.add("Poire");
		fruits.add("Banane");
		
		// La méthode size donne la taille d'un HashSet
		System.out.println("La taille de la liste fruits est de : " + fruits.size());
	}

}
