package dtfraca.Exo05_If_ElseIf_Switch;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
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
			System.out.println("Gagner cadeau surprise (age < 18 et ne dans une annee bisextile");
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

		/*
		ERREUR: ne tient pas compte de la condition: "divisible par 400"
		EN PLUS: trop complique (difficile a lire)

		if (anneeNaissance % 4 == 0) {
			//System.out.println("L'année entrée est bisextile");

			if (anneeNaissance % 100 == 0) {
				System.out.println("L'année n'est pas bisextile (divisible par 4 ET par 100)");
			} else {
				System.out.println("L'année est bisextile");
			}

		} else {
			System.out.println("L'année n'est pas bisextile");
		}
		*/

		// Année bissextile: http://fr.wikipedia.org/wiki/Ann%C3%A9e_bissextile
		// Condition1: soit divisibles par 4 _ET_ non divisibles par 100
		// OU
		// Condition2: divisibles par 400

		boolean cond1Bissextile = (anneeNaissance % 4 == 0 && anneeNaissance % 100 > 0);
		boolean cond2Bissextile = (anneeNaissance % 400 == 0);

		if (cond1Bissextile || cond2Bissextile)
		{
			System.out.println("L'année est bisextile");
		}
		else {
			System.out.println("L'année n'est pas bisextile");
		}


		if (age <= 10 || age >= 60) {
			System.out.printf("Vous pouvez prendre le bus gratuitement (age = %d)\n", age);
		}
		else {
			System.out.printf("Vous devez payez votre ticket de bus (age = %d)\n", age);
		}
	}
}
