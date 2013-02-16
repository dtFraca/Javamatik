package edu.dtfraca.BricoTri.Basic;

import java.util.Scanner;


public class DavidVousDitBonjour {

	/*
	 * Un bloc de commentaires delimite par 
	 * 
	 */
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Taper un text quelconque: ");
		String laReponse = myScanner.nextLine();
		
		// Ceci est un commentaire simple
		System.out.println(); // Ceci sera ignorer kdkdkdk
		System.out.println("~" + laReponse + "~ a " + laReponse.length() + " caracteres");
			
	}

}
