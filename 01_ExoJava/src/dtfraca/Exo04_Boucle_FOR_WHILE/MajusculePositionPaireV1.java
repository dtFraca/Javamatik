package dtfraca.Exo04_Boucle_FOR_WHILE;

/**
 * Class Description: ?
 * <p/>
 * 2013-04-24 - david
 */
public class MajusculePositionPaireV1 {
	public static void main(String[] args) {

		String phraseOriginal = "abcdefghijk-123";
		String chaineFinale = "";

		for (int aa = 0; aa < phraseOriginal.length(); aa++) {

			String unCarac = phraseOriginal.substring(aa, aa +1);

			//aa +1 pour revenir au "comptage humain" 1-based

			if ( (aa +1) % 2 == 0) {
				//System.out.printf("%s", unCarac.toUpperCase());
				chaineFinale += unCarac.toUpperCase();
			}
			else {
				//System.out.printf("%s", unCarac);
				chaineFinale += unCarac;
			}
		}

		System.out.printf("Phrase originale = %s\n", phraseOriginal);
		System.out.printf("Chaine finale		e= %s\n", chaineFinale);
	}
}
