package Exo07_Array;

import java.util.Random;

/**
 * Class Description: ?
 * <p/>
 * 2013-06-25 - david
 */
public class Bataille {
	public static void main(String[] args) {

		System.out.println("***** Cartes disponible *****");

		String[] aCOULEUR = {"Trèfle", "Pique", "Carreau", "Coeur"};
		String[] aCARTE = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

		for (int zzCOULEUR = 0; zzCOULEUR < aCOULEUR.length; zzCOULEUR++) {
			for (int zzCARTE = 0; zzCARTE < aCARTE.length; zzCARTE++) {
				System.out.printf("%s %s\n", aCOULEUR[zzCOULEUR], aCARTE[zzCARTE]);
			}
		}

	}
}
