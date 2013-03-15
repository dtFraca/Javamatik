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
		double unitInitial = (double) montantInitial;
		System.out.printf("Montant Initial : %4f\n\n", montantInitial);
		
		double unitRestant = 0;

		double annee1 = (double) (unitInitial * 0.05);
		unitRestant = unitInitial * 0.05 + unitInitial ;
		System.out.printf(" Anné(s) 1: %.2f\n" , unitRestant);

		double annees2 = (double) (unitRestant / 0.05 );
		unitRestant = unitRestant  * 0.05 + unitRestant;
		System.out.printf(" Anné(s) 2: %.2f\n", unitRestant);


		double annees3 = (double) (unitRestant  / 0.05);
		unitRestant = unitRestant  * 0.05 + unitRestant;
		System.out.printf(" Anné(s) 3: %.2f\n",unitRestant);

		double annees4 = (double) (unitRestant  / 0.05);
		unitRestant = unitRestant  * 0.05 + unitRestant;
		System.out.printf(" Anné(s) 4: %.2f\n",unitRestant);

		double annees5 = (double) (unitRestant  / 0.05);
		unitRestant = unitRestant  * 0.05 + unitRestant;
		System.out.printf( "Anné(s) 5: %.2f\n", unitRestant);

		double annes6 = (double) (unitRestant  / 0.05);
		unitRestant = unitRestant  * 0.05 + unitRestant;
		System.out.printf(" Anné(s) 6: %.2f\n",unitRestant);

		double annes7 = (double) (unitRestant / 0.05);
		unitRestant = unitRestant  * 0.05 + unitRestant;
		System.out.printf(" Anné(s) 7: %.2f\n", unitRestant);

		double annees8 = (double) (unitRestant / 0.05);
		unitRestant= unitRestant * 0.05 + unitRestant;
		System.out.printf(" Anné(s) 8: %.2f\n", unitRestant);

		double annees9 = (double) (unitRestant / 0.05);
		unitRestant= unitRestant * 0.05 + unitRestant;
		System.out.printf("Anné(s) 9: %.2f\n", unitRestant);

		double annees10 = (double) (unitRestant / 0.05);
		unitRestant= unitRestant * 0.05 + unitRestant;
		System.out.printf("Anné(s) 10: %.2f\n", unitRestant);

		}
	
	}
