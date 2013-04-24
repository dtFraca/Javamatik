package dtfraca.Exo07_Array;

import java.util.Arrays;

/**
 * Demo elementaire de manipulation array 1 dimension
 *
 * 2013-04-24 - tri
 */
public class A4_ArrayElementaire {
	public static void main(String[] args) {
		String[] jourSemaine = new String[7];

		jourSemaine[0] = "Lundi";
		jourSemaine[1] = "Mardi";
		jourSemaine[2] = "Mercredi";
		jourSemaine[3] = "Jeudi";
		jourSemaine[4] = "Vendredi";
		jourSemaine[5] = "Samedi";
		jourSemaine[6] = "Dimanche";
		//jourSemaine[7] = "Lundi #2";

		//System.out.printf("Element Position 3 = %s\n", jourSemaine[3]);

		// Balayage en avant
		System.out.println("FORWARD\n===========");
		for(int i = 0; i < jourSemaine.length; i++) {
			System.out.printf("Position %d, Valeur = %s\n", i, jourSemaine[i]);
		}

		// Backward
		System.out.println("\nBACKWARD\n===========");
		for (int i = jourSemaine.length -1; i >= 0 ; i--) {
			System.out.printf("Position %d, Valeur = %s\n", i, jourSemaine[i]);
		}

		// Trier (sort) par ordre alphabetique
		Arrays.sort(jourSemaine);
		System.out.println("\nORDER BY ALPHA\n===========");
		for(int i = 0; i < jourSemaine.length; i++) {
			System.out.printf("Position %d, Valeur = %s\n", i, jourSemaine[i]);
		}

		int[] scoreMatch = new int[8];
		scoreMatch[0] = 120;
		scoreMatch[1] = 100;
		scoreMatch[2] = 92;
		scoreMatch[3] = 140;
		scoreMatch[4] = 66;
		scoreMatch[5] = 75;
		scoreMatch[6] = 1000;
		scoreMatch[7] = 400;

		int totalPoint = 0;
/*
		//====boucle for a l'ancienne
		for (int i = 0; i < scoreMatch.length; i++) {
			totalPoint += scoreMatch[i]; // equiv de : totalPoint = totalPoint + scoreMatch[i];
		}
*/
		//====boucle de type "for each"
		for (int valeurElem : scoreMatch) {
			totalPoint += valeurElem;
		}

		System.out.println();
		System.out.printf("Total points en %2d matches = %d\n", scoreMatch.length, totalPoint);
		System.out.printf("Moyenne Points............ = %.0f\n", (double) totalPoint / (double) scoreMatch.length);

	}
}
