package dtfraca.Exo06_Random;

import java.util.Random;

/**
 * Generer un anagrame en mixant les letrres d'un mot connu
 *
 * 2013-05-09 - tri
 */
public class A2_AnagramGenerator {
	public static void main(String[] args) {

		String[] dicoMots = { "FRANCAISE", "Précipitations", "Hameçon", "Héritière", "Révélations", "Déconnexion" };

		for (int i = 0; i < dicoMots.length; i++) {
			System.out.printf("%2d. %15s -> %s\n", i, dicoMots[i], CreateAnagram(dicoMots[i]));
		}

	}

	/**
	 * Melanger les position des lettres d'un string
	 * Shuffle Algorithm: http://www.vogella.com/articles/JavaAlgorithmsShuffle/article.html
	 */
	private static String CreateAnagram(String origWord) {

		char[] letters = origWord.toCharArray();
		int itemCount = letters.length;


		// Shuffle items in a char array by swapping the value of each item by a random item
		Random rndGenerator = new Random();
		//rndGenerator.nextInt();
		for (int i = 0; i < itemCount; i++) {
			int randomPos = rndGenerator.nextInt(itemCount);
			swapItem(letters, i, randomPos);
		}

		//String anagram = new String(letters);
		//System.out.printf("origWord: %s, anagram: %s\n", origWord, anagram);

		return new String(letters);
	}

	/**
	 * Swap values of two items at pos1 and pos2 in myCharArr
	 */
	private static void swapItem(char[] myCharArr, int pos1, int pos2) {
		char origPos1Value = myCharArr[pos1];
		myCharArr[pos1] = myCharArr[pos2];
		myCharArr[pos2] = origPos1Value;
	}
}
