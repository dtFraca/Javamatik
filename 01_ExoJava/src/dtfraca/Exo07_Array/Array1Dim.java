package dtfraca.Exo07_Array;

/**
 * Class Description: ?
 * <p/>
 * 2013-06-30 - david
 */
public class Array1Dim {
	public static void main(String[] args) {
		final int INDEX_MONTH = 0;
		final int INDEX_DAYS = 1;

		String[][] moisEN = {

				{"January", "31"},
				{"Febuary", "28"},
				{"March", "31"},
				{"April", "30"},
				{"May", "31"},
				{"June", "30"},
				{"July", "31"},
				{"August", "30"},
				{"September", "31"},
				{"October", "30"},
				{"November", "31"},
				{"December", "30"},
		};
		System.out.println("		Month				 Day\n");
		for (int zz = 0; zz < moisEN.length; zz++) {
			System.out.printf("[%d][%d] %s\t\t[%d][%d] %s\n",
					zz, INDEX_MONTH, moisEN[zz][INDEX_MONTH],
					zz, INDEX_DAYS, moisEN[zz][INDEX_DAYS]);
		}


	}
}
