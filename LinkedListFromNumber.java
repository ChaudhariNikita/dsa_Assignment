package assignment;

import java.util.Scanner;

public class LinkedListFromNumber {
	public static LinkedList createLinkedListFromNumber(int number) {
		LinkedList linkedList = new LinkedList();
		String numberStr = Integer.toString(number);
		for (char digit : numberStr.toCharArray()) {
			linkedList.insert(Character.getNumericValue(digit));
		}
		return linkedList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		LinkedList linkedList = createLinkedListFromNumber(number);
		linkedList.display();
	}
}
