package dtfraca.Exo07_Array;

/**
 * Class Description: ?
 * <p/>
 * 2013-07-17 - david
 */
public class CalculMoyenneMinMaxV1 {
	public static void main(String[] args) {


		int aNombre [] = {166, 7, 6, 4, 12, 15, 37};

		int valeurMax = 0;
		int valeurMin = 90000;
		int moyenne = 0;

		for (int zz = 0;  zz < aNombre.length-1; zz++) {
			//System.out.printf("[%d]", aNombre[zz]);

			if (valeurMax < aNombre[zz] ) {
				valeurMax = aNombre[zz];
			}






			if (aNombre[zz] < valeurMin) {
			    valeurMin = aNombre[zz];

		}


			moyenne += aNombre[zz] ;
		}
		System.out.printf("\nLa valeur MAX est = %d", valeurMax);
		System.out.printf("\nMoyenne = %d", moyenne / aNombre.length);
		System.out.printf("\nValeur MIN = %d", valeurMin);

	}
}
