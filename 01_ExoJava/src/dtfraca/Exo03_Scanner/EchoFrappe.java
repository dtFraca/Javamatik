package dtfraca.Exo03_Scanner;

import java.util.Scanner;

public class EchoFrappe {

	/**
	 * Comment utiliser l'object Scanner pour lire le clavier
	 * 2013-01-27 - David
	 */
	public static void main(String[] args) {
		// Afficher la question
		System.out.print("Veuillez entrez votre nom: ");
	
		// capturer user input du clavier 
		Scanner myScanner = new Scanner(System.in);
		String username = myScanner.nextLine();
		myScanner.close();
		
		//afficher resulat
	
		System.out.printf("Votre nom est............: %s", username) ;
	}

}

