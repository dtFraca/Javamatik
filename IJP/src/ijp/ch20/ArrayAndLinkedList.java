package ijp.ch20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Chapter 20 Lists, Stacks, Queues, and Priority Queues
 * 20.4 Lists
 * 2015-04-03 - tri
 */
public class ArrayAndLinkedList {
	public static void main(String[] args) {
		//List<Integer> arrayList = new ArrayList<>(); //JDK8 (diamond type)
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1); // 1 is autoboxed to new Integer(1)
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(4);
		arrayList.add(0, 10);
		arrayList.add(3, 30);
		System.out.println("A list of integers in the array list:");
		System.out.println(arrayList); // [10, 1, 2, 30, 3, 1, 4]

		//LinkedList<Object> linkedList = new LinkedList<>(arrayList); // JDK8
		LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
		linkedList.add(1, "red");
		linkedList.removeLast();
		linkedList.addFirst("green");
		System.out.println("Display the linked list forward:"); // green 10 red 1 2 30 3 1

		ListIterator<Object> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		System.out.println();
		System.out.println("Display the linked list backward:");
		listIterator = linkedList.listIterator(linkedList.size());
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " "); // 1 3 30 2 1 red 10 green
		}
	}
}
