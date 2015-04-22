package ijp.ch21;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Chapter 21 Sets and Maps
 * LinkedHashSet extends HashSet with a linked-list implementation that supports an order-
 * ing of the elements in the set.
 * The elements in a HashSet are not ordered (we have no control on how elements are sorted),
 * In a LinkedHashSet elements are ordered by the sequence in which they were inserted into the set.
 * 2015-04-04 - tri
 */
public class LinkedHashsetDemo {
	public static void main(String[] args) {
		Set<String> lhset = new LinkedHashSet<String>(); // JDK8: LinkedHashSet<>()

		lhset.add("Copenhagen");
		lhset.add("CoPeNhAgEN");
		lhset.add("Bruxelles");

		lhset.addAll(Arrays.asList("Munich", "Strasbourg", "Edinburgh", "DUBLIN", "Bruxelles", "Copenhagen"));

		//NOTE1: elements are listed in their input order
		//NOTE2: duplicated entries are ignored (no runtime error)

		//[Copenhagen, CoPeNhAgEN, Bruxelles, Munich, Strasbourg, Edinburgh, DUBLIN] (7 elems)
		System.out.printf("%s (%d elems)\n", lhset, lhset.size());
	}
}
