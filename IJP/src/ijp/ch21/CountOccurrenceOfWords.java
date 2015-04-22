package ijp.ch21;

import java.util.*;

/**
 * 21.6 Case Study: Occurrences of Words
 * This case study writes a program that counts the occurrences of words in a text and
 * displays the words and their occurrences in alphabetical order of the words.
 * This exercise is almost identical than
 * /home/tri/Documents/IntelliJProjects/Javamatik/01_ExoJava/src/dtfraca/Exo11_Collection/A3_WordCountSortedByKey.java
 *
 * 2015-04-04 - tri
 */
public class CountOccurrenceOfWords {
	public static void main(String[] args) {
		String txtParagraph = "L'iridium est un élément chimique de symbole Ir et de numéro atomique 77. " +
				"C'est un métal de transition de la famille des métaux du groupe du platine, très dur dur et super dur, dense, " +
				"cassant et d'aspect blanc argenté. Il est utilisé dans les alliages à haute résistance et " +
				"pouvant supporter de hautes températures. On le trouve dans la nature en alliage " +
				"avec le platine ou l'osmium. " +
				// creer qq doublons
				"nature nature mais haute alliage platine températures métaux On un un il il " +
				"iridium très très dense super métal argenté ";

		// Create a TreeMap to hold words as key and count as value
		Map<String, Integer> map = new TreeMap<String, Integer>();
		String[] words = txtParagraph.split("[ \\n\\t\\r.,;:!'?()]");
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();

			if (key.length() > 1) {
				if (map.containsKey(key)) {
					int value = map.get(key);
					map.put(key, ++value);
				}
				else {
					map.put(key, 1);
				}
			}
		}

		// Get all entries into a set
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

		// Get key and value from each entry (sorted by key ascending)
		for (Map.Entry<String, Integer> entry: entrySet)
			System.out.println(entry.getValue() + "\t" + entry.getKey());
	}
}
