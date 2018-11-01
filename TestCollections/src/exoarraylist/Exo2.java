package exoarraylist;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo2.
 */
public class Exo2 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Ecrire un programme Java pour parcourir tous les éléments d&#39;une
		 * arraylist.
		 */
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Vert");
		colors.add("Jaune");
		for(int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}
	}

}
