package dtfraca.Exo06_Random;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-02-27 - david
 */
public class Comparer2Nombres {
	public static void main(String[] args) {

		System.out.print("Veuillez entrez deux nombres (séparé d'un espace): ");

		Scanner myScan = new Scanner(System.in);

		int n1 = myScan.nextInt();
		int n2 = myScan.nextInt();

		if (n1 < n2) {
			System.out.printf("%d est plus petit que %d", n1, n2);
		}

		if (n1 > n2) {
			System.out.printf("%d est plus grand que %d", n1, n2);
		}

		if (n1 == n2) {
			System.out.printf("%d est égal à %d", n1, n2);

		}
	}
}
