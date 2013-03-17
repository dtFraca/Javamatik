package dtfraca.Exo02_DatatypeAndOperator;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-03-04 - david
 */
public class AssignementConditionel {
	public static void main(String[] args) {

		System.out.print("Veuillez entrez une note: ");

		Scanner myScan = new Scanner(System.in);

		Double laNote = myScan.nextDouble();

		if (laNote < 12) {
			System.out.printf("Echec, %.2f est en-dessous de 12", laNote);
		}

		if (laNote >= 12) {
			System.out.printf("Passe, %.2f est au-dessus de 12", laNote);
		}

		// assignement conditionel ( test ? <valeur test OK> : <valeur test pasOK>)

		String resultatExamen = (laNote >= 12.0 ? "PASSE" : "ECHEC" );

		System.out.println("\n\nVersion utilisant Assignement Conditionel:");
		System.out.printf("Resultat: %s (Votre Note: %.2f, Minimum pour passer: 12)\n",
				resultatExamen,
				laNote
		);

		System.out.println("\n\nAutre exemple d'assignment conditionel: pluriel \"intelligent\":");
		int nbDePiece = 5;
		System.out.printf("Il reste %d piece%s\n",
				nbDePiece,
				(nbDePiece > 1 ? "s" : "")
		);
	}
}
