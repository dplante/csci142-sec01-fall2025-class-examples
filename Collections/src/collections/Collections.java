package collections;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
//		Vector<String> data = new Vector<>();
//		Stack<String> data = new Stack<>();
//		LinkedList<String> data = new LinkedList<>();
//		Deque<String> data = new ArrayDeque<>();
		PriorityQueue<String> data = new PriorityQueue<>();
		
		// Adding elements to the collection
		data.add("EJ");
		data.add("Nathan");
		data.add("Isabel");
		data.add("Ralph");
		
		// The way you typically access elements in the collection
		// is through iteration
		System.out.println("Iterating through the collection with an iterator:");
		Iterator<String> iterator = data.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("Element: " + element);
			//iterator.remove(); // Removing the element during iteration
		}

		iterator = data.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("Element: " + element);
		}
		
		// check if collection is empty
		System.out.println("Is the collection empty? " + data.isEmpty());
		
		// Displaying the elements of the Vector or Stack
//		System.out.println("\nAccessing elements by index:");
//		for (int i = 0; i < data.size(); i++) {
//			System.out.println("Element at index " + i + ": " + data.elementAt(i));
//		}

	}

}
