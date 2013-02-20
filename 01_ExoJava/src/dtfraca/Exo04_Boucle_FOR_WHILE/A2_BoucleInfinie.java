package dtfraca.Exo04_Boucle_FOR_WHILE;

public class A2_BoucleInfinie {

	/**
	 * Boucle infinie, est une boucle qui ne s'arrete jamais
	 * Souvent a cause d'une erreur de programmation -> Le programme est plante et l'ordinateur devient lent
	 * 2013-02-03 - Tri
	 */
	public static void main(String[] args) {
		int kk = 0;
		while (true) {
			System.out.printf("%d - STOP: Clicker sur l'icon Stop de console\n", kk);
			kk++;
		}
	}

}
