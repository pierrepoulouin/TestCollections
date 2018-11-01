package exohashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo8.
 */
public class Exo8 {

/**
 * The main method.
 *
 * @param args the arguments
 */
//Ecrire un programme Java pour convertir un HashSet défini en ArrayList.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> fruits = new HashSet<String>();

		fruits.add("Orange");
		fruits.add("Pomme");
		fruits.add("Poire");
		fruits.add("Banane");
		// Je met en argument de l'ArrayList mon HashSet pour le convertir
		ArrayList<String> arrayHset = new ArrayList<String>(fruits);
		System.out.println(fruits);
		
	}

}
