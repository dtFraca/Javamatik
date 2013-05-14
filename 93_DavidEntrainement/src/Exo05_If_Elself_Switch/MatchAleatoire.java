package Exo05_If_Elself_Switch;

import java.util.Random;

/**
 * Class Description: ?
 * <p/>
 * 2013-05-09 - david
 */
public class MatchAleatoire {
	public static void main(String[] args) {

	Random rndGenerateur = new Random();

	int teamOne = 0 + rndGenerateur.nextInt(120 - 0);
	int teamTwo = 0 + rndGenerateur.nextInt(120 - 0);

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
		int teamOnePROG = 0 + rndGenerateur.nextInt(20 - 0);
		int teamTwoPROG = 0 + rndGenerateur.nextInt(20 - 0);
		System.out.println("Passage en prolongation");
		if (teamOnePROG > teamTwoPROG) {
			System.out.printf("Team 1 après PROG");
		}
		else {
			System.out.printf("Team 2 après PROG");

			}
		}
	}
}