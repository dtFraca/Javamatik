package dtfraca.Exo03_Scanner;

import java.util.Scanner;

/**
 * Scanner.next() pour extraire les mots.
 * User: david
 * Date: 2/17/13
 * Time: 6:41 PM
 */
public class ReArrangerMots {
    public static void main(String[] args) {

        String txtBidon = "La feuille verte";

        Scanner myScan = new Scanner(txtBidon);

        String mot1 = myScan.next();
        String mot2 = myScan.next();
        String mot3 = myScan.next();

        System.out.printf("Texte original: %s\n", txtBidon);
        System.out.println("------------------------------------------------------------");
        System.out.printf("Mot 1 : %s\n", mot1);
        System.out.printf("Mot 2 : %s\n", mot2);
        System.out.printf("Mot 3 : %s\n", mot3);
        //System.out.printf("Mot 4 : %s\n", myScan.next());

        System.out.printf("Phrase ré-arrangée : %s, %s, %s\n",mot3, mot2, mot1);


    }

}