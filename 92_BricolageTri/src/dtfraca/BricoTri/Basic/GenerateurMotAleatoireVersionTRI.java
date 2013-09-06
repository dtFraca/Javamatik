package dtfraca.BricoTri.Basic;

import java.util.Random;

/**
 * Generer X mots, chaque mot est compose de 10 carac aleatoires
 * <p/>
 * 2013-06-04 - tri
 */
public class GenerateurMotAleatoireVersionTRI {
	public static void main(String[] args) {

		Random rdmGenerateur = new Random();
		for (int nombreDeMot = 1; nombreDeMot <= 20; nombreDeMot++) {
			String chaineFinale = "";

			for (int nombreDeLettre = 1; nombreDeLettre <= 10; nombreDeLettre++) {

				int codeAscii = 65 + rdmGenerateur.nextInt(122 - 65);
				chaineFinale += (char) codeAscii;


				//for (int codeAscii = 1; codeAscii <= 10 ; codeAscii++) {
/*
					while (true) {
						int codeAscii = 65 + rdmGenerateur.nextInt(122 - 65);

						if ((codeAscii >= 65 && codeAscii <= 90) || (codeAscii >= 97 && codeAscii <= 122) ) {
							char charLettre = (char) codeAscii;
							chaineFinale += charLettre;
							break;
						}
					}
*/
				//}
			} //nombreDeMot

			System.out.printf("%2d. %s\n", nombreDeMot, chaineFinale);
		}
		//System.out.printf("%s\n", chaineFinale);
	}
}
