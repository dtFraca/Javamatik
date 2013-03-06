package Exo03_Scanner;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-02-23 - david
 */
public class EchoFrappe {
	public static void main(String[] args) {
		System.out.print("Veuillez entrez votre nom: ");
		Scanner myScan = new Scanner(System.in);
		String username = myScan.nextLine();
		System.out.printf("Votre nom est............: %s", username);


	}
}
