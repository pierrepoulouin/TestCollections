package exotreeset;

import java.util.TreeSet;

public class Exo14 {
	/*
	 * Ecrire un programme Java pour récupérer et supprimer le premier élément d'un
	 * TreeSet
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> nb = new TreeSet<Integer>();
		nb.add(3);
		nb.add(1);
		nb.add(6);
		nb.add(7);
		
		System.out.println(nb);
		//La méthode pollFirst permet de supprimer le premier élement de la liste
		nb.pollFirst();
		System.out.println(nb);
		// La méthode pollLast permet de supprimer le dernier element de la liste
		nb.pollLast();
		System.out.println(nb);
	}

}
