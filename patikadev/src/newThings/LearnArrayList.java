package newThings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnArrayList {
	public static void main(String[] args) {
		//arrayList oluþturma:
		ArrayList<Integer> arrayList = new ArrayList<Integer>();//default kapasite -> 10
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>(20);//ilk kapasite 20 olarak belirlendi
		List<Integer> arrayList3 = new ArrayList<Integer>(12);
		
		System.out.println(arrayList.size());// þu an eleman sayýsý sýfýr
		/*java yý yazanlar ArrayList adýnda bir class oluþturmuþlar, aynýsýný yapmaya çalýþalým
         * generic = hangi tipi verirsen içindeki operasyonlar (add gibi) parametre olarak o tipte çalýþýyor
         * istr string ister int ister class ver 
         */
	}
}

class MyArrayList{
	Object[] list;
	Object[] tempArrayList;
	int numberOfElements;
	
	public MyArrayList() {
		this(0);//this -> bu class yani MyArrayList() (aþaðýda)
	}

	public MyArrayList(int capacity) {
		if(capacity < 0) {
			System.out.println("kapasite 0 ve sýfýrdan küçük olamaz");
		}
		list = new Object[capacity];
		numberOfElements = 0;
	}
	
	public void add(Object data) {
		if (isFull()) {
			increaseSize();
		}
		list[numberOfElements] = data;
		numberOfElements++;
	}

	public void add(int index, Object data) {
		if (isFull()) {
			increaseSize();
		}
		if (index == numberOfElements) {
			add(data);
		} else if (index < list.length) {
			Object temp;
			for (int i = index; i < list.length - 1; i++) {
				temp = list[i];
				list[i] = data;
				data = temp;

			}
			numberOfElements++;
		} else {

			System.out.println("The index is out of bounds");
			System.exit(-1);
		}

	}

	public void removeWithIndex(int index) {
		if (index > numberOfElements) {
			throw new IndexOutOfBoundsException();
		}
		System.arraycopy(list, index + 1, list, index, numberOfElements - index - 1);
		numberOfElements--;

	}

	public void remove(Object o) {

		int index = indexOf(o);

		if (index >= 0) {
			Object[] tempArray = new Object[list.length - 1];
			int tempIndex = 0;
			for (int i = 0; i < list.length; i++, tempIndex++) {
				if (o.equals(list[i])) {
					numberOfElements--;
					tempIndex--;
					continue;
				}
				tempArray[tempIndex] = list[i];
			}
			list = tempArray;
		}
		//
	}

	public int indexOf(Object o) {
		for (int i = 0; i < list.length; i++) {
			if (o.equals(list[i])) {
				return i;
			}
		}
		return -1;
	}

	public int size() {
		return numberOfElements;
	}

	public Object get(int index) {
		if (index >= 0 && index < numberOfElements) {
			return list[index];
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	public boolean contains(Object o) {
		return indexOf(o) >= 0;
	}

	public boolean isFull() {
		return this.list.length == this.numberOfElements;
	}

	public void increaseSize() {

		Object[] copiedArray = Arrays.copyOf(list, list.length * 2);
		list = copiedArray;
	}

	public void printList() {
		for (int i = 0; i < numberOfElements; i++) {
			System.out.println(list[i]);
		}
	}
}
