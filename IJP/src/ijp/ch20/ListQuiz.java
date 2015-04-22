package ijp.ch20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Chapter 20 Lists, Stacks, Queues, and Priority Queues
 * Q 20.11
 *
 * 2015-04-04 - tri
 */
public class ListQuiz {
	public static void main(String[] args) {
		List<String> list1 = initList1();
		List<String> list2 = Arrays.asList("red", "yellow", "blue");

		//a. What are list1 and list2 after executing list1.addAll(list2) ?
		list1.addAll(list2);
		System.out.println(list1); // [red, yellow, green, red, yellow, blue]
		System.out.println(list2); // [red, yellow, blue]

		//b. What are list1 and list2 after executing list1.add(list2) ?
		//list1.add(list2); // incorrect signature

		//c. What are list1 and list2 after executing list1.removeAll(list2) ?
		list1 = initList1();
		list1.removeAll(list2);
		System.out.println(list1); // [green]
		System.out.println(list2); // [red, yellow, blue]

		//d. What are list1 and list2 after executing list1.remove(list2) ?
		list1 = initList1();
		list1.remove(list2); // list1 remains UNCHANGED
		System.out.println(list1); // [red, yellow, green]
		System.out.println(list2); // [red, yellow, blue]

		//e. What are list1 and list2 after executing list1.retainAll(list2) ?
		list1 = initList1();
		list1.retainAll(list2);
		System.out.println(list1); // [red, yellow]
		System.out.println(list2); // [red, yellow, blue]

		//f. What is list1 after executing list1.clear() ?
		list1.clear();
		System.out.println(list1); // []
	}

	static private List<String> initList1() {
		// ATTENTION: Arrays.asList() returns immutable List which do not support modification
		//List<String> list1 = Arrays.asList("red", "yellow", "green"); // list1.add() --> UnsupportedOperationException
		List<String> lst = new ArrayList<String>();
		lst.add("red");
		lst.add("yellow");
		lst.add("green");
		return lst;
	}
}
