package dtfraca.Exo05_If_ElseIf_Switch;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-03-08 - david
 */
public class TesteurDeDiviseurV2 {
	public static void main(String[] args) {

		System.out.print("Veuillez entrez un nombre: ");

		Scanner myScan = new Scanner(System.in);

		int n1 = myScan.nextInt();

		if (n1 % 2 == 0) {
			System.out.printf("%d est divisible par.......%d\n", n1, 2);
		} else {
			System.out.printf("%d n'est pas divisible par %d\n", n1, 2);
		}

		if (n1 % 3 == 0) {
			System.out.printf("%d est divisible par.......%d\n", n1, 3);
		} else {
			System.out.printf("%d n'est pas divisible par %d\n", n1, 3);
		}

		if (n1 % 4 == 0) {
			System.out.printf("%d est divisible par.......%d\n", n1, 4);
		} else {
			System.out.printf("%d n'est pas divisible par %d\n", n1, 4);
		}

		if (n1 % 5 == 0) {
			System.out.printf("%d est divisible par.......%d\n", n1, 5);
		} else {
			System.out.printf("%d n'est pas divisible par %d\n", n1, 5);
		}

		if (n1 % 6 == 0) {
			System.out.printf("%d est divisible par.......%d\n", n1, 6);
		} else {
			System.out.printf("%d n'est pas divisible par %d\n", n1, 6);
		}
		if (n1 % 7 == 0) {
			System.out.printf("%d est divisible par.......%d\n", n1, 7);
		} else {
			System.out.printf("%d n'est pas divisible par %d\n", n1, 7);
		}
		if (n1 % 8 == 0) {
			System.out.printf("%d est divisible par.......%d\n", n1, 8);
		} else {
			System.out.printf("%d n'est pas divisible par %d\n", n1, 8);
		}
		if (n1 % 9 == 0) {
			System.out.printf("%d est divisible par....... %d\n", n1, 9);
		} else {
			System.out.printf("%d n'est pas divisible par %d\n", n1, 9);
		}
		if (n1 % 10 == 0) {
			System.out.printf("%d est divisible par....... %d\n", n1, 10);
		} else {
			System.out.printf("%d n'est pas divisible par %d\n", n1, 10);
		}


	}
}
