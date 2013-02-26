package Exo03_Scanner;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-02-26 - david
 */
public class ReArrangerMotsV1 {
    public static void main(String[] args) {
        System.out.print("Veuillez entrez 3 mots (séparé d'un espace): ");
        Scanner myScan = new Scanner(System.in);

        String mot1 = myScan.next();
        String mot2 = myScan.next();
        String mot3 = myScan.next();

        System.out.printf("La phrase a été ré-arrangé: %s %s %s", mot3, mot2, mot1);

    }
}
