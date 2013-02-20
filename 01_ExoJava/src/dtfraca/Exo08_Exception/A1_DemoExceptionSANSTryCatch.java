package dtfraca.Exo08_Exception;

import java.util.Scanner;

/**
 * Program SANS AUCUNE gestion d'erreur: en cas d'erreur, Java affiche le message d'erreur et quitte immediatement
 * Ce programme CAUSERA une erreur runtime, parce que:
 * - Soit parce que le nb entre n'est pas un nombre entier (ex: abc ou 12.34)
 * - S'il est un nombre, printf causera une erreur a cause du formatage (erreur de type de donnee)
 *
 * 2013-02-18 - tri
 */
public class A1_DemoExceptionSANSTryCatch {
    public static void main(String[] args) {

        System.out.println("Calcul de Racine Carree (Math.sqrt(n1))");
        System.out.println("Erreur si n1 n'est pas un nombre entier");
        System.out.println("-------------------------------------------\n");
        Scanner myScan = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre (pour calculer Racine Carree): ");

        int n1 = myScan.nextInt();

        //System.out.printf("\nSqrt(%d) = %f\n", n1, Math.sqrt(n1));
        System.out.printf("\nRESULTAT: Sqrt(%.0f) = %f\n", n1, Math.sqrt(n1));

        //------------------
        // ATTN: a cause de l'erreur runtime, cette sequence ne sera JAMAIS executee
        //------------------
        System.out.println("* - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - *");
        System.out.println("  FIN NORMAL DU PROGRAMME");
        System.out.println("* - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - *");

    }
}
