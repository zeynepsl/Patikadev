package hackerRank;

import java.util.LinkedList;

public class Day15LinkedListTutorial {
	public static void main(String[] args) {
		LinkedList<String> myLinkedList = new LinkedList<String>();

		// Add a node with data="First" to back of the (empty) list
		myLinkedList.add("First"); 

		// Add a node with data="Second" to the back of the list
		myLinkedList.add("Second"); 

		// Insert a node with data="Third" at front of the list
		myLinkedList.addFirst("Third"); 

		// Insert a node with data="Fourth" at back of the list
		myLinkedList.addLast("Fourth"); 

		// Insert a node with data="Fifth" at index 2
		myLinkedList.add(2, "Fifth"); 

		// Print the list: [Third, First, Fifth, Second, Fourth]
		System.out.println(myLinkedList); 

		// Print the value at list index 2:
		System.out.println(myLinkedList.get(2));//Fifth

		// Empty the list
		myLinkedList.clear();

		// Print the newly emptied list: []
		System.out.println(myLinkedList); 

		// Adds a node with data="Sixth" to back of the (empty) list
		myLinkedList.add("Sixth"); 
		System.out.println(myLinkedList); // print the list: [Sixth]
	}
}
