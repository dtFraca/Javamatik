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
		String chaineSecrete = "";

		int essai = 0;

		//Generer 4 lettres majuscules
		for (int aa = 0;aa < 4; aa++) {

			int codeAscii = 65 + rdmGenerateur.nextInt(90 - 65);
			char charLettre = (char) codeAscii;
			chaineSecrete += charLettre;
		}


		System.out.printf("%s\n", chaineSecrete);

		while (true) {
			essai++;
			System.out.print("Veuillez retapez les quatre lettres: ");
			Scanner myScan = new Scanner(System.in);
			String quatreLettreClavier = myScan.nextLine();

			//Comparer case insensitive
			if (quatreLettreClavier.equalsIgnoreCase(chaineSecrete)) {
				System.out.printf("Combinaison trouvé (essai = %d)", essai);
				break;
			}
			else {
				String msg = "Mauvaise réponse";

				if (essai > 10) {
					msg = "Il faut vous payez une paire de lunettes";
				}
				else if (essai > 5 && essai <= 10) {
					msg = "Voulez-vous des leçons particulières de lecture";
				}
				else if (essai > 2 && essai <= 5) {
					msg = "Un peu d'attention";
				}
				else if (essai > 1) {
					msg = "Un peu de patience";
				}


				System.out.printf("%s (essai = %d)\n", msg, essai);
				System.out.printf("Retapez ceci: %s\n", chaineSecrete);

			}

		}
	}

}
