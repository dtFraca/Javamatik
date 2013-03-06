package dtfraca.Exo02_DatatypeAndOperator;

/**
 * Class Description: ?
 * <p/>
 * 2013-02-26 - david
 */
public class ExplorerString {
	public static void main(String[] args) {
		String demoTxt = "Électricité : la facture pourrait bondir de 30% d'ici à 2017";
		System.out.printf("%s\n", demoTxt);
		System.out.println("012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789");
		System.out.println("____________________________________________________________________________________________");
		System.out.printf("Mise en majuscule: %s\n", demoTxt.toUpperCase());
		System.out.printf("Mise en minuscule: %s\n", demoTxt.toLowerCase());
		System.out.printf("Replace: %s\n", demoTxt.replace('e', '$'));
		System.out.printf("Longueur du texte: %d\n", demoTxt.length());
		System.out.printf("Extraction 11ème à 30ème caractère: [%s]\n", demoTxt.substring(10, 29));
		System.out.printf("Les six première lettres: [%s]\n", demoTxt.substring(0, 6));
		System.out.printf("Reste du texte à partir de 41ème position: [%s]\n", demoTxt.substring(40));
		System.out.printf("Position du mot \"facture\": %d\n", demoTxt.indexOf("facture"));
		System.out.printf("Extraire le mot \"bondir\" et le mettre en majuscule: [%s]\n", demoTxt.substring(34, 40).toUpperCase());
		String monNom = "david";
		System.out.printf("Hashcode de \"%s\": %s", monNom, monNom.hashCode());
	}
}
