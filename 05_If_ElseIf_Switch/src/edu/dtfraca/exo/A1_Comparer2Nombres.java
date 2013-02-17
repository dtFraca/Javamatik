package edu.dtfraca.exo;

import java.util.Scanner;

public class A1_Comparer2Nombres {

	/**
	 * Les tests conditionels
	 * 2013-01-27 - David
	 */
	public static void main(String[] args) {
		
		System.out.print("Veuillez entrez deux nombres entiers (séparés par espace): ");
		
		// capturer user input du clavier 
		Scanner myScanner = new Scanner(System.in);
		int n1 = myScanner.nextInt();
		int n2 = myScanner.nextInt();
		
		if (n1 < n2) {
			System.out.printf("%d est plus petit que %d\n", n1, n2);
		}
		
		if (n1 > n2) {
			System.out.printf("%d est plus grand que %d\n", n1, n2);
		}
		
		if (n1 == n2) {
			System.out.printf("%d est égal à %d\n", n1, n2);
		}

		if (n1 <= n2) {
			System.out.printf("%d est inférieur OU égal à %d\n", n1, n2);
		}
		
		if (n1 >= n2) {
			System.out.printf("%d est au moins égal OU supérieur à %d\n", n1, n2);
		}
		
	}

}
