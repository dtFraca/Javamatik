package dtfraca.Exo03_Scanner;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-02-21 - david
 */
public class ReArrangerMotsV2 {
	public static void main(String[] args) {

		System.out.print("Veuillez entrez une phrase: ");
		Scanner monClavier = new Scanner(System.in);

		//Réinstancie un autre objet Scanner à partir de la phrase complète
		//Raison : hasNext() sera toujours égal à true si Scanner était initialisé par System.in
		String phrase = monClavier.nextLine(); //Capture le texte tapé au clavier dans une variable
		Scanner scanDepuisTexte = new Scanner(phrase);


		//System.out.printf("La phrase est.............: %s", p1);

		int aa = 0;

		while (scanDepuisTexte.hasNext()) {
			aa++;

			// extraire le mot suivant: un mot est un string qui se trouve entre 2 espaces
			// NOTE: les ponctuations sont ignorees
			//String unMot = scanDepuisTexte.next();
			//System.out.printf("%d = %s\n", aa, unMot);

			scanDepuisTexte.next();
		}

		//System.out.printf("Cette phrase contient %d mot(s)\n", aa);

		if (aa < 3) {
			System.out.println("Veuillez entrez un texte de 3 mots ou plus");
		} else {
			System.out.printf("Votre phrase contient %s mot(s)", aa);
		}

        /*
		  if (aa>3) {
            System.out.printf("Votre phrase contient %s mot(s)", aa);
        }

        if (aa==3) {
            System.out.printf("Votre phrase contient %s mot(s)", aa);
        }
        */

		scanDepuisTexte = new Scanner(phrase);

		String mot1 = scanDepuisTexte.next();
		String mot2 = scanDepuisTexte.next();
		String mot3 = scanDepuisTexte.next();

		System.out.printf("\nLes trois mots inversés = %s, %s, %s\n", mot3, mot2, mot1);

		//monClavier.close();

	}
}