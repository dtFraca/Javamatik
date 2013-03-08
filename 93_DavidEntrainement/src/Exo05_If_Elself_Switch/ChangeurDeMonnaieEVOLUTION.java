package Exo05_If_Elself_Switch;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-02-28 - david
 */
public class ChangeurDeMonnaieEVOLUTION {
    public static void main(String[] args) {
        System.out.print("Veuillez entrez une sommes: ");
        Scanner myScan = new Scanner(System.in);

        double montantInitial = myScan.nextDouble();
        int unitInitial = (int) montantInitial;
        int centInitial = (int) (100 * (montantInitial - unitInitial));
        System.out.printf("Montant initial: %.2f€\n Partie unitaire: %d\n Partie decimale: %d\n", montantInitial, unitInitial, centInitial);
        String pu = "Partie unitaire";
        String pd = "Partie décimale";

        System.out.println("________________________________________________________________________________________________");
        System.out.printf("%s: %d\n", pu.toUpperCase(), unitInitial);

        int unitRestant = 0;

        int billet100 = (int) (unitInitial / 100);
        unitRestant = unitInitial % 100;
        System.out.printf("Nombre de billet(s) de 100€:  %3d (reste %d€)\n", billet100, unitRestant);

        int billet50 = (int) (unitRestant / 50);
        unitRestant = unitRestant % 50;
        System.out.printf("_Nombre de billet(s) de 50€: %4d (reste %d€)\n", billet50, unitRestant);

        int billet20 = (int) (unitRestant / 20);
        unitRestant = unitRestant % 20;
        System.out.printf("_Nombre de billet(s) de 20€: %4d (reste %d€)\n", billet20, unitRestant);

        int billet10 = (int) (unitRestant / 10);
        unitRestant = unitRestant %10;
        System.out.printf("_Nombre de billet(s) de 10€: %4d (reste %d€)\n", billet50, unitRestant);

        int billet5 = (int) (unitRestant / 5);
        System.out.printf("__Nombre de billet(s) de 5€: %4d (reste %d)\n", billet5, unitRestant);

        System.out.println("________________________________________________________________________________________________");

        System.out.printf("%s: %d\n", pd.toUpperCase(), centInitial);

        int centRestant = 0;

        int piece50 = (int) (centInitial / 50);
        centRestant = centInitial % 50;
        System.out.printf("Nombre de pièce de 50: %d\n", piece50, centRestant);

        int piece20 = (int) (centRestant / 20);
        centRestant = centRestant % 20;
        System.out.printf("Nombre de pièce de 20: %d\n", piece20, centRestant);

        int piece10 = (int) (centRestant / 10);
        centRestant = centRestant % 10;
        System.out.printf("Nombre de pièce de 10: %d\n", piece10, centRestant);

        int piece5 = (int) (centRestant / 5);
        centRestant = centRestant % 5;
        System.out.printf("_Nombre de pièce de 5: %d\n", piece5, centRestant);

        int piece2 = (int) (centRestant / 2);
        centRestant = centRestant % 2;
        System.out.printf("_Nombre de pièce de 2: %d\n", piece2, centRestant);

        int piece1 = (int) (centRestant / 1);
        System.out.printf("_Nombre de pièce de 1: %d\n",piece1, centRestant);



    }
}
