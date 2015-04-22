package ijp.ch21;

import java.util.*;

/**
 * 21.3 Comparing the Performance of Sets and Lists
 * - Sets are more efficient than lists for storing nonduplicate elements
 * - Lists are useful for accessing elements through the index.
 * Test Results:
 *   HashSet......, member access  time: 26 ms
 *   HashSet......, remove element time: 21 ms
 *   LinkedHashSet, member access  time: 11 ms
 *   LinkedHashSet, remove element time: 22 ms
 *   TreeSet......, member access  time: 18 ms
 *   TreeSet......, remove element time: 41 ms
 *   ArrayList...., member access  time: 4259 ms
 *   ArrayList...., remove element time: 2002 ms
 *   LinkedList..., member access  time: 6663 ms
 *   LinkedList..., remove element time: 2670 ms
 *
 * Conclusion:
 * Sets are much more efficient than lists for testing whether an element is in a set or a list.
 *
 * 2015-04-04 - tri
 */
public class PerformanceCompare {
	static final int N = 50000;
	
	public static void main(String[] args) {
		List<Integer> biglistNum = new ArrayList<Integer>();
		System.out.printf("Generate ArrayList<Integer> of elements %d\n", N);
		for (int i = 0; i < N; i++) {
			biglistNum.add(i);
		}
		System.out.println("Shuffle the array list\n");
		Collections.shuffle(biglistNum);

		Collection<Integer> set1 = new HashSet<Integer>(biglistNum);
		System.out.printf("HashSet......, member access  time: %d ms\n", getTestTime(set1));
		System.out.printf("HashSet......, remove element time: %d ms\n", getRemoveTime(set1));

		Collection<Integer> set2 = new LinkedHashSet<Integer>(biglistNum);
		System.out.printf("LinkedHashSet, member access  time: %d ms\n", getTestTime(set2));
		System.out.printf("LinkedHashSet, remove element time: %d ms\n", getRemoveTime(set2));

		Collection<Integer> set3 = new TreeSet<Integer>(biglistNum);
		System.out.printf("TreeSet......, member access  time: %d ms\n", getTestTime(set3));
		System.out.printf("TreeSet......, remove element time: %d ms\n", getRemoveTime(set3));

		Collection<Integer> list1 = new ArrayList<Integer>(biglistNum);
		System.out.printf("ArrayList...., member access  time: %d ms\n", getTestTime(list1));
		System.out.printf("ArrayList...., remove element time: %d ms\n", getRemoveTime(list1));

		Collection<Integer> list2 = new LinkedList<Integer>(biglistNum);
		System.out.printf("LinkedList..., member access  time: %d ms\n", getTestTime(list2));
		System.out.printf("LinkedList..., remove element time: %d ms\n", getRemoveTime(list2));
	}

	/**
	 * Check N times (N = element count) if a number is present in the collection
	 */
	public static long getTestTime(Collection<Integer> c) {
		long startTime = System.currentTimeMillis();

		// Test if a number is in the collection
		for (int i = 0; i < N; i++) {
			c.contains((int) (Math.random() * 2 * N));
		}

		return System.currentTimeMillis() - startTime;
	}

	/**
	 * Empty the collection in the slowest manner possible
	 * By removing elements one by one. The idea is to test how fast the collection
	 * access an element depending on the concret implementation of the collection
	 */
	public static long getRemoveTime(Collection<Integer> c) {
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < N; i++)
			c.remove(i);

		return System.currentTimeMillis() - startTime;
	}
}
