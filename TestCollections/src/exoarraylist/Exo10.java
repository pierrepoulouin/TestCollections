package exoarraylist;

import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.shuffle;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo10.
 */
public class Exo10 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/*
	 * 10. Ecrire un programme Java pour mélanger les éléments dans une arraylist.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors = new ArrayList<String>();
		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Vert");
		colors.add("Jaune");
		
		shuffle(colors);
		System.out.println(colors);
	}

}
