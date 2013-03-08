package dtfraca.Exo07_Array;

public class A3_DemoArrayMultiDim {


	/**
	 * Demo Array a MULTIPLE dimensions
	 * 2013-02-04 - Tri
	 */
	public static void main(String[] args) {
		// pour addresser les dimensions du tableau 2D
		final int INDEX_PAYS = 0;
		final int INDEX_CAPITALE = 1;

		//NOTE: declaration, 2 dimensions = [][]
		String[][] aPays =
				{
						{"Canada", "Ottawa"}, // Element 0
						{"France", "Paris"},  // Element 1
						{"Malaysia", "Kuala Lumpur"} // Element 2
				};

		System.out.printf("Pays\t\t\t\tCapitale\n");
		System.out.println("------------------------------------------");
		for (int kk = 0; kk < aPays.length; kk++) {
			System.out.printf("[%d][%d] %s\t\t[%d][%d] %s\n",
					kk, INDEX_PAYS, aPays[kk][INDEX_PAYS],
					kk, INDEX_CAPITALE, aPays[kk][INDEX_CAPITALE]
			);
		}
	}

}
