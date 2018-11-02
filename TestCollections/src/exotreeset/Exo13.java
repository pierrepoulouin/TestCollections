package exotreeset;

import java.util.TreeSet;

public class Exo13 {
	/*
	 * Ecrire un programme Java pour obtenir un élément dans un TreeSet strictement
	 * inférieur à l’élément donné.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> nb = new TreeSet<Integer>();
		nb.add(3);
		nb.add(1);
		nb.add(6);
		nb.add(7);
		
		System.out.println(nb);
		//La methode lower permet de chercher un élement strictement inférieur.
		System.out.println(nb.lower(6));
	}

}
