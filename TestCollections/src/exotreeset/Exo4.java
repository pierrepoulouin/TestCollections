package exotreeset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.SortedSet;
import java.util.TreeSet;

// TODO: Auto-generated Javadoc
/**
 * The Class Exo4.
 */
public class Exo4  {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	/*
	 * Ecrire un programme Java pour créer une vue inverse des éléments contenus
	 * dans un TreeSet donné.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> chaine = new HashSet<>();

        chaine.add("rouge");
        chaine.add("bleu");
        chaine.add("jaune");
    
        TreeSet liste = new TreeSet(chaine);
        
        System.out.println(liste);        
        
        System.out.println(liste.descendingSet());
        
        Iterator<String> iterateur = liste.iterator();
        
        System.out.println("Liste");
        
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        Iterator<String> iterateur2 = liste.descendingIterator();
        
        System.out.println("Liste");
        
        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
}
	}

}
