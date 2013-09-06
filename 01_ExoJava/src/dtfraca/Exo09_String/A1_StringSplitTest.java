package dtfraca.Exo09_String;

/**
 * 1. String.split() avec plusieurs variante de delimiteurs
 * <p/>
 * <p/>
 * 2013-03-13 - tri
 */
public class A1_StringSplitTest {
	public static void main(String[] args) {
		//----------------------------------------------------
		// Exemple 1: Separer les mots d'une phrase
		// Delimiteur mot = " "
		//----------------------------------------------------
		String maPhrase = "Sur le Pont d'Avignon";
		System.out.printf("Ex #1: [%s]\n", maPhrase);
		int kk = 1;
		for (String mot : maPhrase.split(" ")) {
			System.out.printf("%2d. [%s]\n", kk++, mot);
		}


		//----------------------------------------------------
		// Exemple 2: Separer les phrase d'un paragraphe
		// Delimiteur phrase = "." ou ";"
		//----------------------------------------------------
		String myParagraph = "Voici phrase #1  . Voici phrase #2. Voici phrase #3;     Voici phrase #4   ";
		System.out.printf("\n\"Ex #2: [%s]\n", myParagraph);
		kk = 1;
		for (String phrase : myParagraph.split("[.;]")) {
			System.out.printf("%2d. [%s]\n", kk++, phrase);
		}


		//----------------------------------------------------
		// Exemple 3: Separer les mots
		// Delimiteur = espace et toute sorte de ponctuations
		//----------------------------------------------------
		String myText = "Circulation [paralysée], transports_en*commun(très)perturbés... L'épisode,neigeux\\gêne/beaucoup.de.Français{dans}leur|quotidien";

		//NOTE: les delimiteurs suivant ont une signification dans le pattern du regex \ [ ]
		//pour les interpreter il faut qu'ils ait \ devant. par ex: \[
		//CEPENDANT: le carac \ dans une chaine Java doit etre lui-meme escaped et doit s'ecrire \\
		//Ainsi \[ doit s'ecrire \\[ et \\ doit s'ecrire \\\\
		String regexPatten = "[, _.*\\\\(){}/|\\[\\]]";
		String[] listeMots = myText.split(regexPatten);

		System.out.printf("\n\"Ex #3: %s\n", myText);
		System.out.printf("Regex Pattern: %s\n", regexPatten);
		kk = 1;
		for (String mot : listeMots) {
			if (mot.length() > 0) {
				System.out.printf("%2d. [%s]\n", kk++, mot);
			}
		}

	}
}
