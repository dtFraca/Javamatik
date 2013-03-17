package dtfraca.Exo04_Boucle_FOR_WHILE;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-03-09 - david
 */
public class TableMultiplicationDuPauvre {
	public static void main(String[] args) {
		System.out.print("Veuillez entrez un nombre: ");
		Scanner myScan = new Scanner(System.in);
		int n1 = myScan.nextInt();


		for (int aa = 1; aa < 11; aa++) {
			System.out.printf("%d x %2d = %3d\n", n1, aa, n1 * aa);
		}
	}
}
