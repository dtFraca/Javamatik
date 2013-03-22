package dtfraca.Exo05_If_ElseIf_Switch;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Divers usage de'operateurs logiques dans test IF: EGAL == , PAS EGAL != , ET && , OU ||
 *
 * 2013-03-17 - david
 */
public class OperateurLogique {
	public static void main(String[] args) {
		System.out.printf("Veuillez entrez votre année de naissance : ");
		Scanner myScan = new Scanner(System.in);
		int anneeNaissance = myScan.nextInt();
		int anneeCourante = Calendar.getInstance().get(Calendar.YEAR);
		int age = anneeCourante - anneeNaissance;

		if (anneeNaissance == 1987) {

		}

		else {
			System.out.println("Vous n'êtes pas né(e) en 1987");
		}

		if (age < 18 && anneeNaissance % 4 == 0) {
			System.out.println("Gagner cadeau surprise (age < 18 et né dans une année bissextile");
		}
		else {
			System.out.println("Pas de cadeau");
		}

		if (anneeNaissance % 2 == 0) {
			System.out.println("L'année que vous avez entrée est pair");
		}
		else {
			System.out.println("L'année que vous avez entrée est impair");
		}

		// Année bissextile: http://fr.wikipedia.org/wiki/Ann%C3%A9e_bissextile
		// Condition1: divisible par 4 _ET_ NON divisible par 100
		// OU
		// Condition2: divisible par 400

		boolean cond1Bissextile = (anneeNaissance % 4 == 0 && anneeNaissance % 100 != 0);
		boolean cond2Bissextile = (anneeNaissance % 400 == 0);

		// Test Equivalent (sans utiliser variables):
		// if ( (anneeNaissance % 4 == 0 && anneeNaissance % 100 != 0) || anneeNaissance % 400 )
		if (cond1Bissextile || cond2Bissextile) // equiv:
		{
			System.out.println("L'année est bissextile");
		}
		else {
			System.out.println("L'année n'est pas bissextile");
		}


		if (age <= 10 || age >= 60) {
			System.out.printf("Vous pouvez prendre le bus gratuitement (age = %d)\n", age);
		}
		else {
			System.out.printf("Vous devez payez votre ticket de bus (age = %d)\n", age);
		}
	}
}
