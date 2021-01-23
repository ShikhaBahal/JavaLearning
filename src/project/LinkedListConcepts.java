package project;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcepts {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Shikha");
		ll.add("Ritesh");
		ll.add("Harsh");
		ll.add("Arti");

		// Print
		System.out.println("Linked List Contents: " + ll);

		// Add first element
		ll.addFirst("FirstElement");

		// Add Last element
		ll.addLast("Last Element");

		// Add value by index
		ll.add(2, "Second Index");

		// How to print all the values of LinkedList
		// 1- for loop
		System.out.println("***********for-loop***********");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		// 2- Advance for loop
		System.out.println("***********Advance for-loop***********");
		for (String str : ll) {
			System.out.println(str);
		}

		// 3- Iterator
		System.out.println("***********Iterator***********");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 4- While loop
		System.out.println("***********While-loop***********");
		int j = 0;
		while (ll.size() > j) {
			System.out.println(ll.get(j));
			j++;
		}

	}

}
