package Exo05_If_Elself_Switch;

import java.util.Random;
import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-05-16 - david
 */
public class ComparChaine {
	public static void main(String[] args) {

		Random rdmGenerateur = new Random();
		String chaineFinale = "";
		int aa = 0;
		while (aa < 4) {
			aa++;
			int codeAscii = 65 + rdmGenerateur.nextInt(90 - 65);
			char charLettre = (char) codeAscii;
			chaineFinale += charLettre;
		}
		System.out.printf("%s\n", chaineFinale);
		System.out.print("Veuillez retapez les quatre lettres: ");

		//String quatreLettre = "azer";
					Scanner myScan = new Scanner(System.in);
		String quatreLettreClavier = myScan.nextLine();


		if (chaineFinale.equals(quatreLettreClavier)) {
			System.out.println("Bon");

		}

		else {
			System.out.println("Mauvais");
		}
	}
}
