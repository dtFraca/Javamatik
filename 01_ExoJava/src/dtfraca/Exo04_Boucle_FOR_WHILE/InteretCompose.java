package dtfraca.Exo04_Boucle_FOR_WHILE;

import java.util.Scanner;

/**
 * Calcul d'interet compose utilisant Boucle FOR et WHILE
 *
 * 013-03-17 - tri
 */
public class InteretCompose {
	public static void main(String[] args) {

		System.out.print("Somme initiale d'investissement: ");
		Scanner myScan = new Scanner(System.in);
		double depotInitial = myScan.nextDouble();
		double tauxInteret = 0.05d; // 5%

		System.out.printf("Montant Initial : %.2f\n\n", depotInitial);

		System.out.println("====VERSION Manuelle=============================");
		double capitalAn1 = depotInitial + (depotInitial * tauxInteret);
		System.out.printf("Année 1: %.2f\n", capitalAn1);

		//double capitalAn2 = capitalAn1 * (capitalAn1 * tauxInteret);
		double capitalAn2 = capitalAn1 * (1.0d +tauxInteret);// capitalAn1 * (1.0d +1 * tauxInteret);
		System.out.printf("Année 2: %.2f\n", capitalAn2);

		//double capitalAn3 = capitalAn2 * (capitalAn2 * tauxInteret);
		double capitalAn3 = capitalAn2 * (1.0d + tauxInteret);
		System.out.printf("Année 3: %.2f\n", capitalAn3);

		double capitalAn4 = capitalAn3 * (1.0d +tauxInteret);
		System.out.printf("Année 4: %.2f\n", capitalAn4);

		double capitalAn5 = capitalAn4 * (1.0d +tauxInteret);
		System.out.printf("Année 5: %.2f\n", capitalAn5);

		double capitalAn6 = capitalAn5 * (1.0d +tauxInteret);
		System.out.printf("Année 6: %.2f\n", capitalAn6);

		double capitalAn7 = capitalAn6 * (1.0d +tauxInteret);
		System.out.printf("Année 7: %.2f\n", capitalAn7);

		double capitalAn8 = capitalAn7 * (1.0d +tauxInteret);
		System.out.printf("Année 8: %.2f\n", capitalAn8);

		double capitalAn9 = capitalAn8 * (1.0d +tauxInteret);
		System.out.printf("Année 9: %.2f\n", capitalAn9);

		double capitalAn10 = capitalAn9 * (1.0d +tauxInteret);
		System.out.printf("Année10: %.2f\n", capitalAn10);


		System.out.println("============VERSION Boucle FOR========");
		double capitalAnneePrecedent = depotInitial;
		for (int annee = 1; annee <= 10; annee++) {
			double capitalAnneeN = capitalAnneePrecedent * (1.0d +tauxInteret);
			System.out.printf("Annee %2d: %8.2f\n", annee, capitalAnneeN);

			capitalAnneePrecedent = capitalAnneeN;
		}

		System.out.println("============VERSION Boucle WHILE========");
		capitalAnneePrecedent = depotInitial;
		int anneeWh = 1;
		while (anneeWh <= 10) {
			double capitalAnneeN = capitalAnneePrecedent * (1.0d +tauxInteret);
			System.out.printf("Annee %2d: %8.2f\n", anneeWh, capitalAnneeN);
			capitalAnneePrecedent = capitalAnneeN;
			anneeWh++;
		}

	}
}
