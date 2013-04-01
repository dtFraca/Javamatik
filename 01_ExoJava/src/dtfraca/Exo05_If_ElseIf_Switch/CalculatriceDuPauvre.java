package dtfraca.Exo05_If_ElseIf_Switch;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-03-23 - david
 */
public class CalculatriceDuPauvre {
	public static void main(String[] args) {
		System.out.println("1. Multiplication");
		System.out.println("2. Addition");
		System.out.println("3. Soustraction");
		System.out.println("4. Division");
		System.out.print("VOTRE CHOIX: ");
		Scanner myScan = new Scanner(System.in);
		Scanner paramCalcul = new Scanner(System.in);
		int choixMenu = myScan.nextInt();

		switch (choixMenu) {
			case 1:
				System.out.print("Veuillez entrez deux nombres pour les multipliés: ");
				double nombreMulti1 = paramCalcul.nextDouble();
				double nombreMulti2 = paramCalcul.nextDouble();
				System.out.printf("%.2f x %.2f = %.2f", nombreMulti1, nombreMulti2, nombreMulti1 * nombreMulti2);
				break;

			case 2:
				System.out.print("Veuillez entrez deux nombres pour les additionés: ");
				double nombreAdi1  = paramCalcul.nextDouble();
				double nombreAdi2 = paramCalcul.nextDouble();
				System.out.printf("%.2f + %.2f = %.2f", nombreAdi1, nombreAdi2, nombreAdi1 + nombreAdi2);
				break;

			case 3:
				System.out.print("Veuillez entrez deux nombres pour les soustraires: ");
				double nombreSous1 = paramCalcul.nextDouble();
				double nombreSous2 = paramCalcul.nextDouble();
				System.out.printf("%.2f - %.2f = %.2f", nombreSous1,nombreSous2, nombreSous1 - nombreSous2);
				break;

			case 4:
				System.out.print("Veuillez entrez deux nombres pour les divisés: ");
				double nombreDivi1 = paramCalcul.nextDouble();
				double nombreDivi2 = paramCalcul.nextDouble();
				System.out.printf("%.2f : %.2f = %.2f", nombreDivi1, nombreDivi2, nombreDivi1 / nombreDivi2);
				break;

			default:
				System.out.print("Choix inconnu");
				break;

	}
  }
}

