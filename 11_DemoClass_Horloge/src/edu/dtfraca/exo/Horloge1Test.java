package edu.dtfraca.exo;

public class Horloge1Test {

	/**
	 * Class pour tester la classes Horloge1
	 * 1. Un membre prive de la classe n'est pas visible en dehors du code de la class
	 * 2. Une erreur runtime, peut etre attrapee par try/catch (le programme n'est pas interrompu)
	 * 
	 * 2013-02-05 - Tri
	 */
	public static void main(String[] args) {
		//creer une instance de Horloge1
		Horloge1 horlo1 = new Horloge1();
		
		//-----------------------------------
		// IMPORTANT: les membres prives de la classe
		// ne sont pas accessible en dehors de la classe 
		//-----------------------------------
		//horlo1._hour = 21; // INCORRECT, Raison: 
		
		System.out.printf("horlo1.toString24H() -> %s\n", horlo1.toString24H());
		System.out.printf("horlo1.toStringUS()  -> %s\n", horlo1.toStringUS());

		//Regler heure: 21:46:33
		horlo1.setTime(21, 46, 33);
		System.out.println();
		System.out.printf("horlo1.toString24H() -> %s\n", horlo1.toString24H());
		System.out.printf("horlo1.toStringUS()  -> %s\n", horlo1.toStringUS());
		System.out.println();

		//ERREUR: Heure illogique - NOTE: l'erreur est interceptee par try/catch (le programme peut continuer)
		try {
			horlo1.setTime(25, 22, 33); // Erreur: heure ne peut pas > 23
		}
		catch (IllegalArgumentException e) {
			System.out.printf("ERREUR: %s\n", e.getMessage());
		}

		//ERREUR: Minute illogique - NOTE l'erreur interrompt le programme immediatement
		horlo1.setTime(21, 68, 33); // Erreur: minute ne peut pas > 60

		//ERREUR: Second illogique
		horlo1.setTime(21, 22, 83); // Erreur: second ne peut pas > 60
		
		
		System.out.println("\n************ FIN NORMAL (Sans Erreur) *****************");
	}

}
