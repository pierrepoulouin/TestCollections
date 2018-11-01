package exohashset;

import java.util.HashSet;
import java.util.Iterator;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo9.
 */
public class Exo9 {
// crire un programme Java pour comparer deux HashSets.
	
		/**
 * Compare.
 *
 * @param element the element
 * @param set the set
 * @param conteneur the conteneur
 */
// TODO Auto-generated method stub
		public static void compare(String element, HashSet<String> set, HashSet<String> conteneur){
	        if (set.contains(element)){
	            conteneur.add(element);
	            System.out.println("L'élément " + element + " appartient aux deux listes");
	        }
	    }
	    
	    /**
    	 * The main method.
    	 *
    	 * @param args the arguments
    	 */
    	public static void main(String[] args) {

	        HashSet<String> liste = new HashSet<>();
	        HashSet<String> liste2 = new HashSet<>();
	        HashSet<String> liste3 = new HashSet<>();

	        liste.add("rouge");
	        liste.add("bleu");
	        liste.add("jaune");
	        
	        liste2.add("vert");
	        liste2.add("bleu");
	        liste2.add("jaune");

	        Iterator<String> iterateur = liste.iterator();
	        
	        System.out.println("Elements en commun :");
	        
	        while (iterateur.hasNext()) {
	            compare(iterateur.next(), liste2, liste3);
	        }
	        
	        System.out.println("Liste 3 contenant les éléments identiques");
	        
	        Iterator<String> iterateur3 = liste3.iterator();
	        
	        while (iterateur3.hasNext()) {
	            System.out.println(iterateur3.next());
	        }

	}

}
