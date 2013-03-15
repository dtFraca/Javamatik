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
		double montantInitial = myScan.nextDouble();

		System.out.printf("MONTANT: %.2f\n\n", montantInitial);

		double montantRestant = 0;

		double franceTVA = (double) montantInitial * 0.196 + montantInitial;
		montantRestant = montantInitial * 0.196 + montantInitial;
		System.out.printf("Votre produit coûte %.2f€ en France (taxe: 19.60 => %.2f€)\n", franceTVA, montantRestant - montantInitial);

		double allemagneTVA = (double) montantInitial * 0.19 + montantInitial;
		montantRestant = montantInitial * 0.19 + montantInitial;
		System.out.printf("Votre produit coûte %.2f€ en Allemagne (taxe: 19 => %.2f€)\n", allemagneTVA, montantRestant - montantInitial);

		double italieTVA = (double) montantInitial * 0.23 + montantInitial;
		montantRestant = montantInitial * 0.23 + montantInitial;
		System.out.printf("Votre produit coûte %.2f€ en Italie (taxe: 23 => %.2f€)\n", italieTVA, montantRestant - montantInitial);

		double ukTVA = (double) montantInitial * 0.18 + montantInitial;
		montantRestant = montantInitial * 0.18 + montantInitial;
		System.out.printf("Votre produit coûte %.2f€ en Angleterre (taxe: 18 => %.2f€)\n", ukTVA, montantRestant - montantInitial);

		double cpTVA = (double) montantInitial * 0.13 + montantInitial;
		montantRestant = montantInitial * 0.13 + montantInitial;
		System.out.printf("Votre produit coûte %.2f€ au Canada Ontario (taxe: 13 => %.2f€)\n", cpTVA, montantRestant - montantInitial);

		double caTVA = (double) montantInitial * 0.05 + montantInitial;
		montantRestant = montantInitial * 0.05 + montantInitial;
		System.out.printf("Votre produit coûte %.2f€ au Canada Alberta (taxe: 5 => %.2f€)\n", caTVA, montantRestant - montantInitial);

		double californieTVA = (double) montantInitial * 0.1 + montantInitial;
		montantRestant = montantInitial * 0.1 + montantInitial;
		System.out.printf("Votre produit coûte %.2f€ en californie (taxe: 10 => %.2f€)\n", franceTVA, montantRestant - montantInitial);






	}
}
