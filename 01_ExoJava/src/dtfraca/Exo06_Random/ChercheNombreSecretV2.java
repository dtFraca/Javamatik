package dtfraca.Exo06_Random;

import java.util.Random;
import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-05-22 - david
 */
public class ChercheNombreSecretV2 {
	public static void main(String[] args) {
		Random rdmGenerateur = new Random();
		System.out.print("Veuillez entrez un nombre a trois chiffre: ");
		Scanner myScan = new Scanner(System.in);
		int nombreSecret = myScan.nextInt();
		int essai = 0;
		while (true) {
			essai++;
			int rechercheNombre = 1 + rdmGenerateur.nextInt(999 - 1);

			if (nombreSecret == rechercheNombre) {
				System.out.printf("Nombre trouvé : %d (essai = %d)", rechercheNombre, essai);
				break;
			}
		}
	}
}
