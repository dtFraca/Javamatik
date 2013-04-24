package dtfraca.Exo04_Boucle_FOR_WHILE;


/**
 * Class Description: ?
 * <p/>
 * 2013-04-21 - david
 */
public class MajusculePositionPaireV2 {
	public static void main(String[] args) {


		String phraseOriginal = "abcdefghijk-123";

		System.out.printf("Phrase original = %s\n", phraseOriginal);
		System.out.printf("Phrase avec majuscule position paire = ");


		int indicePosition = 0;

		for (Character unCarac : phraseOriginal.toCharArray()) {
				indicePosition++;

			String unMot = unCarac.toString();



		if (indicePosition% 2 == 0) {
			System.out.printf("%s", unMot.toUpperCase());

		}
		else {
			System.out.printf("%s", unMot);
		}




		}
	}
}
