package dtfraca.Exo05_If_ElseIf_Switch;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-03-17 - david
 */
public class TesteurDeDiviseurV2FOR {
	public static void main(String[] args) {

		System.out.print("Veuillez entrez un nombre: ");
		Scanner myScan = new Scanner(System.in);
		int n1 = myScan.nextInt();


		for (int aa = 2; aa < 10; aa++) {
			if (n1 % aa == 0) {
				System.out.printf("%d est divisible par %d\n", n1, aa);
			} else {
				System.out.printf("%d n'est pas divisible par %d\n", n1, aa);
			}
		}


	}
}
