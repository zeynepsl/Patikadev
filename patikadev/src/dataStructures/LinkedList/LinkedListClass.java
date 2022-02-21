package dataStructures.LinkedList;


/* Bu sýnýf, Baðlantýlý Liste uygulamasý için taným sýnýfý olarak hizmet edecektir.
* {@link LinkedListInterface}'i uygular ve tüm metodlarý override eder. (geçersiz kýlar)
*/

//* * * *https://stackoverflow.com/questions/4066729/creating-a-linkedlist-class-from-scratch
//https://www.javatpoint.com/java-program-to-create-and-display-a-singly-linked-list
//https://github.com/shinezejian/javaStructures/blob/master/src/com/zejian/structures/LinkedList/singleLinked/SingleILinkedList.java
// * * * https://github.com/dbc2201/LinkedListADTTemplate/blob/master/src/definition/LinkedListDefinitionClass.java
//https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
//medium --> cepel
public class LinkedListClass<T> implements LinkedListInterface<T>{

	private Node<T> head = null;
	private Node<T> tail = null;
	private int size = 0;
	
	/**
    * Bu yöntem, baðlantýlý listenin baþýna bir öðe düðümü ekleyecektir.
    * Programcý bize yalnýzca öðeyi (veri deðeri) verir
    * bir düðüm oluþturmamýz gerek. Çünkü baðlantýlý liste yalnýzca düðümler üzerinde çalýþýr.
    *
    * @param item Oluþturulacak ve baðlantýlý listeye eklenecek düðümün veri deðeridir.
    */
	public void addFirst(T item) {
		if(head == null) {
			head = new Node<T>();
			head.data = item;
			tail = head;
		}
		else {
			Node<T> node = new Node<T>();
			node.data = item;
			node.next = head;
			head = node;
		}
		//head = new Node<T>(item, head);
		size++;
	}
	
	public void addLast(T item) {
		if(head == null) {
			Node<T> node = new Node<T>();
			node.data = item;
			//head = node;
			tail = head;
		}
		else {
			Node<T> node = new Node<T>();
			node.data = item;
			tail.next = node;
			tail = node;
		}
		size++;
	}
	
	public void add(int index, T item) {
		if (index < 0 || index > size) {
            // throw the IndexOutOfBoundsException if the index given is incorrect.
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
		else if(index == 0) {
			addFirst(item);
		}
		else {
			Node<T> node = new Node<T>();
			Node<T> prev = get(index-1);
			node.data = item;
			node.next = prev.next;
			prev.next = node;
		}
		
	}
	
	@Override
	public void add(T item) {
		
	}

	@Override
	public T remove() {
		return null;
	}
	
	public T remove(int index) {
		if(index == 0) {
			removeFirst();
		}
		else {
			
		}
	}
	
	public void removeFirst() {
		Node<T> deletedNode = get(0);
		head = deletedNode.next;
	}

	@Override
	public int search(T item) {
		
		return 0;
	}

	@Override
	public void sort() {
		
	}
	
	public Node<T> get(int index) {
		Node<T> result = head;
		for(int i = 0; i < index; i++) {
			result = result.next;
		}
		return result;
	}

	@Override
	public void print() {
		Node<T> temp = head;
		while(temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		
	}

}
