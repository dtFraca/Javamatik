package dtfraca.Exo09_String;

/**
 * Verifier si un mot est un sous sous-ensemble d'un anagramme
 * Ex: "route" est un mot possible (un sous sensemble) de l'anagramme "tournevis", mais "vitesse" ne l'est pas
 * <p/>
 * ATTENTION DEFAUTS:
 * - ne sait pas distinguer majuscule / Minuscule
 * Ex: "ETUVE" est anagramme de "EVOLUTION" mais "Etuve" ne l'est pas
 * <p/>
 * - ne sait pas compter le nb de lettres
 * Ex: "LUTTE" est accepté alors que l'anagramme EVOLUTION n'a qu'un 'T'
 * <p/>
 * - ne sais distinguer les accents
 * Ex: "VOLUTÉ" est refuse parce que É est considéré différent que E
 * <p/>
 * 2013-05-09 - tri
 */
public class A3_AnagramMatch {
	public static void main(String[] args) {
		String anagramme = "EVOLUTION";

		String[] motPossib = new String[]{
				//----anagramme valides
				"VOLUTÉ", // 'É' doit etre considéré comme 'E'
				"NOTE",
				"LOTION",
				"lOtIoN",
				"Etuvé",
				//----pas anagramme
				"SOLUTION", // 'S' ne fait pas partie
				"EVOLUER", // 'R' ne fait pas partie
				"LUTTE", // 2 x 'T' alors que l'anagramme n'a qu'un 'T'
				"ETONNEE" // 2xN, 3xE
		};

		System.out.printf("Anagramme de %s ?\n", anagramme);
		for (int kk = 0; kk < motPossib.length; kk++) {
			// Extraire CHAQUE lettre du mot candidat, toutes les lettres du mot DOIT
			// etre presentes dans l'anagramme
			boolean anagramTrouve = false;

			char[] lettresDuMot = motPossib[kk].toCharArray();
			for (char lettre : lettresDuMot) {
				if (anagramme.indexOf(lettre) >= 0) {
					anagramTrouve = true;
				} else {
					//lettre pas trouve dans l'anagramme, donc c'est sur le mot candidat ne fait pas partie de l'nanagramme
					anagramTrouve = false;

					//quitter boucle for, pas la peine de tester plus loin
					break;
				}
				//System.out.printf("%s %s|", lettre, anagramTrouve);
			}
			//System.out.println();

			System.out.printf("%2d. %15s -> %s\n", kk, motPossib[kk], (anagramTrouve ? "yes" : "..."));
		}

	}
}
