package exoarraylist;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo5.
 */
public class Exo5 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/*
	 * Ecrire un programme Java pour mettre à jour un élément spécifique par élément
	 * donné.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors = new ArrayList<String>();
		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Vert");
		colors.add("Jaune");
		
		colors.set(1, "Noir");
		
		System.out.println(colors);
		
		
	}

}
