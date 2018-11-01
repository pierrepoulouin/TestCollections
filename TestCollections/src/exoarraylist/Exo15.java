package exoarraylist;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo15.
 */
public class Exo15 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/* 15. Ecrire un programme Java pour joindre deux arraylists. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors = new ArrayList<String>();
		List<String> colors2 = new ArrayList<String>();
		
		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Vert");
		colors.add("Jaune");
		
		colors2.add("Noir");
		colors2.add("Violet");
		//Methode addAll qui permet de rajouter une liste à une autre 
		colors2.addAll(colors);
		
		
		System.out.println(colors2);
	}

}
