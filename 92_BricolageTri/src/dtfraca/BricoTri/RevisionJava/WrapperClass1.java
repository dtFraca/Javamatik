package dtfraca.BricoTri.RevisionJava;

/**
 * Intro Java Programming Comprehensive 10thEd 2014 - 10.10 page 383
 * Show the output of the following code
 * 2015-04-02 - tri
 */
public class WrapperClass1 {
	public static void main(String[] args) {
		Integer x = new Integer(3);
		System.out.println(x.intValue()); // output: 3
		System.out.println(x.compareTo(new Integer(4))); // output: -1
	}
}

