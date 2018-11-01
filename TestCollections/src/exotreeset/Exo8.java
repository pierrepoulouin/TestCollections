package exotreeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo8.
 */
public class Exo8 {
	
	/**
	 * Compare.
	 *
	 * @param element the element
	 * @param set the set
	 */
	/* Ecrire un programme Java pour comparer deux TreeSets. */
	public static void compare(String element, TreeSet set) {
		if (set.contains(element)) {
			System.out.println("L'élément " + element + " appartient aux deux listes.");
		}
		else 
			System.out.println("Ah bah là non");
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		HashSet<String> chaine = new HashSet<>();
		HashSet<String> chaine2 = new HashSet<>();

		chaine.add("rouge");
		chaine.add("bleu");
		chaine.add("jaune");

		chaine2.add("vert");
		chaine2.add("bleu");
		chaine2.add("jaune");

		TreeSet liste = new TreeSet(chaine);
		TreeSet liste2 = new TreeSet(chaine2);

		Iterator<String> iterateur = liste.iterator();

		System.out.println("Elements en commun :");

		while (iterateur.hasNext()) {
			compare(iterateur.next(), liste2);
		}

	}
}
