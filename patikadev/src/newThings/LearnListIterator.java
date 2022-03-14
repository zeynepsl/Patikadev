package newThings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class LearnListIterator {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.addAll(Arrays.asList("zey", "tuba", "sevde"));
		
		ListIterator<String> iterator = names.listIterator();
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
