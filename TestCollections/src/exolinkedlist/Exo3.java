package exolinkedlist;

import java.util.LinkedList;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo3.
 */
public class Exo3 {
	// Ecrire un programme Java pour parcourir tous les �l�ments d'une LinkedList en
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	// commen�ant � la position sp�cifi�e.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> colors = new LinkedList<String>();
		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Jaune");

		for (int i = 2; i < colors.size(); i++)
			System.out.println(colors.get(i));
	}

}
