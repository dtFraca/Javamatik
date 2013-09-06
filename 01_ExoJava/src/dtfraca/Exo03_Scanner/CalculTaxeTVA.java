package dtfraca.Exo03_Scanner;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-03-13 - david
 */
public class CalculTaxeTVA {
	public static void main(String[] args) {
		System.out.print("Veuillez entrez le prix d'un produit: ");
		Scanner myScan = new Scanner(System.in);
		double prixHorsTaxe = myScan.nextDouble();

		System.out.printf("MONTANT: %.2f\n\n", prixHorsTaxe);

		double tvaFrance = 19.6d; // equivalent = 0.196
		double taxe = prixHorsTaxe * (tvaFrance / 100.0);
		System.out.printf("Prix apres taxe %.2f€ en France........ (taxe: %.2f%% => %.2f€)\n", prixHorsTaxe + taxe, tvaFrance, taxe);

		double tvaAllemagne = 19.0d; // equivalent = 0.19
		taxe = prixHorsTaxe * (tvaAllemagne / 100.0);
		System.out.printf("Prix apres taxe %.2f€ en Allemagne..... (taxe: %.2f%% => %.2f€)\n", prixHorsTaxe + taxe, tvaAllemagne, taxe);

		double tvaItalie = 23.0d;
		double tvaUK = 18.0d;
		double tvaCAOnt = 13.0d;
		double tvaCAAB = 5.0d;
		double tvaUSCA = 10.0d;

		taxe = prixHorsTaxe * (tvaItalie / 100.0);
		System.out.printf("Prix apres taxe %.2f€ en Italie........ (taxe: %.2f%% => %.2f€)\n", prixHorsTaxe + taxe, tvaItalie, taxe);

		taxe = prixHorsTaxe * (tvaUK / 100.0);
		System.out.printf("Prix apres taxe %.2f€ en Angleterre.... (taxe: %.2f%% => %.2f€)\n", prixHorsTaxe + taxe, tvaUK, taxe);

		taxe = prixHorsTaxe * (tvaCAOnt / 100.0);
		System.out.printf("Prix apres taxe %.2f€ en Canada Ontario (taxe: %.2f%% => %.2f€)\n", prixHorsTaxe + taxe, tvaCAOnt, taxe);

		taxe = prixHorsTaxe * (tvaCAAB / 100.0);
		System.out.printf("Prix apres taxe %.2f€ en Canada Alberta (taxe: %2.2f%% => %.2f€)\n", prixHorsTaxe + taxe, tvaCAAB, taxe);

		taxe = prixHorsTaxe * (tvaUSCA / 100.0);
		System.out.printf("Prix apres taxe %.2f€ en Californie.... (taxe: %.2f%% => %.2f€)\n", prixHorsTaxe + taxe, tvaUSCA, taxe);

	}
}





