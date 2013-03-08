package dtfraca.Exo02_DatatypeAndOperator;

/**
 * Class Description: ?
 * <p/>
 * 2013-02-26 - david
 */
public class CalculDecimal {
	public static void main(String[] args) {
		float f1 = 11f;
		float f2 = 3f;

		System.out.printf("Résultat type float.................................: %f / %f = %f\n", f1, f2, f1 / f2);
		System.out.printf("Résultat type float (deux chiffres après la virgule): %.2f / %.2f = %.2f\n", f1, f2, f1 / f2);

		System.out.printf("Racine carré de 50: %.5f\n", Math.sqrt(50d));// Sqrt = Square root
		System.out.printf("Valeur de Pi: %.5f\n", Math.PI);
	}
}
