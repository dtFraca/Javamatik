package dtfraca.Exo05_If_ElseIf_Switch;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-03-07 - david
 */
public class TestDePariteV1 {
	public static void main(String[] args) {
		System.out.print("Veuillez entrez un nombre entier: ");
		Scanner myScan = new Scanner(System.in);

		double n1 = myScan.nextDouble();


		System.out.printf("%f divisé par 2 est égal à %f", n1, n1/2);

		if (n1%2 == 0 ) {
			System.out.printf(" donc %f est paire",n1);
		}
	else {
			System.out.printf(", c'est impair", n1);
		}

	}
}

