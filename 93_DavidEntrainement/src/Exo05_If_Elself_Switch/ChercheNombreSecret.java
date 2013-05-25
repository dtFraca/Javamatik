package Exo05_If_Elself_Switch;

import java.util.Random;
import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-05-22 - david
 */
public class ChercheNombreSecret {
	public static void main(String[] args) {
		System.out.print("Veuillez entrez un nombre a trois chiffre: ");
		Scanner myScan = new Scanner(System.in);
		int nombreSecret = myScan.nextInt();
		int essai = 0;
		while (true) {
			essai++;
			Random rdmGenerateur = new Random();
			int rechercheNombre = 1 + rdmGenerateur.nextInt(999 - 1);

			if (nombreSecret == rechercheNombre) {
				System.out.printf("Nombre trouvé : %d (essai = %d)", rechercheNombre, essai);
				break;
			}
		}
	}
}
