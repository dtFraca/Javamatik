package dtfraca.Exo12_Generic;

/**
 * The simplest Generic demo: print the content of an array regardless of the data type
 * Book Java for Programmers, page 622, 19.3 Generic Methods
 * <p/>
 * 2013-03-24 - tri
 */
public class A1_GenericPrintArray {
	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
		Character[] charArray = {'B', 'O', 'N', 'J', 'O', 'U', 'R'};

		System.out.println("Array integerArray contains:");
		printArray(intArray);

		System.out.println("\n\nArray doubleArray contains:");
		printArray(doubleArray);

		System.out.println("\n\nArray characterArray contains:");
		printArray(charArray);
	}

	/**
	 * All generic method declarations
	 * have a type-parameter section delimited by angle brackets (< and >) that precedes the
	 * method’s return type (< T > in this example). Each type-parameter section contains one or
	 * more type parameters (also called formal type parameters), separated by commas. Example: < X, Y, Z >
	 * A type parameter, also known as a type variable, is an identifier that specifies a generic type name.
	 * <p/>
	 * The type parameters can be used to declare the return type, parameter types and local vari-
	 * able types in a generic method declaration, and they act as placeholders for the types of the
	 * arguments passed to the generic method, which are known as actual type arguments. A
	 * generic method’s body is declared like that of any other method.
	 * <p/>
	 * Type parameters can represent only reference types—not primitive types (like int, double and char).
	 * Note, too, that the type-parameter names throughout the method declaration must match those declared
	 * in the type-parameter section. For example, for ( T element : inputArray )
	 * matches the type parameter < T >  in the method declaration
	 * Also, a type parameter can be declared only once in the type-parameter section but can appear more than once in the method’s
	 * parameter list. For example, the type-parameter name T appears twice in the following method’s parameter list:
	 * public static < T > void printTwoArrays( T[] array1, T[] array2 )
	 * Type-parameter names need not be unique among different generic methods.
	 */
	public static <T> void printArray(T[] inputArray) {
		// display array elements
		for (T element : inputArray) {
			System.out.printf("%s ", element.toString());
		}
	}
}
