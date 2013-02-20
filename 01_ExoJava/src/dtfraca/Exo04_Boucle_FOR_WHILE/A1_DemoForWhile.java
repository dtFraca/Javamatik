package dtfraca.Exo04_Boucle_FOR_WHILE;

public class A1_DemoForWhile {

	/**
	 * Exemple elementaire de boucles For & While. Notion a apprendre:
	 * 1. FOR  : a utiliser qd on connait le nombre exact d'iterations
	 * 2. WHILE: a utiliser qd on ne sait pas forcement le nb de boucles,
	 *           mais on connait la fin de la condition de boucle
	 * 3. Il est possible de quitter une boucle par l'instruction break  
	 * 4. kk++ (ou ++kk) signifie kk = kk +1
	 * 
	 * 2013-02-03 - Tri
	 */
	public static void main(String[] args) {
		//---------------------------------------
		// boucle FOR
		//---------------------------------------
		System.out.print("FOR Simple: ");
		for (int kk = 0; kk < 15; kk++) {
			System.out.printf("%d, ", kk);
		}

		//-------------------------------------------------
		// boucle FOR imbriquee dans une autre boucle FOR
		//-------------------------------------------------
		System.out.println("\n\n2 x FOR imbriquees");
		for (int indexExt = 0; indexExt < 5; indexExt++) {
			System.out.printf("Boucle Ext# %d:\t", indexExt); //indice de la boucle EXTERIEURE 
			for (int indexInt = 0; indexInt < 10; indexInt++) {
				System.out.print("x ");
			}
			System.out.println();
		}
		
		
		//---------------------------------------
		// boucle WHILE #1 (imite exactement FOR)
		// la condition de fin de boucle est connu d'avance dans la condition while ()
		//---------------------------------------
		System.out.print("\n\nWHILE 1: ");
		int kk = 0;
		while (kk < 15) {
			System.out.printf("%d, ", kk);
			kk++;
		}

		//---------------------------------------
		// boucle WHILE #2 (boucle infinie)
		// la condition de fin de boucle est connu durant l'execution de la boucle
		//---------------------------------------
		System.out.print("\nWHILE 2: ");
		kk = 0;
		while (true) {
			System.out.printf("%d, ", kk);
			kk++;
			
			// durant l'execution de la boucle, quitter par break selon certaine condition 
			if (kk >= 6) {
				break;
			}
		}
		
		//---------------------------------------
		// FOR pour afficher l'alphabet
		// Code Ascii: http://www.ascii-code.com/
		//---------------------------------------
		System.out.println("\n\nAlphabet: A-Z (code Ascii 65 -> 90)");
		for (int codeAscii = 65; codeAscii <= 90; codeAscii++) {
			char charLettre = (char) codeAscii; // convert int -> char
			System.out.printf("%s", charLettre);
		}
		
		System.out.println("\n\nAlphabet: a-z (code Ascii 97 -> 122)");
		for (int codeAscii = 97; codeAscii <= 122; codeAscii++) {
			char charLettre = (char) codeAscii; // convert int -> char
			System.out.printf("%s", charLettre);
		}
			
		
	}

}
