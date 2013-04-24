package dtfraca.Exo04_Boucle_FOR_WHILE;

/**
 * Class Description: ?
 * <p/>
 * 2013-04-24 - david
 */
public class MajusculePositionPaireV1 {
	public static void main(String[] args) {

		String phraseOriginal = "abcdefghijk-123";

		System.out.printf("Phrase original = %s\n", phraseOriginal);

		for (int aa = 1; aa < phraseOriginal.length(); aa++) {

		String unCarac = phraseOriginal.substring(aa, aa +1);

			if (aa % 2 == 0) {
				System.out.printf("%s", unCarac.toUpperCase());
			}

			else {
				System.out.printf("%s", unCarac);
			}

		}
	}
}
