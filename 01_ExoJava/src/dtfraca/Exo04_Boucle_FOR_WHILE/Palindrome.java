package dtfraca.Exo04_Boucle_FOR_WHILE;


/**
 * Class Description: ?
 * <p/>
 * 2013-04-02 - david
 */
public class Palindrome {
	public static void main(String[] args) {

		String mot = "david";
		String chaineFinale = "";

		for (int i = mot.length() - 1; i >= 0; i--) {

			String unCarac = mot.substring(i, i + 1);
			chaineFinale += unCarac;

		}

		if (chaineFinale.equalsIgnoreCase(mot)) { // toUpperCase car java est sensible au minuscule/majuscule
			System.out.println("Ceci est un palindrome\n");
		} else {
			System.out.println("Ceci n'est pas un palindrome");
		}

		System.out.printf("Mot depart: %s\n", mot);
		System.out.printf("Mot inverse: %s\n", chaineFinale);


	}
}
