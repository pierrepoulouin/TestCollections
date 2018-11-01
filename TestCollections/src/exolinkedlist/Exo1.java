package exolinkedlist;

import java.util.LinkedList;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo1.
 */
public class Exo1 {

/**
 * The main method.
 *
 * @param args the arguments
 */
//  Ecrire un programme Java pour ajouter l'élément spécifié à la fin d'une LinkedList.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> colors = new LinkedList<String>();
		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Jaune");
		
		System.out.println(colors);
		colors.addLast("Vert");
		System.out.println(colors);
		
	}

}
