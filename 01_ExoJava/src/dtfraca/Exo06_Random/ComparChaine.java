package dtfraca.Exo06_Random;

import java.util.Random;
import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-05-16 - david
 */
public class ComparChaine {
	public static void main(String[] args) {


		Random rdmGenerateur = new Random();
		String chaineFinale = "";

		int essai = 0;

		for (int aa = 0;aa < 4; aa++) {

		int codeAscii = 65 + rdmGenerateur.nextInt(90 - 65);
		char charLettre = (char) codeAscii;
		chaineFinale += charLettre;
		}


		System.out.printf("%s\n", chaineFinale);
		System.out.print("Veuillez retapez les quatre lettres: ");

		while (true) {
			essai++;

			Scanner myScan = new Scanner(System.in);
			String quatreLettreClavier = myScan.nextLine();

			if (quatreLettreClavier.equals(chaineFinale)) {
				System.out.printf("Combinaison trouvé (essai = %d)", essai);
				break;
			}
			else {
				System.out.printf("Mauvais (essai = %d)", essai);

				System.out.printf("%s\n", chaineFinale);

			}

		}
	}

}
