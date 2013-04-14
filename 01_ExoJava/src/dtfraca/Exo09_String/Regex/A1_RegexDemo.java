package dtfraca.Exo09_String.Regex;

/**
 * Class Description: ?
 * <p/>
 * 2013-04-13 - tri
 */
public class A1_RegexDemo {
	public static void main(String[] args) {
		String monPrenom = "David", codePostal = "75400";

		System.out.printf("monPrenom = %s\n", monPrenom);
		System.out.printf("[A-Z][a-zA-Z]* : commence par majuscule et ne contient que des lettres? %s\n",
				monPrenom.matches("[A-Z][a-zA-Z]*"));

		System.out.println();
		System.out.printf("Code Postal: %s\n", codePostal);
		System.out.printf("\\d{5} : contient que 5 chiffres? %s", codePostal.matches("\\d{5}"));
	}
}
