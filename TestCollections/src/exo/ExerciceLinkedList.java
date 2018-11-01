package exo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

// TODO: Auto-generated Javadoc
/**
 * The Class ExerciceLinkedList.
 */
public class ExerciceLinkedList {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//On crée un objet LinkedList. On l'appelle listeEtudiant
		List listeEtudiant = new LinkedList();
		listeEtudiant.add("Jean");
		listeEtudiant.add("Philippe");
		listeEtudiant.add("Corine");
		listeEtudiant.add("Isabelle");
		listeEtudiant.add("Charles");
		listeEtudiant.add("Paul");
		
		for(int i = 0; i < listeEtudiant.size(); i++) {
			System.out.println("Élément à l'index " + i + " = " + listeEtudiant.get(i) );
		System.out.println("La longueur de la liste est de " + listeEtudiant.size());
		}
		//Avec iterator
		ListIterator  v = listeEtudiant.listIterator();
		while(v.hasNext()) {
			System.out.println(v.next());
		}
		
	
} }
