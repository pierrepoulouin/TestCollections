package exotreeset;

import java.util.TreeSet;

public class Exo15 {
	/*
	 * 16. Ecrire un programme Java pour s upprimer un élément donné d’un TreeSet.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> nb = new TreeSet<Integer>();
		nb.add(3);
		nb.add(1);
		nb.add(6);
		nb.add(7);
		
		System.out.println(nb);
		
		nb.remove(6);
		
		System.out.println(nb);
	}

}
