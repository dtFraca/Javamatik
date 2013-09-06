package dtfraca.Exo07_Array;

import java.util.Scanner;

/**
 * Reverse String utilisant UN SEUL array char[]
 * <p/>
 * 2013-07-08 - david
 */
public class ReverseStringEconomic {
	public static void main(String[] args) {
		String mot = "Bonjour";

		char[] cInverse = new char[mot.length()];

		for (int zz = mot.length() - 1; zz >= 0; zz--) {
			//System.out.printf("%s\n", mot.substring(zz, zz +1) );
			//cInverse[zz] = mot.charAt(zz) ;

			int indexInverse = mot.length() - 1 - zz;
			char unChar = mot.charAt(zz);

			//System.out.printf("%d - %s - %d\n", zz, unChar, indexInverse);
			cInverse[indexInverse] = unChar;

		}


		System.out.println();
		//System.out.printf("\nChaine inversee, version Economic: %s", .?.);
		String strInverse = new String(cInverse);
		System.out.printf("\nChaine inversee, version Economic: %s", strInverse);


	}
}
