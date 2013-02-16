/**
 * Play Around with the Scanner object (text capture + parsing)
 */
package edu.dtfraca.BricoTri.Basic;

import java.util.Scanner;


public class ScannerPlayAround {

	public static void main(String[] args) {
		//int unUsedVar = 0; // Test Annotation navigation
		System.out.println("Please type anything: ");
		Scanner myScan = new Scanner(System.in);
		System.out.println(myScan.nextLine());
		System.out.println();
		
		//Scanner from a string
		String text1 = "EGit is an Eclipse plug-in (software component)";
		System.out.printf("Decomposer le texte \"%s\"\n", text1);
		myScan = new Scanner(text1);
		int kk = 0;
		while (myScan.hasNext()) {
			kk++; // kk = kk+1
			System.out.printf("%2d. %s\n", kk, myScan.next());
		}
	}

}
