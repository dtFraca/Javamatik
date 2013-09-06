package dtfraca.Exo11_Collection;

import java.util.*;

/**
 * Demo HashMap, TreeSet
 * display list of words (sorted AZ) and how many times the word appear in a paragraph
 * <p/>
 * Book "Java for Programmers, 18.11 Maps, page 610 WordTypeCount"
 * <p/>
 * 2013-03-22 - tri
 */
public class A3_WordCountSortedByKey {
	public static void main(String[] args) {
		String txtParagraph = "L'iridium est un élément chimique de symbole Ir et de numéro atomique 77. " +
				"C'est un métal de transition de la famille des métaux du groupe du platine, très dur, dense, " +
				"cassant et d'aspect blanc argenté. Il est utilisé dans les alliages à haute résistance et " +
				"pouvant supporter de hautes températures. On le trouve dans la nature en alliage " +
				"avec le platine ou l'osmium. " +
				// creer qq doublons
				"nature nature mais haute alliage platine températures métaux On un un il il " +
				"iridium très dense ";

				/*
				"Parmi les éléments connus, l'iridium est le plus " +
				"résistant à la corrosion. De nature sidérophile, il est quasiment absent de la surface " +
				"de la Terre mais pas des météorites métalliques et la présence d'iridium à la limite des couches " +
				"géologiques Crétacé-Tertiaire est un élément essentiel appuyant la théorie d'un impact météoritique " +
				"(peut-être celui du cratère de Chicxulub) à l'origine de l'extinction du Crétacé, dont " +
				"celle des dinosaures. L'iridium est utilisé dans des dispositifs devant supporter " +
				"de hautes températures, dans les contacts électriques et comme agent durcissant du platine.";
				*/

		// les mots d'origine (y compris doublons), separateur = espace et diveres ponctuations
		String[] motsOriginal = txtParagraph.split("[.; ,'()]");

		Map<String, Integer> mapMots = new HashMap<String, Integer>();
		for (String leMot : motsOriginal) {
			// n'accepte que les mot d'au moins 2 lettres
			if (leMot.length() > 1) {
				if (mapMots.containsKey(leMot)) {
					// mot existe deja dans le HashMap, +1 le nb de fois que le mot apparait (la frequence)
					int iFrequence = mapMots.get(leMot); // .get() prendre la valeur de la cle
					iFrequence++;
					mapMots.put(leMot, iFrequence); // .put() placer la valeur
				} else {
					// mot nouveau? Creer une nouvelle entree dans HashMap et init iFrequence = 1
					mapMots.put(leMot, 1);
				}
			}
		}

		// Afficher: Mots (ordre A-Z): suivi de la frequence du mot

		/*
		METHOD 1: ArrayList + Collections.sort()
		        : not good, Collections.sort() costs a little bit memory and time

		// Creer la liste des mots unique:
		List<String> motsUnique = new ArrayList<String>(mapMots.keySet());
		Collections.sort(motsUnique); // ordonner ordre Alpha A-Z
		int kk = 1;
		for (String leMot : motsUnique) {
			System.out.printf("%3d. %-20s: %d\n", kk++, leMot, mapMots.get(leMot));
		}
		*/


		// METHOD 2: TreeSet (items are sorted automatically)
		Set<String> treeSetMots = new TreeSet<String>(mapMots.keySet());
		int kk = 1;
		for (String leMot : treeSetMots) {
			System.out.printf("%3d. %-20s: %d\n", kk++, leMot, mapMots.get(leMot));
		}

	}
}
