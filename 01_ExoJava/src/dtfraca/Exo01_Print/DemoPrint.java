package dtfraca.Exo01_Print;

public class DemoPrint {

	/**
	 * Jouer avec System.out.print
	 * 2013-01-27 - David
	 */
	public static void main(String[] args) {
		//print(): affiche SANS descendre à la ligne
		System.out.print("123456");
		System.out.print("#");

		//println(): afficher le texte ET descendre à la ligne
		System.out.println(); // println() sans texte = afficher une ligne vide
		System.out.println("Voici la deuxième ligne");

		System.out.println("Nombres non alignés (pas de formatage)");
		System.out.println(5);
		System.out.println(25);
		System.out.println(235 + " - NOTE: les nombres sont justifies a gauche");
		System.out.println();

		System.out.println("Nombres Alignés par printf()");
		System.out.printf("%5d - FORMAT: %%5d = longueur 5, completer a gauche par des espaces \n", 5);
		System.out.printf("%5d - FORMAT: %%5d\n", 25);
		System.out.printf("%05d - FORMAT: %%05d = longueur 5, completer a gauche par des 0\n", 250);

		// formatage de valeur decimale
		double prixPaquetde3 = 100.0;
		System.out.println();
		System.out.printf("Test1 - decimal non formaté........: %f / 3.0 = %f\n", prixPaquetde3, prixPaquetde3 / 3); //%f = resultat valeure flottante 
		System.out.printf("Test2 - decimal limité à 2 chiffres: %.2f / 3.0 = %.2f\n\n", prixPaquetde3, prixPaquetde3 / 3); //2 chiffres apres virgule

		// Pouquoi printf est plus pratique
		int monAge = 13;
		String monNom = "David";
		String debutTexte = "Je m'apelle";
		System.out.println(debutTexte + " " + monNom + ", j'ai " + monAge + " ans, qui fait " + monAge * 365 + " jours");
		System.out.printf("%s %s, j'ai %d ans, qui fait %d jours\n", debutTexte, monNom, monAge, monAge * 365);

		// autre format special de printf()
		System.out.printf("\tUn TAB avant d'afficher...\tVoici un autre TAB\tEt Re-TAB\n");
		System.out.printf("ABC\ta\tb\tC\t1\t2\t3\t€\t$\n");
	}

}
