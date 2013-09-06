package dtfraca.Exo07_Array;

/**
 * Reverse String utilisant DEUX array char[]
 * <p/>
 * 2013-07-08 - david
 */
public class ReverseStringEconomic2 {
	public static void main(String[] args) {
		String mot = "Hello + Bonjour = 4758.-5+[];?";
		char[] charLettres = mot.toCharArray();
		System.out.printf("Chain Orig.................: %s\n", mot);
		System.out.print("char[] charLettres FORWARD : ");
		for (int zz = 0; zz < charLettres.length; zz++) {
			System.out.printf("[%d] %s, ", zz, charLettres[zz]);
		}
		System.out.print("\nchar[] charLettres BACKWARD: ");
		for (int zz = charLettres.length - 1; zz >= 0; zz--) {
			System.out.printf("[%d] %s, ", zz, charLettres[zz]);
		}
		System.out.println();
		//creer char array qui contiendra les lettres arraqngees a l'envers
		char[] cInverse = new char[charLettres.length];
/*
		cInverse[0] = charLettres[6];
		cInverse[1] = charLettres[5];
		cInverse[2] = charLettres[4];
		cInverse[3] = charLettres[3];
		cInverse[4] = charLettres[2];
		cInverse[5] = charLettres[1];
		cInverse[6] = charLettres[0];
*/

//		System.out.print("\n\ncInverse[]: ");
//		for (int zz = 0; zz < cInverse.length; zz++) {
		for (int nbFor = 0; nbFor <= cInverse.length - 1; nbFor++) {
			//System.out.printf("%d - %d\n", nbFor, mot.length() -1 - nbFor);
			cInverse[nbFor] = charLettres[mot.length() - 1 - nbFor];
		}


		System.out.println();
		//System.out.printf("\nChaine inversee, version Economic: %s", .?.);
		String strInverse = new String(cInverse);
		System.out.printf("\nChaine inversee, version Economic: %s", strInverse);
	}
}
