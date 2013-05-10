package dtfraca.Exo06_Random;

import java.util.Random;

/**
 * Generer un anagrame en mixant les letrres d'un mot connu
 *
 * 2013-05-09 - tri
 */
public class A2_AnagramGenerator {
	public static void main(String[] args) {

		//String[] dicoMots = { "FRANCAISE", "Précipitations", "Hameçon", "Héritière", "Révélations", "Déconnexion" };
		String[] dicoMots = {
				"ABRICOT", "BAGUETTE", "ELEPHANT", "FROMAGE",
				"MAISONETTE", "HYDRAULIQUE", "DECHARGER",
				"FOOTBALL", "LUMIERES", "RECEVOIR" };

		for (int i = 0; i < dicoMots.length; i++) {
			System.out.printf("%2d. %15s -> %s\n", i, dicoMots[i], CreateAnagram(dicoMots[i]));
		}
	}


	/**
	 * Melanger les position des lettres d'un string pour en faire un anagramme
	 * Adapted from: http://www.vogella.com/articles/JavaAlgorithmsShuffle/article.html
	 */
	private static String CreateAnagram(String origWord) {
		char[] letters = origWord.toCharArray();
		int itemCount = letters.length;

		Random rndGenerator = new Random();

		// Mix letters by swapping letter at position i with another random position
		for (int i = 0; i < itemCount; i++) {
			int randomPos = rndGenerator.nextInt(itemCount);

			if (i != randomPos && randomPos < itemCount) {
				char origPos1Value = letters[i];
				letters[i] = letters[randomPos];
				letters[randomPos] = origPos1Value;
			}
		}

		//String anagram = new String(letters);
		//System.out.printf("origWord: %s, anagram: %s\n", origWord, anagram);

		return new String(letters);
	}

}
