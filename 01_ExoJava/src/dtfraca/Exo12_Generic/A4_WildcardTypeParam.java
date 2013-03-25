package dtfraca.Exo12_Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Wildcards enable you to specify method parameters, return values, variables or fields, and so on,
 * that act as supertypes or subtypes of parameterized types.
 * In this example the sumWithWildcard() method can calculate the sumWithWildcard of any List containing
 * elements of any subclass of Number: public static double sumWithWildcard( List< ? extends Number > anyNumList )
 *
 * Book Java for Programmers, page 641, 19.8 Wildcards in Methods That Accept Type Parameters
 *
 * 2013-03-25 - tri
 */
public class A4_WildcardTypeParam {
	public static void main(String[] args) {

		List< Integer > integerList = new ArrayList< Integer >(Arrays.asList(1, 2, 3, 4, 5));
		System.out.printf( "integerList contains: %s -> SUM = %.0f\n\n", integerList, sumWithWildcard(integerList) );

		List< Double > doubleList = new ArrayList< Double >(Arrays.asList(1.1, 3.3, 5.5));
		System.out.printf( "doubleList contains: %s -> SUM = %.1f\n\n", doubleList, sumWithWildcard(doubleList) );

		List< Number > mixnumList = new ArrayList< Number >(Arrays.asList(1, 2.4, 3, 4.1));
		System.out.printf( "mixnumList contains: %s -> SUM = %.1f\n\n", mixnumList, sumWithWildcard(mixnumList) );
	}

	// total the elements; using a wildcard in the ArrayList parameter
	public static double sumWithWildcard(List<? extends Number> anyNumList)
	{
		double total = 0;

		for ( Number item : anyNumList ) {
			total += item.doubleValue();
		}

		return total;
	}
}
