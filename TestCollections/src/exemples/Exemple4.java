package exemples;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

// TODO: Auto-generated Javadoc
// @run; ArraysAndLists

/**
 * The Class Exemple4.
 */
public class Exemple4

{

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args)

	{

		List<String> list = Arrays.asList(args);

		// list.add("foobar"); // will throw an exception since the list is backed by
		// the array (the size of the list is not modifiable)

		list.set(0, "foobar"); // will works if the args array has at least one element, the list is mutable

		List<Integer> list2 = new ArrayList<>();

		list2.add(0);

		list2.add(1);

		list2.add(2);

		list2.add(4);

		// convert to an array of Objects

		Object[] elements = list2.toArray();

		// convert to a typed array (it is required to instantiate an array since the
		// toArray method cannot instantiate a "generically" typed array

		Integer[] typedElements = list2.toArray(new Integer[elements.length]);

		System.out.println("elements=" + elements + "," + Arrays.toString(elements));

		System.out.println("typedElements=" + typedElements + "," + Arrays.toString(elements));
	}
}