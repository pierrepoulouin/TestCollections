package exotreeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo11.
 */
public class Exo11 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
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

	        System.out.println("Nombre le plus proche inférieur ou égal à 4 : " + liste.floor(4)); 
	        System.out.println("Nombre le plus proche supérieur ou égal à 3 : " + liste.ceiling(3));
	        
	}
	}


