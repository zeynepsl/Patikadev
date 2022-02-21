package dataStructures.LinkedList;

public class Execution {
	public static void main(String[] args) {
		LinkedListClass<String> linkedList = new LinkedListClass<String>();
		linkedList.addFirst("zeynep");
		linkedList.addLast("tuba");
		linkedList.addFirst("sevdenur");
		linkedList.addLast("ismail");
		linkedList.addLast("omer");
		linkedList.addFirst("anne");
		//System.out.println(linkedList.get(3).data);
		linkedList.add(2, "vaybeee");
		linkedList.print();
	}
}
