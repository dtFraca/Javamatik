package dtfraca.Exo03_Scanner;

import java.util.Scanner;

public class CompterMotsV2 {

    /**
     * Notions a apprendre:
     * 1. Boucle while
     * 2. Operateur ++ pour incrementer par +1 la valeur d'une variable
     * 3. Scanner: peut etre instancie par un string directement (sans attendre frappe au clavier)
     * 4. Scanner: extraire un mot par methode .next()
     *
     * 2013-02-02 - Tri
     */
    public static void main(String[] args) {
        //Scanner myScan = new Scanner(System.in); //capturer texte par user input au clavier

        String txtBidon = "Sur le pont d'avignon"; // NOTE: les espaces a la fin ne comptent pas pour un mot
        Scanner myScan = new Scanner(txtBidon);
        int kk = 0;

        System.out.printf("Le texte: %s\n", txtBidon);
        System.out.println("------------------------------------------------------------");

        // tant que myScan a encore qqc execute le code inclus dans le bloc defini dans {}
        while (myScan.hasNext()) {
            kk++; // equivalent de kk = kk+1

            // extraire le mot suivant: un mot est un string qui se trouve entre 2 espaces
            // NOTE: les ponctuations sont ignorees
            String unMot = myScan.next();
            //myScan.next();

            System.out.printf("%d - %s\n", kk, unMot);
        }

    }

}
