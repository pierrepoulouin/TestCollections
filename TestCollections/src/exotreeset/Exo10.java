package exotreeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo10.
 */
public class Exo10 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/*
	 * Ecrire un programme Java pour obtenir l’élément dans un TreeSet supérieur ou
	 * égal à l’élément donné.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> chaine = new HashSet<>();

		chaine.add(1);
		chaine.add(3);
		chaine.add(7);
		chaine.add(10);

		TreeSet liste = new TreeSet(chaine);

		System.out.println("Liste de nombres");

		Iterator<Integer> iterateur = liste.iterator();

		while (iterateur.hasNext()) {
			System.out.println(iterateur.next());
		}

		System.out.println("Nombre le plus proche strictement supérieur à 4 : " + liste.higher(4));
		System.out.println("Nombre le plus proche strictement supérieur à 3 : " + liste.higher(3));
		System.out.println("Nombre le plus proche strictement supérieur à 3 : " + liste.higher(10));

	}
}
