package exolinkedlist;


import java.util.LinkedList;
import java.util.ListIterator;


// TODO: Auto-generated Javadoc
/**
 * The Class Exo4.
 */
public class Exo4 {

/**
 * The main method.
 *
 * @param args the arguments
 */
// Ecrire un programme Java pour itérer une LinkedList dans l'ordre inverse.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> colors = new LinkedList<String>();
		colors.add("Rouge");
		colors.add("Bleu");
		colors.add("Jaune");
		
		ListIterator<String> it = colors.listIterator(colors.size());
		while(it.hasPrevious())
			System.out.println(it.previous());
	}

}
