package exemples;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Exemple3.
 */
public class Exemple3 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			ArrayList al = new ArrayList();

			al.add("Hello");

			al.add(4);

			al.add(12.20f);

			al.add("Hi");

			for(int i = 0; i < al.size(); i++) {

			System.out.println("donnée à l'indice " + i + " = " + al.get(i));
			}
	}

}
