package Exo03_Scanner;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-02-24 - david
 */
public class AdditionDuPauvre {
    public static void main(String[] args) {
        System.out.print("Veuillez entrez deux nombres (séparé d'un espace): ");
        Scanner myScan = new Scanner(System.in);
        int n1 = myScan.nextInt();
        int n2 = myScan.nextInt();
        System.out.printf("%d plus %d font %d", n1, n2, n1 + n2);
    }
}
