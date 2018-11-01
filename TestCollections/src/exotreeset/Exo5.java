package exotreeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

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
	 * 5. Ecrire un programme Java pour obtenir les premier et dernier éléments d'un
	 * TreeSet
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> chaine = new HashSet<>();

        chaine.add("rouge");
        chaine.add("bleu");
        chaine.add("jaune");
    
        TreeSet liste = new TreeSet(chaine);
        
        System.out.println(liste);
        
        
        
        System.out.println(liste.first());
        System.out.println(liste.last());
	}

}
