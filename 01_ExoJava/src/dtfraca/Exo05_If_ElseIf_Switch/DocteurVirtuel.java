package dtfraca.Exo05_If_ElseIf_Switch;

import java.util.Scanner;

/**
 * Apprendre structure IF...ELSE IF...ELSE
 * <p/>
 * 2013-03-19 - david
 */
public class DocteurVirtuel {
	public static void main(String[] args) {

		Scanner myScan = new Scanner(System.in);
		System.out.print("Veuillez entrez vos symptomes: ");
		String descripMaladie = myScan.nextLine().toUpperCase();
		String msgDocteur;

		if (descripMaladie.contains("TOUSSE") && descripMaladie.contains("SANG")) {
			msgDocteur = "Tuberculose";
		} else if (descripMaladie.contains("TOUSSE") && descripMaladie.contains("GORGE")) {
			msgDocteur = "Angine aigue";
		} else if (descripMaladie.contains("GORGE")) {
			msgDocteur = "Angine";
		} else if (descripMaladie.contains("TETE")) {
			msgDocteur = "Migraine";
		} else if (descripMaladie.contains("FATIGUE")) {
			msgDocteur = "Besoin d'exercices";
		} else if (descripMaladie.contains("TOUSSE")) {
			msgDocteur = "Toux sèche";
		} else {
			msgDocteur = "Maladie inconnue";
		}
		System.out.printf("Votre maladie: %s\n", msgDocteur);


	}
}
