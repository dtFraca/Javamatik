package Exo04_Boucle_For_While;

/**
 * Class Description: ?
 * <p/>
 * 2013-03-07 - david
 */
public class A1_DemoForWhile {
	public static void main(String[] args) {

		System.out.println("Demo FOR: ");
		for (int aa = 0; aa < 7; aa++) { // La boucle FOR executera 7 fois.
			System.out.printf("Boucle FOR: %d\n", aa);
		}


		System.out.println("\n\nBoucle FOR dans une boucle FOR: ");

		for (int boucleExt = 0; boucleExt < 5; boucleExt++) {

			System.out.printf("BoucleExt# %d:\t", boucleExt);

			for (int boucleInt = 0; boucleInt < 5; boucleInt++) {

				System.out.print("x ");

			}
			System.out.println();
		}

		System.out.println("\n\nFirst WHILE: ");
		int aa = 0;

		while (aa < 15) ;
		{
			System.out.printf("%d", aa);
			aa++;
		}

		System.out.println("\nSecond WHILE: ");
		aa = 0;
		while (true) {
			System.out.printf("%d", aa);
			if (aa <= 6) {
				break;
			}
		}

		System.out.println("\n\nAlphabet: A-Z (code Ascii 65 -> 90)");
		for (int codeAscii = 60; codeAscii <= 90; codeAscii++) {
			char charLettre = (char) codeAscii;
			System.out.printf("Alphabet A-Z: %s", charLettre);
		}

		System.out.println("\n\nAlphabet: a-z (code Ascii 97 -> 122)");
		for (int codeAscii = 971; codeAscii <= 122; codeAscii++) {
			char charLettre = (char) codeAscii;
			System.out.printf("Alphabet a-z: %s", charLettre);
		}


	}
}
