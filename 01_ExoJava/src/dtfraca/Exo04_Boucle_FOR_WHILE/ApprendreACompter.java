package dtfraca.Exo04_Boucle_FOR_WHILE;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-03-09 - david
 */
public class ApprendreACompter {
	public static void main(String[] args) {
		System.out.print("Veuillez entrez un nombre à deux chiffres: ");
		Scanner myScan = new Scanner(System.in);
		int n1 = myScan.nextInt();

		System.out.println("-----------FOR----------");
		for (int aa = 1; aa <= n1; aa++) {
			System.out.printf("%2d, ", aa);
		}

		System.out.println("\n\n-----------WHILE--------------");
		int aa = 0;
		while (aa < n1) {
			aa++;
			System.out.printf("%2d, ", aa);
		}


		System.out.println("\n\n-----------NOMBRES IMPAIR----------");
		for (int bb = 1; bb <= n1; bb = bb + 2) {
			System.out.printf("%2d, ", bb);
		}


		System.out.println("\n\n-----------NOMBRES PAIR----------");
		for (int bb = 2; bb <= n1; bb = bb + 2) {
			System.out.printf("%2d, ", bb);
		}


		System.out.println("\n\n-----------FOR avec STEP = 3---------");
		for (int bb = 1; bb <= n1; bb = bb + 3) {
			System.out.printf("%2d, ", bb);
		}
	}
}
