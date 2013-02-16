package edu.dtfraca.exo;

import java.util.Scanner;

public class ChangeurDeMonnaie {

	/**
	 * Changeur de Monnaie:
	 * Notions: Operateur Modulo, Test IF, variables, data type double (flottant, double precision)
	 * 2013-01-29 - Tri & David
	 */
	public static void main(String[] args) {
		//------------------------------------------------------
		// Quelques exemples de l'operateur modulo % 
		//------------------------------------------------------
		System.out.printf("Modulo, Exemple 1:   7 %%  4 = %d\n", (7 % 4)); // %% pour afficher le caractere %
		System.out.printf("Modulo, Exemple 2: 125 %% 20 = %d\n\n", (125 % 20));
		
		
		
System.out.print("Veuillez entrez une somme: ");
		
		// capturer user input du clavier 
		Scanner myScanner = new Scanner(System.in);

		double montantInitial = myScanner.nextDouble();
		int unitINITIAL = (int) montantInitial; // partie Euro/Dollar SANS les centimes
		int centimeINITIAL = (int) (100 * (montantInitial - unitINITIAL)); // partie centimes
		
		
		System.out.printf("Montant Initial: $%.2f: Partie Unitaire: %d, Partie Decimal: %d\n\n",
				montantInitial, unitINITIAL, centimeINITIAL);
		
		//------------------------------------------------------
		// Partie Unitaire (les Dollars/Euros SANS les centimes)
		//------------------------------------------------------
		
		System.out.printf("Partie Unitaire $%d (les Dollars/Euros SANS les centimes)\n", unitINITIAL);
		System.out.println("-----------------------------------------------------");
		
		int unitRestant = 0 ; // declare a l'avance, cette variable va etre re-utilisee plusieurs fois
		
		int billet100 = (int) (unitINITIAL / 100); // division entiere (ignorant les decimal apres virgule)
		unitRestant = unitINITIAL % 100; // Modulo 100 = le restant apres division par 100
		System.out.printf("Nombre de billets de $100: %3d (reste $%d)\n", billet100, unitRestant);
		
		int billet50 = (int) (unitRestant / 50); // <---ATTENTION: cette fois-ci le calcul demarre par la valeur restante (et non pas INITIAL)
		unitRestant = unitRestant % 50;
		System.out.printf("Nombre de billets de  $50: %3d (reste $%d)\n", billet50, unitRestant);
		
		int billet20 = (int) (unitRestant / 20);
		unitRestant = unitRestant % 20;
		System.out.printf("Nombre de billets de  $20: %3d (reste $%d)\n", billet20, unitRestant);
		
		int billet10 = (int) (unitRestant / 10);
		unitRestant = unitRestant % 10;
		System.out.printf("Nombre de billets de  $10: %3d (reste $%d)\n", billet10, unitRestant);
		
		int billet5 = (int) (unitRestant / 5);
		unitRestant = unitRestant % 5;
		System.out.printf("Nombre de billets de   $5: %3d (reste $%d)\n", billet5, unitRestant);

		int piece2 = (int) (unitRestant / 2);
		unitRestant = unitRestant % 2;
		System.out.printf("Nombre de pieces  de   $2: %3d (reste $%d)\n", piece2, unitRestant);

		int piece1 = (int) (unitRestant / 1);
		unitRestant = unitRestant % 1;
		System.out.printf("Nombre de pieces  de   $1: %3d (reste $%d)\n", piece1, unitRestant);


		if (unitRestant == 0) {
			System.out.println("Fini pour la partie Unitaire\n");
		} else {
			System.out.println("ALERTE: partie Unitaire pas encore Finie\n");
		}
		
		//------------------------------------------------------
		// Partie Decimal (les centimes)
		//------------------------------------------------------
	
		System.out.printf("Partie décimale .%d (Les centimes)\n", centimeINITIAL);
		System.out.println("-----------------------------------------------------");
		
		
		int centimesRestant = 0 ;
		

		int piece50cent = (int) (centimeINITIAL / 50);
		centimesRestant = centimeINITIAL % 50;
		System.out.printf("Nombre de pièce de 50 centimes : %3d (reste $%d)\n", piece50cent, centimesRestant);
		
		int piece20cent = (int) (centimesRestant / 20);
		centimesRestant = centimesRestant % 20;
		System.out.printf("Nombre de pièce de 20 centimes : %3d (reste $%d)\n", piece20cent, centimesRestant);
		
		int piece10cent = (int) (centimesRestant / 10);
		centimesRestant = centimesRestant % 10;
		System.out.printf("Nombre de pièce de 10 centimes : %3d (reste $%d)\n", piece10cent, centimesRestant);
		
		int piece5cent = (int) (centimesRestant / 5);
		centimesRestant = centimesRestant % 5;
		System.out.printf("Nombre de pièce de  5 centimes : %3d (reste $%d)\n", piece5cent, centimesRestant);
		
		int piece2cent = (int) (centimesRestant / 2);
		centimesRestant = centimesRestant % 2;
		System.out.printf("Nombre de pièce de  2 centimes : %3d (reste $%d)\n", piece2cent, centimesRestant);
		
		int piece1cent = (int) (centimesRestant / 1) ;
		centimesRestant = centimesRestant %1 ;
		System.out.printf("Nombre de pièce de  1  centime : %3d (reste $%d)\n", piece1cent, centimesRestant) ;		


		
	 }
	
}

		
	