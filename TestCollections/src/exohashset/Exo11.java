package exohashset;

import java.util.HashSet;

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
		HashSet<String> fruits = new HashSet<String>();

		fruits.add("Orange");
		fruits.add("Pomme");
		fruits.add("Poire");
		fruits.add("Banane");
		
		System.out.println(fruits);
		
		fruits.clear();
		
		System.out.println(fruits);
		
	}

}
