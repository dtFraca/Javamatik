package dtfraca.Exo05_If_ElseIf_Switch;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-03-23 - david
 */
public class CalculatriceDuPauvre {
	public static void main(String[] args) {
		System.out.print("Veuillez entrer l'expression de calcul: "); // Ex: "13 + 14.5"  ou "2.7 * -3.5"
		Scanner scanExpCalc = new Scanner(System.in);

		double n1 = scanExpCalc.nextDouble();
		String symbolOperateur = scanExpCalc.next();
		double n2 = scanExpCalc.nextDouble();
		//System.out.printf("n1 = %.2f\nOperateur = %s\nn2 = %.2f\n", n1, symbolOperateur, n2);

		if (symbolOperateur.equals("+")) {
			System.out.printf("%.2f %s %.2f = %.2f", n1, symbolOperateur, n2, n1 + n2);
		}

		if (symbolOperateur.equals("-")) {
			System.out.printf("%.2f %s %.2f = %.2f", n1, symbolOperateur, n2, n1 - n2);
		}

		if (symbolOperateur.equals("*")) {
			System.out.printf("%.2f %s %.2f = %.2f", n1, symbolOperateur, n2, n1 * n2);
		}

		if (symbolOperateur.equals("/")) {
			System.out.printf("%.2f %s %.2f = %.2f", n1, symbolOperateur, n2, n1 / n2);
		}
	}
}


