package dtfraca.Exo04_Boucle_FOR_WHILE;

/**
 * Class Description: ?
 * <p/>
 * 2013-03-09 - david
 */
public class TableAscii {
	public static void main(String[] args) {

		for (int codeAscii = 32; codeAscii <= 255; codeAscii++) {
			char charLettre = (char) codeAscii;
			System.out.printf("%3d\t%c\n", codeAscii, charLettre);


		}
	}
}
