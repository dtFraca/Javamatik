package dtfraca.Exo04_Boucle_FOR_WHILE;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 013-03-12 - david
 */
public class InteretCompose {
	public static void main(String[] args) {

		System.out.print("Somme initiale d'investissement: ");
		Scanner myScan = new Scanner(System.in);
		double depotInitial = myScan.nextDouble();
		double tauxInteret = 0.05d; // 5%

		System.out.printf("Montant Initial : %.2f\n\n", depotInitial);
		
		double capitalAn1 = depotInitial + (depotInitial * tauxInteret);
		System.out.printf("Année 1: %.2f\n", capitalAn1);

		//double capitalAn2 = capitalAn1 + (capitalAn1 * tauxInteret);
		double capitalAn2 = capitalAn1 * (1.0 + tauxInteret);// capitalAn1 + (capitalAn1 * tauxInteret);
		System.out.printf("Année 2: %.2f\n", capitalAn2);

		double capitalAn3 = capitalAn2 + (capitalAn2 * tauxInteret);
		System.out.printf("Année 3: %.2f\n", capitalAn3);

		double capitalAn4 = capitalAn3 + (capitalAn3 * tauxInteret);
		System.out.printf("Année 4: %.2f\n", capitalAn4);

		double capitalAn5 = capitalAn4 + (capitalAn4 * tauxInteret);
		System.out.printf("Année 5: %.2f\n", capitalAn5);

		double capitalAn6 = capitalAn5 + (capitalAn5 * tauxInteret);
		System.out.printf("Année 6: %.2f\n", capitalAn6);

		double capitalAn7 = capitalAn6 + (capitalAn6 * tauxInteret);
		System.out.printf("Année 7: %.2f\n", capitalAn7);

		double capitalAn8 = capitalAn7 + (capitalAn7 * tauxInteret);
		System.out.printf("Année 8: %.2f\n", capitalAn8);

		double capitalAn9 = capitalAn8 + (capitalAn8 * tauxInteret);
		System.out.printf("Année 9: %.2f\n", capitalAn9);

		double capitalAn10 = capitalAn9 + (capitalAn9 * tauxInteret);
		System.out.printf("Année10: %.2f\n", capitalAn10);
	}
	
	}
