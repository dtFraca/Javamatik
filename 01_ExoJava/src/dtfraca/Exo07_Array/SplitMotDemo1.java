package dtfraca.Exo07_Array;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-07-09 - david
 */
public class SplitMotDemo1 {
	public static void main(String[] args) {
		//Scanner myScan = new Scanner(System.in);
		//System.out.print("Veuillez entrez une phrase: ");
		//String phrase = myScan.nextLine();
		String phrase = "le,chemin;de la.liberte";
		int zz = 1;
		for (String mot : phrase.split("")) {
			System.out.printf("%2d. [%s]\n", zz++, mot);
		}

	}
}
