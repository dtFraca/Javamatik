package dtfraca.Exo05_If_ElseIf_Switch;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-03-08 - david
 */
public class TesteurDeDiviseurV1 {
	public static void main(String[] args) {

		System.out.print("Veuillez entrez deux nombres (séparé d'un espace): ");
		Scanner myScan = new Scanner(System.in);

		int n1 = myScan.nextInt();
		int n2 = myScan.nextInt();
		int n1n2 = n1 / n2;

		System.out.printf("%d divisé par %d est égal à %d\n", n1, n2, n1n2);

		if (n1 % n2 == 0) {
			System.out.printf("%d est divisible par %d", n1, n2);
		} else {
			System.out.printf("%d n'est pas divisible par %d", n1, n2);
		}
	}
}
