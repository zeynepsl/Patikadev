package hackerRank;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.Scanner;

public class Day18StackAndQueue {
	
	LinkedList queue = new LinkedList();

	public void enqueueCharacter(char c) {
		queue.addLast(c);
	}

	public char dequeueCharacter() {
		return (char) queue.get(0);
	}

	LinkedList stack = new LinkedList();

	public void pushCharacter(char c) {
		stack.addFirst(c);
	}

	public char popCharacter() {
		return (char) stack.get(0);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Day18StackAndQueue p = new Day18StackAndQueue();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}
}
