package exoarraylist;

import java.util.ArrayList;
import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The Class Exo12.
 */
public class Exo12 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/* 12. Ecrire un programme Java pour extraire une partie d&#39;une arraylist. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors = new ArrayList<String>();
		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Vert");
		colors.add("Jaune");
		
		System.out.println(colors.subList(1, 3));
		
	}

}
