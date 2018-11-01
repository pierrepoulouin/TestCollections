package exemples;
import java.util.LinkedList;

import java.util.List;

import java.util.ListIterator;

// TODO: Auto-generated Javadoc
/**
 * The Class Exemple1.
 */
public class Exemple1 {

/**
 * The main method.
 *
 * @param args the arguments
 */
public static void main(String[] args) {

List l = new LinkedList();

l.add(12);

l.add("toto ! !");

l.add(12.20f);

for(int i = 0; i < l.size(); i++)

System.out.println("Élément à l'index " + i + " = " + l.get(i));

}

}
