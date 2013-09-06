package dtfraca.Exo06_Random;

import java.util.Random;

/**
 * Class Description: ?
 * <p/>
 * 2013-05-09 - david
 */
public class MatchAleatoire {
	public static void main(String[] args) {

		Random rndGenerateur = new Random();

		int teamOne = rndGenerateur.nextInt(120);
		int teamTwo = rndGenerateur.nextInt(120);

		System.out.println("Match terminé");

		System.out.printf("Team One = %d\n", teamOne);

		System.out.printf("Team Two = %d\n", teamTwo);

		if (teamOne > teamTwo) {
			System.out.println("Team 1 a gagné");
		}

		if (teamOne < teamTwo) {
			System.out.println("Team 2 a gagné");
		}

		if (teamOne == teamTwo) {
			int teamOnePROG = rndGenerateur.nextInt(20);
			int teamTwoPROG = rndGenerateur.nextInt(20);
			System.out.println("Passage en prolongation");

			if (teamOnePROG > teamTwoPROG) {
				System.out.printf("Team 1 après PROG");
			} else if (teamOnePROG < teamTwoPROG) {
				System.out.printf("Team 2 après PROG");

			}


		}
	}
}