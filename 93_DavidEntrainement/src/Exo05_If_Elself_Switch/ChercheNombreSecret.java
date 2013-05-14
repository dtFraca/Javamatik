package Exo05_If_Elself_Switch;

import java.util.Random;
import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-05-11 - david
 */
public class ChercheNombreSecret {
	public static void main(String[] args) {

		Random rdm = new Random();

		int nombreSecret = rdm.nextInt(1000);
		int aa = 0;

		while (true) {
			Scanner myScan = new Scanner(System.in);
			int nombreClavier = myScan.nextInt();

			if (nombreClavier == nombreSecret) {
				System.out.printf("Nombre trouvé %d (essai = %d)", nombreSecret, aa);
				break;
		}
			if (nombreClavier < nombreSecret) {
				System.out.printf("Nombre supérieur à %d (essai = %d)", nombreClavier, aa);
			}

			else {
				System.out.printf("Nombre inférieur à %d (essai = %d)", nombreClavier, aa);
			}

		}


		}

	}

