package exoarraylist;

import java.util.ArrayList;
import java.util.List;

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
	/*
	 * Ecrire un programme Java pour supprimer le troisième élément d&#39;une
	 * arraylist.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<String> colors = new ArrayList<String>();
	colors.add("Rouge");
	colors.add("Bleu");
	colors.add("Vert");
	colors.add("Jaune");
	
	colors.remove(2);
	
	System.out.println(colors);

}
}
