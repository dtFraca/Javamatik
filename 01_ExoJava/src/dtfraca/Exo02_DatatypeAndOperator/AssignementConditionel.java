package dtfraca.Exo02_DatatypeAndOperator;

import java.util.Scanner;

/**
 * Class Description: ?
 * <p/>
 * 2013-03-04 - david
 */
public class AssignementConditionel {
    public static void main(String[] args) {

        System.out.print("Veuillez entrez une note: ");

        Scanner myScan = new Scanner(System.in);

        Double laNote = myScan.nextDouble();

        if (laNote<12) {
            System.out.printf("Echec, %f est en-dessous de 12", laNote);
        }

        if(laNote>12) {
            System.out.printf("Passe, %f est au-dessus de 12", laNote);
        }

        if (laNote==12) {
            System.out.printf("Passe, %f est égal à 12", laNote);
        }
    }
}
