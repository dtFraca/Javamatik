package dtfraca.Exo04_Boucle_FOR_WHILE;

/**
 * Balayer un string par boucle FOR
 *
 * 2013-03-17 - tri
 */
public class ReverseString {
	public static void main(String[] args) {
		String myText = "BizarRoide";

		System.out.print("FOR Loop FORWARD : ");
		for (int i = 0; i < myText.length(); i++)
		{
			System.out.printf("%s . ", myText.substring(i, i+1) );
		}

		System.out.print("\nFOR Loop BACKWARD: ");
		for (int i = myText.length() -1; i >= 0; i--)
		{
			System.out.printf("%s . ", myText.substring(i, i+1) );
		}
	}
}
