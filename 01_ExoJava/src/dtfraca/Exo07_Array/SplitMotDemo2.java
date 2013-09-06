package dtfraca.Exo07_Array;

/**
 * Class Description: ?
 * <p/>
 * 2013-07-17 - david
 */
public class SplitMotDemo2 {
	public static void main(String[] args) {

		String phrase = "le.chemin+de  la - liberte;:;version:,,,originale";
		String chaine = "";
		String[] mots = phrase.split("[\\.+ \\-,;:]+");

/*
		for (int kk = 0; kk < mots.length; kk++) {

			System.out.printf("%2d. %s\n", kk, mots[kk]);
		}
		System.out.println();
		System.out.println();
*/

		for (int zz = mots.length - 1; zz >= 0; zz--) {
			System.out.printf("%2d. %s\n", zz, mots[zz]);
		}

	}
}
