package ijp.ch21;

import java.util.HashSet;
import java.util.Set;

/**
 * Chapter 21 Sets and Maps
 * HashSet: Eliminate automatically duplicates. But has no control on the ordering of the elements
 * 2015-04-04 - tri
 */
public class HashsetDemo {
	public static void main(String[] args) {
		Set<String> hset = new HashSet<String>(); //JDK8: HashSet<>()

		hset.add("London");
		hset.add("Paris");
		hset.add("PaRiS");
		hset.add("New York");
		hset.add("Frankfurt");
		hset.add("Beijing");
		hset.add("Paris"); // Duplicated: will be ignored, no runtime error
		hset.add("New York"); // Duplicated: will be ignored, no runtime error

		//NOTE1: order of elements are NOT the input order
		//       There is no way to influence the order in HashSet. Must use LinkedHashSet instead
		//NOTE2: duplicated elements are discarded
		//System.out.println(hset); // [New York, Paris, Beijing, PaRiS, Frankfurt, London]
		System.out.printf("hset: %s (%d elems)\n", hset, hset.size()); // hset: [New York, Paris, Beijing, PaRiS, Frankfurt, London] (6 elems)

		// elements in a set are iterable.
		// BC Set implements Collection interface which extends the Iterable interface,
		for (String city : hset) {
			System.out.print(city.toUpperCase() + ", "); // NEW YORK, PARIS, BEIJING, PARIS, FRANKFURT, LONDON,
		}
		System.out.println();
	}
}
