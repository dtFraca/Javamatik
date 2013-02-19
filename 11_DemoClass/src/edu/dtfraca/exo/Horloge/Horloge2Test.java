package edu.dtfraca.exo.Horloge;

public class Horloge2Test {

	/**
	 * Test class edu.dtfraca.exo.Horloge.Horloge2
	 */
	public static void main(String[] args) {
		Horloge2 h1 = new Horloge2();          // 00:00:00
		Horloge2 h2 = new Horloge2(19);        // 19:00:00
		Horloge2 h3 = new Horloge2(23, 46);    // 23:46:00
		Horloge2 h4 = new Horloge2(8, 3, 6);   //  8: 3: 6
		Horloge2 h5 = new Horloge2(h4);        //  identique a h4
		
		System.out.printf("H1: %s - %s\n", h1.toString24H(), h1.toStringUS());
		System.out.printf("H2: %s - %s\n", h2.toString24H(), h2.toStringUS());
		System.out.printf("H3: %s - %s\n", h3.toString24H(), h3.toStringUS());
		System.out.printf("H4: %s - %s\n", h4.toString24H(), h4.toStringUS());
		System.out.printf("H5: %s - %s\n", h5.toString24H(), h5.toStringUS());
		
		// Tester Accessor setxxx()
		h5.setHour(17);
		h5.setSecond(47);
		System.out.printf("H5: %s - %s - After h5.setHour(17) & setSecond(47)\n", h5.toString24H(), h5.toStringUS());

		// Tester Accessor getxxx()
		System.out.println();
		System.out.printf("H5: h5.getHour() = %d , h5.getMinute() = %d , h5.getSecond() = %d\n", h5.getHour(), h5.getMinute(), h5.getSecond());

		
		System.out.println();

		//---------------------------------------------------
		//  Forcer valeur Invalide to cause runtime error
        //---------------------------------------------------
        /*
		h1.setHour(24);
		h1.setMinute(61);
		h1.setSecond(77);
		*/

		System.out.println("\n************ FIN NORMAL (Sans Erreur) *****************");
	}

}
