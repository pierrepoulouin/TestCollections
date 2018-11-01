package exoarraylist;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo19.
 */
public class Exo19 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/*
	 * Ecrire un programme Java pour imprimer tous les éléments d’une ArrayList en
	 * utilisant la position des éléments.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList<String>();
	
		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Vert");
		colors.add("Jaune");

		ListIterator li = colors.listIterator();
		while(li.hasNext())
			System.out.println(li.next());
	}

}
