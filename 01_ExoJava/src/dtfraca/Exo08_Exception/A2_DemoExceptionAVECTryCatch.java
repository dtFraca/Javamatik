package dtfraca.Exo08_Exception;

import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Gestion d'erreur par try/catch pour eviter java runtime erreur
 * 1. Chaque exception doit avoir un catch() correspondant. Per example, si l'on veut intercepter
 * 3 types d'erreur specifiques, on doit utiliser 3 different catch
 * <p/>
 * 2. catch generique (capture toute type d'erreur): catch (Exception ex)
 * <p/>
 * 3. ignorer toute exception: catch {} - ATTN: c'est irresponsable, a deconseiller
 * <p/>
 * 4. System.err.print (NOTE: err au lieu de out) affiche en rouge dans la console
 * <p/>
 * Ce programme CAUSERA une erreur runtime, parce que:
 * - Soit parce que le nb entre n'est pas un nombre entier (ex: abc ou 12.34)
 * - S'il est un nombre, printf causera une erreur a cause du formatage (erreur de type de donnee)
 * <p/>
 * 2013-02-18 - tri
 */
public class A2_DemoExceptionAVECTryCatch {
	public static void main(String[] args) {

		System.out.println("Calcul de Racine Carree (Math.sqrt(n1))");
		System.out.println("Erreur si n1 n'est pas un nombre entier");
		System.out.println("-------------------------------------------\n");
		Scanner myScan = new Scanner(System.in);
		System.out.print("Veuillez entrer un nombre (pour calculer Racine Carree): ");

		try {
			int n1 = myScan.nextInt();

			//System.out.printf("\nSqrt(%d) = %f\n", n1, Math.sqrt(n1));
			System.out.printf("\nRESULTAT: Sqrt(%.0f) = %f\n", n1, Math.sqrt(n1));
		} catch (InputMismatchException e1) {
			// InputMismatchException = cause par myScan.nextInt() lorsque l'input n'est pas un nombre
			System.out.println("\n\nL'input n'est pas un nombre");
			System.out.printf("EXCEPTION: %s\n\n", e1.toString());
		} catch (IllegalFormatConversionException e2) {
			// cause par printf(): mauvais data type qui ne correspond pas au format, par Ex: %s pour afficher un nombre
			System.out.println("\n\nMauvais format % dans print(), Verifier datatype SVP");
			System.out.printf("EXCEPTION: %s\n\n", e2.toString());
		}

		System.out.println("* - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - *");
		System.out.println("  FIN NORMAL DU PROGRAMME");
		System.out.println("* - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - *");

	}
}
