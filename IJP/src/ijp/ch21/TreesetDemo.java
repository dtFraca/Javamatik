package ijp.ch21;

import java.util.*;

/**
 * Chapter 21 Sets and Maps
 * TreeSet improves LinkedHashset with
 * - Sort inputs through their Comparable interface if avail
 * - Add navigation
 * - Add peek() (to get + remove element) like for Queue/Stack
 *
 * 2015-04-04 - tri
 */
public class TreesetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("London");
		set.add("Lyon");
		set.add("Berlin");
		set.add("Neuschwanstein");
		set.add("Stockholm");
		set.add("Vienna");
		set.add("Copenhagen");
		set.add("Amsterdam");
		set.add("Luxembourg");

		TreeSet<String> treeSet = new TreeSet<String>(set);

		// [Amsterdam, Berlin, Copenhagen, London, Luxembourg, Lyon, Neuschwanstein, Stockholm, Vienna]
		System.out.println("Sorted tree set: " + treeSet);

		// Use the methods in SortedSet interface
		System.out.println("first(): " + treeSet.first()); // Amsterdam
		System.out.println("last() : " + treeSet.last());  // Vienna

		// [Amsterdam, Berlin, Copenhagen, London]
		System.out.println("headSet(\"Luxembourg\"): " + treeSet.headSet("Luxembourg"));

		// [Luxembourg, Lyon, Neuschwanstein, Stockholm, Vienna]
		System.out.println("tailSet(\"Luxembourg\"): " + treeSet.tailSet("Luxembourg"));

		// Use the methods in NavigableSet interface
		System.out.println("lower(\"L\")..: " + treeSet.lower("L"));   // Copenhagen
		System.out.println("higher(\"L\").: " + treeSet.higher("L"));  // London
		System.out.println("floor(\"L\")..: " + treeSet.floor("L"));   // Copenhagen
		System.out.println("ceiling(\"L\"): " + treeSet.ceiling("L")); // London
		System.out.println("pollFirst().: " + treeSet.pollFirst());    // Amsterdam
		System.out.println("pollLast()..: " + treeSet.pollLast());     // Vienna

		// poll() has removed the elements from the tree
		// [Berlin, Copenhagen, London, Luxembourg, Lyon, Neuschwanstein, Stockholm]
		System.out.println("New tree set: " + treeSet);

		TreeSet<String> tsetReverse = new TreeSet<String>(Collections.reverseOrder());
		tsetReverse.addAll(Arrays.asList("Edinburgh", "Cardiff", "Dublin", "London"));

		//[London, Edinburgh, Dublin, Cardiff]
		System.out.printf("Treeset, reverse order (UK): %s\n", tsetReverse);

		tsetReverse.clear();
		tsetReverse.addAll(Arrays.asList("Besançon", "Saint-Lô", "Évreux", "Ännecy", "Périgueux", "Charleville-Mézières"));
		// [Évreux, Saint-Lô, Périgueux, Charleville-Mézières, Besançon]
		System.out.printf("Treeset, reverse order (FR): %s\n", tsetReverse);
	}
}
