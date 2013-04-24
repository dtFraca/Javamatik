package dtfraca.Exo04_Boucle_FOR_WHILE;


/**
 * Class Description: ?
 * <p/>
 * 2013-04-21 - david
 */
public class MajusculePositionPaireV2 {
	public static void main(String[] args) {

		String phraseOriginal = "abcdefghijk-123";
		String chaineFinale = "";

		int indicePosition = 0;

		for (Character unCarac : phraseOriginal.toCharArray()) {
			indicePosition++;

			//String uneLettre = unCarac.toString();

			if (indicePosition % 2 == 0) {
				//System.out.printf("%s", Character.toUpperCase(unCarac));
				chaineFinale += Character.toUpperCase(unCarac);

			}
			else {
				//System.out.printf("%s", unCarac);
				//chaineFinale += unCarac;
				chaineFinale = chaineFinale + unCarac; // Equivalent de chaineFinale += unCarac

			}
		}
		System.out.printf("Phrase original = %s\n", phraseOriginal);
		System.out.printf("Chaine finale   = %s\n", chaineFinale);
	}
}
