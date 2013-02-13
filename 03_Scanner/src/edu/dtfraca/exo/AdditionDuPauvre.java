package edu.dtfraca.exo;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * tri - 2/13/13
 * To change this template use File | Settings | File Templates.
 */

public class AdditionDuPauvre {

    public static void main(String[] args) {

        System.out.print("Veuillez entrez deux nombres entiers (séparés par espace): ");

        // capturer user input du clavier
        Scanner myScanner = new Scanner(System.in);

        int n1 = myScanner.nextInt();
        int n2 = myScanner.nextInt();

        System.out.printf("%d + %d = %d", n1, n2, n1 + n2 );

    }

}