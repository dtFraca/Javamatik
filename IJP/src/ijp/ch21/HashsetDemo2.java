package ijp.ch21;

/**
 * Chapter 21 Sets and Maps
 * Basic Collections static methods on Set operations
 * - intersection: set1.retainAll(set2)
 * - union.......: set1.addAll(set2)
 * - left join...: set1.removeAll(set2)  (exists in set1 but not in set2)
 *
 * 2015-04-04 - tri
 */
public class HashsetDemo2 {
	public static void main(String[] args) {
		java.util.Set<String> set1 = initTestSet();
		System.out.printf("Set1: %s (%d elems)\n", set1, set1.size());

		// Delete a string from set1
		set1.remove("London");
		System.out.println("\nset1.remove(\"London\") --->");
		System.out.printf("Set1: %s (%d elems)\n", set1, set1.size());

		// Create set2
		java.util.Set<String> set2 = new java.util.HashSet<String>();
		set2.add("London");
		set2.add("Toronto");
		set2.add("Paris");
		set2.add("Minesota");
		System.out.printf("\n===== Set2: %s ===== (%d elems)\n", set2, set2.size());

		System.out.println("\nIs Chimichunka in set2? " + set2.contains("Chimichunka"));

		set1 = initTestSet();
		System.out.printf("\nSet1 Before: %s (%d elems)\n", set1, set1.size());
		set1.addAll(set2);
		System.out.println("set1.addAll(set2) (Union) --->");
		System.out.printf("Set1 After : %s (%d elems)\n", set1, set1.size());

		set1 = initTestSet();
		System.out.printf("\nSet1 Before: %s (%d elems)\n", set1, set1.size());
		set1.removeAll(set2);
		System.out.println("set1.removeAll(set2) (\"LeftJoin\" exists in set1 but not in set2) --->");
		System.out.printf("Set1 After : %s (%d elems)\n", set1, set1.size());

		set1 = initTestSet();
		System.out.printf("\nSet1 Before: %s (%d elems)\n", set1, set1.size());
		set1.retainAll(set2);
		System.out.println("set1.retainAll(set2) (Intersection) --->");
		System.out.printf("Set1 After : %s (%d elems)\n", set1, set1.size());
	}

	static private java.util.Set<String> initTestSet() {
		java.util.Set<String> set1 = new java.util.HashSet<String>(); // JDK8: HashSet<>()
		set1.add("London");
		set1.add("Paris");
		set1.add("Berlin");
		set1.add("Stockholm");
		set1.add("Copenhagen");
		return set1;
	}
}
