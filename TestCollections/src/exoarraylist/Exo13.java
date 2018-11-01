package exoarraylist;

import java.util.ArrayList;
import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The Class Exo13.
 */
public class Exo13 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/* 13. Ecrire un programme Java pour comparer deux arraylists. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors = new ArrayList<String>();
		List<String> colors2 = new ArrayList<String>();

		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Vert");
		colors.add("Jaune");

		System.out.println("Première liste : ");
		for (String o : colors) {
			System.out.print(o + " ");
		}
		colors2.add("Noir");
		colors2.add("Violet");
		colors2.add("Vert");

		System.out.println("\nSeconde liste : ");
		for (String o : colors2) {
			System.out.print(o + " ");
		}

		List<String> colors3 = new ArrayList<String>();
		for (String o : colors) {
			if (colors2.contains(o))
				colors3.add("1");
			else
				colors3.add("0");
		}
		System.out.println(colors3);
	}

}
