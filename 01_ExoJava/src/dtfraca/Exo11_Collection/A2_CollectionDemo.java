package dtfraca.Exo11_Collection;

import java.util.*;

/**
 * Demo some Collection methods:  addAll, frequency, disjoint, intersection, union
 *
 * 2013-03-19 - tri
 */
public class A2_CollectionDemo {
	public static void main(String[] args) {

		final String ANDROVERSION_JB = "Jelly Bean";
		final String ANDROVERSION_FROYO = "Froyo";

		String[] androidVersions = { ANDROVERSION_FROYO, "Gingerbread", "Honey Comb", "Ice Cream Sandwich", ANDROVERSION_JB };
		List< String > list1 = Arrays.asList( androidVersions );
		List< String > list2 = new ArrayList< String >();

		list2.add("Key Lime Pie");
		list2.add("LoL No One Knows");
		list2.add(ANDROVERSION_JB);
		list2.add(ANDROVERSION_FROYO);
		list2.add(ANDROVERSION_JB);

		int posItem = 1;
		boolean hasCommonItem = ! Collections.disjoint(list1, list2);
		System.out.printf("List1 & List2 have items in common: %s\n", (hasCommonItem ? "YES" : "NO") );
		if (hasCommonItem) {
			//INCORRECT: .retainAll() gives intersection WITH duplicates (Jelly Bean is listed x2)
			//List <String> listCommon = new ArrayList<String>(list2);
			//listCommon.retainAll(list1);

			List <String> listCommon = intersectionList(list1, list2);

			posItem = 1;
			for (String str : listCommon) {
				System.out.printf("%2d. %s\n", posItem++, str);
			}
		}


		System.out.println("\nList2: BEFORE addAll");
		posItem = 1;
		for (String str : list2) {
			System.out.printf("%2d. %s\n", posItem++, str);
		}

		// Append string array androidVersions to List2
		Collections.addAll(list2, androidVersions);
		System.out.println("\nList2: AFTER Collections.addAll(list2, androidVersions);");
		posItem = 1;
		for (String str : list2) {
			System.out.printf("%2d. %s\n", posItem++, str);
		}

		// Frequency of an item (how many times this item is found in the list)
		System.out.printf("\nCollections.frequency(list2, \"%s\"): %d\n", ANDROVERSION_JB, Collections.frequency(list2, ANDROVERSION_JB));
		System.out.printf("Collections.frequency(list2, \"%s\"): %d\n", ANDROVERSION_FROYO, Collections.frequency(list2, ANDROVERSION_FROYO));

	}


	/**
	 * List Union WITHOUT duplicates (an item which is duplicated in either list or both is returned once)
	 * NOTE: if duplicate is needed, just use standard Collections.addAll()
	 * List <String> list2 = new ArrayList<String>();
	 * Collections.addAll(list2, list1);
	 */
	private static <T> List<T> unionList(List<T> list1, List<T> list2) {
		Set<T> set = new HashSet<T>();

		set.addAll(list1);
		set.addAll(list2);

		return new ArrayList<T>(set);
	}

	/**
	 * List Intersection WITHOUT duplicates (an item which is duplicated in either list or both is returned once)
	 * NOTE: if duplicate is needed, just use standard Collections.retainAll()
	 * List <String> listCommon = new ArrayList<String>(list2);
	 * listCommon.retainAll(list1);
	 */
	private static <T> List<T> intersectionList(List<T> list1, List<T> list2) {
		List<T> list = new ArrayList<T>();

		for (T t : list1) {
			if(list2.contains(t)) {
				list.add(t);
			}
		}

		return list;
	}
}
