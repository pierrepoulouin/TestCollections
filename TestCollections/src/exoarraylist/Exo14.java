package exoarraylist;

import static java.util.Collections.swap;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo14.
 */
public class Exo14 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/*
	 * 14. Ecrire un programme Java d&#39;échange de deux éléments dans une
	 * arraylist.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors = new ArrayList<String>();
		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Vert");
		colors.add("Jaune");
		
		System.out.println(colors);
		//swap permet de permutter deux valeurs
		swap(colors, 1, 3);
		
		System.out.println(colors);
	}

}
