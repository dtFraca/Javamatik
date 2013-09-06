package dtfraca.Exo05_If_ElseIf_Switch;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-03-19 - david
 */
public class LesMathsDuPauvre {
	public static void main(String[] args) {

		System.out.println("1. Calculer hypothénuse");
		System.out.println("2. Surface d’un cercle");
		System.out.println("3. Circonference d’un cercle");
		System.out.println("4. Convertir un nombre entier en binaire");
		System.out.println("5. 2 a la puissance N");
		System.out.print("VOTRE CHOIX: ");
		Scanner myScan = new Scanner(System.in);
		int choixMenu = myScan.nextInt();


		Scanner paramCalcul = new Scanner(System.in);

		switch (choixMenu) {
			case 1:
				System.out.print("Hypothénuse, donner valeur des deux petits côtés: ");
				double cote1 = paramCalcul.nextDouble();
				double cote2 = paramCalcul.nextDouble();
				double hypothenuse = Math.hypot(cote1, cote2);
				System.out.printf("c1 = %.2f, c2 = %.2f, Hypothénuse = %.2f\n", cote1, cote2, hypothenuse);
				break;

			case 2:
				System.out.print("Surface, donner valeur rayon: ");
				double rayon1 = paramCalcul.nextDouble();
				double surface = Math.PI * Math.pow(rayon1, 2);//rayon1 * rayon1;
				System.out.printf("Rayon = %.2f, Surface = %.2f", rayon1, surface);
				break;

			case 3:
				System.out.print("Circonference, donner valeur rayon: ");
				double rayon = paramCalcul.nextDouble();
				double circonference = Math.PI * rayon * 2;
				System.out.printf("La circonférence de votre rayon est (%.1f): %.2f", rayon, circonference);
				break;

			case 4:
				System.out.print("Conversion binaire, donner valeur décimal entière: ");
				int valeurAConvertir = paramCalcul.nextInt();
				System.out.printf("%d (base 10) = %s (base 2, binaire)", valeurAConvertir, Integer.toBinaryString(valeurAConvertir));
				break;

			case 5:
				System.out.print("2^N, donner valeur puissance N: ");
				int puissanceN = paramCalcul.nextInt();
				System.out.printf("2 à la puissance %d = %d", puissanceN, (int) Math.pow(2, puissanceN));
				break;


			default:
				System.out.print("Choix inconnu");
				break;
		}

	}
}
