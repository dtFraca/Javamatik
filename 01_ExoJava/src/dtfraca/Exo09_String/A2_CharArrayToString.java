package dtfraca.Exo09_String;

/**
 * Conversion
 * 1. String to char array
 * 2. char array to string
 * <p/>
 * 2013-03-13 - tri
 */
public class A2_CharArrayToString {
	public static void main(String[] args) {

		//----------------------------------------------------
		// Exemple 1: String -> char[]
		//----------------------------------------------------
		String bogusTxt = "Éphémère 123!@#";
		char[] listChars = bogusTxt.toCharArray();
		System.out.printf("Ex #1 (String -> char[]): %s\n", bogusTxt);
		for (int kk = 0; kk < listChars.length; kk++) {
			char unChar = listChars[kk];
			System.out.printf("%2d. %c (%3d) - %c - %c\n", kk,
					unChar,
					(int) unChar, // code Ascii
					Character.toUpperCase(unChar), // NOTE: var.toUpperCae() doesn't exist !
					Character.toLowerCase(unChar)  // NOTE: var.toLowerCae() doesn't exist !
			);
		}


		//----------------------------------------------------
		// Exemple 2: char[] -> String
		//----------------------------------------------------
		char[] bogusChars = {'B', 'o', 'n', 'J', '0', 'u', 'R', ' ', '!'};
		String mot1 = new String(bogusChars);
		System.out.printf("\nEx #2 (char[] -> String): %s\n", mot1);

	}
}
