package dtfraca.Exo11_Collection;

import java.util.*;

/**
 * Demo Collection & ArrayList, here the ArrayList will contains simple string
 * DOCS : http://docs.oracle.com/javase/6/docs/api/java/util/Collections.html
 * TUTOR: http://docs.oracle.com/javase/tutorial/collections/index.html
 *
 * INTERESTING: When to use LinkedList over ArrayList?
 * http://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist
 *
 * 2013-03-18 - tri
 */
public class A1_ArrayListDemo {


	public static void main(String[] args) {
		final String NOMPAYS_BIDON = "Pays Bidon (sera enlevé)";

		//ArrayList<String> alNomPays = new ArrayList<String>();
		List<String> alNomPays = new ArrayList<String>();

		// http://fr.wikipedia.org/wiki/Liste_des_pays_et_territoires_par_superficie
		alNomPays.add("Canada");
		alNomPays.add("Australie");
		alNomPays.add("Brésil");
		alNomPays.add("France");
		alNomPays.add("Danemark");

		alNomPays.add(2, "Équateur"); // inserer devant element index 2 (Bresil)
		alNomPays.add(4, NOMPAYS_BIDON);

		System.out.println("ArralyList (UNSORT) - iterator = for (elem: list):");
		int orderNum = 1;
		for (String nomPays : alNomPays) {
			System.out.printf("%2d. %s\n", orderNum++, nomPays);
		}


		System.out.println("\nArralyList (SORT Ascending) + Iterator:");

		// ordonner par ordre alphabetique croissant
		Collections.sort(alNomPays);

		// Iterator simple (forward only)
		Iterator< String > iteratorPays = alNomPays.iterator();
		orderNum = 1;
		while ( iteratorPays.hasNext() )
		{
			System.out.printf("%2d. %s\n", orderNum++, iteratorPays.next());
		}

		// ListIterator simple (forward & backward)
		System.out.println("\nArralyList (SORT DEScending) + ListIterator:");
		ListIterator< String > listiterPays = alNomPays.listIterator(alNomPays.size());
		orderNum = 1;
		while ( listiterPays.hasPrevious() )
		{
			System.out.printf("%2d. %s\n", orderNum++, listiterPays.previous());
		}

		// Search item by Name & Remove item
		if (alNomPays.contains(NOMPAYS_BIDON)) {
			int posItem = alNomPays.indexOf(NOMPAYS_BIDON);
			if (posItem >= 0) {
				alNomPays.remove(posItem);
			}
		}

		System.out.println("\nArralyList - for (i; list.size(); i++)");
		for (int i = 0; i < alNomPays.size(); i++) {
			System.out.printf("%2d. %s\n", i +1, alNomPays.get(i));
		}


		// sort reverse order
		Collections.reverse(alNomPays);
		System.out.println("\nArralyList (SORT DEScending) - Collections.reverse()");
		for (int i = 0; i < alNomPays.size(); i++) {
			System.out.printf("%2d. %s\n", i +1, alNomPays.get(i));
		}

		// Shuffle item order
		Collections.shuffle(alNomPays);
		System.out.println("\nArralyList (SHUFFLE) - Collections.shuffle()");
		for (int i = 0; i < alNomPays.size(); i++) {
			System.out.printf("%2d. %s\n", i +1, alNomPays.get(i));
		}
	}
}
