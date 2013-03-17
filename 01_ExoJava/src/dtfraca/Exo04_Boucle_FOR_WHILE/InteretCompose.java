package dtfraca.Exo04_Boucle_FOR_WHILE;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 013-03-12 - david
 */
public class InteretCompose {
	public static void main(String[] args) {

		System.out.print("Veuillez entrez une sommes: ");
		Scanner myScan = new Scanner(System.in);
		double montantInitial = myScan.nextInt();
		double MontantInitial = (double) montantInitial;
		System.out.printf("Montant Initial : %4f\n\n", montantInitial);
		
		double MontantRestant = 0;

		double annee1 = (double) (MontantInitial * 0.05);
		MontantRestant = MontantInitial * 0.05 + MontantInitial ;
		System.out.printf(" Anné(s) 1: %.2f\n" , MontantRestant);

		double annees2 = (double) (MontantRestant / 0.05 );
		MontantRestant = MontantRestant  * 0.05 + MontantRestant;
		System.out.printf(" Anné(s) 2: %.2f\n", MontantRestant);


		double annees3 = (double) (MontantRestant  / 0.05);
		MontantRestant = MontantRestant  * 0.05 + MontantRestant;
		System.out.printf(" Anné(s) 3: %.2f\n",MontantRestant);

		double annees4 = (double) (MontantRestant  / 0.05);
		MontantRestant = MontantRestant  * 0.05 + MontantRestant;
		System.out.printf(" Anné(s) 4: %.2f\n",MontantRestant);

		double annees5 = (double) (MontantRestant  / 0.05);
		MontantRestant = MontantRestant  * 0.05 + MontantRestant;
		System.out.printf( "Anné(s) 5: %.2f\n", MontantRestant);

		double annes6 = (double) (MontantRestant  / 0.05);
		MontantRestant = MontantRestant  * 0.05 + MontantRestant;
		System.out.printf(" Anné(s) 6: %.2f\n",MontantRestant);

		double annes7 = (double) (MontantRestant / 0.05);
		MontantRestant = MontantRestant  * 0.05 + MontantRestant;
		System.out.printf(" Anné(s) 7: %.2f\n", MontantRestant);

		double annees8 = (double) (MontantRestant / 0.05);
		MontantRestant= MontantRestant * 0.05 + MontantRestant;
		System.out.printf(" Anné(s) 8: %.2f\n", MontantRestant);

		double annees9 = (double) (MontantRestant / 0.05);
		MontantRestant= MontantRestant * 0.05 + MontantRestant;
		System.out.printf("Anné(s) 9: %.2f\n", MontantRestant);

		double annees10 = (double) (MontantRestant / 0.05);
		MontantRestant= MontantRestant * 0.05 + MontantRestant;
		System.out.printf("Anné(s) 10: %.2f\n", MontantRestant);

		}
	
	}
