package exotreeset;

import java.util.TreeSet;

public class Exo12 {
	/*
	 * Ecrire un programme Java pour obtenir l��l�ment dans un TreeSet strictement
	 * sup�rieur ou �gal � l��l�ment donn�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> nb = new TreeSet<Integer>();
		nb.add(3);
		nb.add(1);
		nb.add(6);
		nb.add(7);
		
		System.out.println(nb);
		
		System.out.println("Le chiffre le plus proche de 5 est " + nb.ceiling(5));
	}

}
