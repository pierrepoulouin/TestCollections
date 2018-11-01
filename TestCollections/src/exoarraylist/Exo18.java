package exoarraylist;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo18.
 */
public class Exo18 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/* Ecrire un programme Java pour tester une arraylist est vide ou non. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList<String>();
		ArrayList<String> colors2 = new ArrayList<String>();
		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Vert");
		colors.add("Jaune");

		if (colors.size() > 0)
			System.out.println("La liste 1 existe");
		else
			System.out.println("La liste 1 n'existe pas");

		if (colors2.size() > 0)
			System.out.println("La liste 1 existe");
		else
			System.out.println("La liste 1 n'existe pas");

		System.out.println("La liste1 est vide ? " +colors.isEmpty());
		System.out.println("La liste2 est vide ? " + colors2.isEmpty());
	}

}
