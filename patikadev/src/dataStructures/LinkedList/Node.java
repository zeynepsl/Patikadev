package dataStructures.LinkedList;

public class Node<T> {
	public T data;
	public Node<T> next;
	
	public Node() {
	}
	
	public Node(T data) {
		super();
		this.data = data;
	}
	
	public Node(T data, Node<T> next) {
		this(data);
		this.next = next;
	}
	
}
