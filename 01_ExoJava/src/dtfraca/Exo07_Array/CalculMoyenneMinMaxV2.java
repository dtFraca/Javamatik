package dtfraca.Exo07_Array;

import java.io.PrintStream;

/**
 * Class Description: ?
 * <p/>
 * 2013-07-19 - david
 */
public class CalculMoyenneMinMaxV2 {
	public static void main(String[] args) {
		int aNombre[] = {144, 233, 655, 77};
		int maxVal = 0;
		int minVal = 0;
		double moyenne = 0;
		for (int zz = 0; zz < aNombre.length; zz++) {
			maxVal = Math.max(maxVal, aNombre[zz]);
			minVal = Math.min(maxVal, aNombre[zz]);
			moyenne += aNombre[zz];
		}

		System.out.printf("Valeur max = %d\n", maxVal);
		System.out.printf("Valeur min = %d\n", minVal);
		System.out.printf("Moyenne = %.2f", moyenne / aNombre.length);
	}
}
