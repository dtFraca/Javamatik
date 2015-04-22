package dtfraca.BricoTri.RevisionJava;

/**
 * Class Description: ?
 * <p/>
 * 2015-04-02 - tri
 */
public class PrimitiveArray {
	public static void main(String[] args) {
		// Array of primitive
		System.out.println("Version1: short[] array of primitive:");
		short[] primShorts = new short[] {3, 56, 878, 15, -45, 45, -988};
		for (short si : primShorts) {
			System.out.printf("%s ", si);
		}
		System.out.println();

		// Array of same type in wrapper class
		//Short[] wrapShorts = new Short[]{11, 22, -33}; // BAD: autoboxing
		// terrible syntax but will avoid boxing & unboxing
		System.out.println("Version2: Short[] array of wrapper classes:");
		Short[] wrapShorts = new Short[]{new Short((short) 11), Short.valueOf("22"), new Short((short)-33)};
		for (Short si : wrapShorts) {
			System.out.printf("%s ", si);
		}
		System.out.println();
	}
}
