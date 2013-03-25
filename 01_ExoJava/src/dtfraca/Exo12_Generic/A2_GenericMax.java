package dtfraca.Exo12_Generic;

/**
 * Generic max() function to return the max value of any type
 * Book Java for Programmers, page 625, 19.4 Additional Compile-Time Translation Issues: Methods That Use a Type Parameter as the Return Type
 * Notions:
 * 1. Method return = generic Type
 * 2. Generic interface Comparable<T>
 *
 * 2013-03-24 - tri
 */
public class A2_GenericMax {
	public static void main(String[] args) {

		System.out.printf( "maximum( 4, 5, 3 ) -> %d\n\n", maximum( 4, 5, 3 ) );

		System.out.printf( "maximum( 6.6, 8.8, 7.7 ) -> %.1f\n\n", maximum( 6.6, 8.8, 7.7 ) );

		System.out.printf( "maximum( \"aRrièrE\", \"AvaNT\", \"détErmiNéS\" ) -> %s\n", maximum( "aRrièrE", "AvaNT", "détErmiNéS" ) );
	}

	/**
	 The application uses a generic method maximum to determine and return the largest
	 of its three arguments of the same type. Unfortunately, the relational operator > cannot be used
	 with reference types. However, it’s possible to compare two objects
	 of the same class if that class implements the generic interface Comparable<T> (package java.lang).
	 All the type-wrapper classes for primitive types implement this interface.
	 Like generic classes, generic interfaces enable you to specify, with a single interface declaration,
	 a set of related types. Comparable<T> objects have a compareTo method.

	 NOTE: Thus, only Comparable<T> objects can be passed as arguments to maximum. Anything that
	 is not a Comparable<T> will result in compilation errors
	*/
	public static < T extends Comparable< T > > T maximum( T x, T y, T z )
	{
		T max = x; // assume x is initially the largest
		if ( y.compareTo( max ) > 0 )
			max = y; // y is the largest so far

		if ( z.compareTo( max ) > 0 )
			max = z; // z is the largest

		return max; // returns the largest object
	}
}
