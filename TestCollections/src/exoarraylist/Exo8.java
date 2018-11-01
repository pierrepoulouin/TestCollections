package exoarraylist;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.sort;
import static java.util.Collections.reverse;
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
	/* Ecrire un programme Java pour trier une arraylist donnée. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors = new ArrayList<String>();
		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Vert");
		colors.add("Jaune");
		
		//Trier par ordre croissant
		sort(colors);
		System.out.println(colors);
		//la liste à l'envers
		reverse(colors);
		System.out.println(colors);
		//tier par ordre décroissant
		sort(colors, Collections.reverseOrder());
		System.out.println(colors);
	}

}
