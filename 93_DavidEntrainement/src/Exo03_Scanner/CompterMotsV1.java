package Exo03_Scanner;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-02-25 - david
 */
public class CompterMotsV1 {
	public static void main(String[] args) {

		System.out.print("Veuillez entrez une phrase: ");
		Scanner monClavier = new Scanner(System.in);
		String contenuPhrase = monClavier.nextLine();
		Scanner maPhrase = new Scanner(contenuPhrase);
		//Scanner maPhrase = new Scanner(monClavier.nextLine());

		int aa = 0;

		while (maPhrase.hasNext()) {
			aa++;
			String mot1 = maPhrase.next();
			System.out.printf("%d - %s\n", aa, mot1);
		}

		System.out.printf("Cette phrase contient %d mots, car il y a %d espaces\n", aa, aa - 1);

		monClavier.close();
		maPhrase.close();
	}
}
