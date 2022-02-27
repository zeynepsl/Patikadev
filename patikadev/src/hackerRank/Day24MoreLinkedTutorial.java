package hackerRank;

import java.util.HashSet;
import java.util.Set;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}

}

public class Day24MoreLinkedTutorial {
	public static Node removeDuplicates(Node head) {
		// Write your code here
		if (head == null)
			return null;
		
		Set<Integer> set = new HashSet<Integer>();
		
		Node prevNode = head;
				
		Node n = prevNode.next;
		
		if (n == null)
			return head;
		
		set.add(prevNode.data);

		while (n != null) {
			if (set.contains(n.data)) {
				prevNode.next = n.next;
				n = n.next;
			} else {
				set.add(n.data);
				prevNode = n;
				n = n.next;
			}
		}
		return head;
	}
	
	public static Node removeDuplicatesarr(Node head) {
	    if (head == null || head.next == null){
	        return head;
	    }
	    if (head.data == head.next.data){
	        head.next = head.next.next;
	        removeDuplicates(head);
	    }else{
	        removeDuplicates(head.next);
	    }
	    return head;
	}
	
	

	public static Node insert(Node head, int data) {
		Node p = new Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}
}
