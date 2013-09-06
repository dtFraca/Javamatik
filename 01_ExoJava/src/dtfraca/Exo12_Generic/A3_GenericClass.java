package dtfraca.Exo12_Generic;

import java.util.ArrayList;

/**
 * A generic class declaration looks like a nongeneric one, but the class name is followed by a type-parameter section
 * In this example, the Stack is a generic class which allows to stack any type of reference type.
 * Generic class enables a concise notation to indicate the type(s) that should be used in place of the class’s type parameter(s)
 * Book Java for Programmers, page 629, 19.6 Generic Classes
 * <p/>
 * 2013-03-24 - tri
 */
public class A3_GenericClass {
	public static void main(String[] args) {
		Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
		Stack<Double> doubleStack = new Stack<Double>(5);
		testPush("doubleStack", doubleStack, doubleElements);
		testPop("doubleStack", doubleStack);


		System.out.println();
		Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Stack<Integer> integerStack = new Stack<Integer>();
		testPush("integerStack", integerStack, integerElements);
		testPop("integerStack", integerStack);

	}

	// generic method testPush pushes elements onto a Stack
	public static <T> void testPush(String name, Stack<T> stack, T[] anyArray) {
		System.out.printf("\nPushing elements onto %s\n", name);

		for (T element : anyArray) {
			System.out.printf("%s ", element);
			stack.push(element); // push element onto stack
		}
	}

	// generic method testPop pops elements from a Stack
	public static <T> void testPop(String name, Stack<T> stack) {
		// pop elements from stack
		try {
			System.out.printf("\nPopping elements from %s\n", name);
			T popValue; // store element removed from stack

			// remove all elements from Stack
			while (true) {
				popValue = stack.pop();
				if (popValue == null) {
					break;
				}
				System.out.printf("%s ", popValue);
			}
		} catch (EmptyStackException emptyStackException) {
			System.out.println();
			emptyStackException.printStackTrace();
		}
	}
}


/**
 * Generic class demonstrating a stack containing any reference type objects
 * the type parameter T represents the element type the Stack will manipulate
 */
class Stack<T> {
	private ArrayList<T> myStack; // ArrayList stores stack elements

	// no-argument constructor creates a stack of the default size
	public Stack() {
		this(10); // default stack size
	}

	// constructor creates a stack of the specified number of elements
	public Stack(int capacity) {
		int initCapacity = capacity > 0 ? capacity : 10; // validate
		myStack = new ArrayList<T>(initCapacity); // create ArrayList
	}


	public void push(T pushValue) {
		myStack.add(pushValue); // place pushValue on Stack
	}

	// return the top element if not empty; else throw EmptyStackException
	public T pop() {
		T returnVal = null;

		if (!myStack.isEmpty()) {
			returnVal = myStack.remove(myStack.size() - 1);
		} else {
			//throw new EmptyStackException( "Stack is empty, cannot pop" );
		}
		// remove and return top element of Stack
		return returnVal;
	}
}


/**
 * Custom Exception thrown by the Generic Stack class when a pop is performed on an emty stack
 * NOTE: Class having No Access Modifier = visible to entire package
 */
class EmptyStackException extends RuntimeException {
/*
	public EmptyStackException()
	{
		this( "Stack is empty" );
	}
*/

	public EmptyStackException(String message) {
		super(message);
	}
}

