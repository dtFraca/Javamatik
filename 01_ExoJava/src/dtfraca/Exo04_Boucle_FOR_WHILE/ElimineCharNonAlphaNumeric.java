package dtfraca.Exo04_Boucle_FOR_WHILE;

/**
 * Class Description: ?
 * <p/>
 * 2013-04-02 - david
 */
public class ElimineCharNonAlphaNumeric {
	public static void main(String[] args) {

		String texte = "_()*^~Le* &Mur|{ du _+_SON^ = ;1.224\\ %km/s~@#$";


		String chaineFinale = "";
		String nonAlphaAccepte = "./= ";
		for (Character ch : texte.toCharArray()) {
			if (Character.isLetterOrDigit(ch) || nonAlphaAccepte.contains(ch.toString()))
				chaineFinale += ch;
		}
		System.out.printf("ORIGINAL = %s\n", texte);
		System.out.printf("NETTOYER = %s\n", chaineFinale);

	}
}
