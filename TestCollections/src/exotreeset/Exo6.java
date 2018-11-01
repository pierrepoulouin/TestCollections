package exotreeset;

import java.util.TreeSet;

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
/*  Ecrire un programme Java pour cloner un TreeSet en un autre. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> colors = new TreeSet<String>();
		colors.add("Orange");
		colors.add("Rouge");
		colors.add("Jaune");
		
		TreeSet<String> colors2 = (TreeSet<String>) colors.clone();
		
		System.out.println(colors2);
	}

}
