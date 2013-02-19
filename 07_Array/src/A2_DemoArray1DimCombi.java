public class A2_DemoArray1DimCombi {

	/**
	 * Croiser (multiplier) 2 Arrays 1D pour faire des combinaisons. Example:
	 * . Array1 a  4 éléments
	 * . Array2 a 13 éléments
	 * . A1 x A2 = 4 x 13 = 52 éléments
	 * 
	 * 2013-02-04 - Tri
	 */
	public static void main(String[] args) {
		//----------------------------------------
		// Un Jeux de Carte : 
		// (Deux Arrays separee, chacune de 1 dimension)
		//----------------------------------------
		String[] aCouleur = {"Coeur", "Carreau", "Trefle", "Pique"};
		String[] aCarte   = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		
		//System.out.println();
		for (int iCoul = 0; iCoul < aCouleur.length; iCoul++) {
			for (int iCard = 0; iCard < aCarte.length; iCard++) {
				System.out.printf("%3s %s\n", aCarte[iCard], aCouleur[iCoul]);
			}
			// une ligne vide pour mieux separer les blocs de chaque couleur
			System.out.println("-------------------");
		}
	}

}
