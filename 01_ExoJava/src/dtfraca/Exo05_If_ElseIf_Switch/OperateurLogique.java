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
		//int age = 2013 - anneeNaissance;

		if (anneeNaissance % 2 == 0) {
			System.out.println("L'année que vous avez entrée est pair");
		}

		else {
			System.out.println("L'année que vous avez entrée est impair");
		}

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



		if (age <= 10 || age >= 60) {
			System.out.printf("Vous pouvez prendre le bus gratuitement (age = %d)\n", age);
		}
		else {
			System.out.printf("Vous devez payez votre ticket de bus (age = %d)\n", age);
		}
	}
}
