package assignment;

import java.util.Scanner;

class LinkedListClass {
	Node head;

	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null || head.data > data) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null && current.next.data < data) {
			current = current.next;
		}
		if (current.next == null || current.next.data != data) {
			newNode.next = current.next;
			current.next = newNode;
		}
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public LinkedListClass union(LinkedListClass list2) {
		LinkedListClass unionList = new LinkedListClass();
		Node current1 = this.head;
		Node current2 = this.head;

		while (current1 != null || current2 != null) {
			if (current1 != null && (current2 == null || current1.data < current2.data)) {
				unionList.insert(current1.data);
				current1 = current1.next;
			} else if (current2 != null && (current1 == null || current2.data < current1.data)) {
				unionList.insert(current2.data);
				current2 = current2.next;
			} else {
				unionList.insert(current1.data);
				current1 = current1.next;
				current2 = current2.next;
			}
		}

		return unionList;
	}
}

public class LinkedListUnion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedListClass list1 = new LinkedListClass();
		System.out.println("Enter elements for the first linked list (enter -1 to stop):");
		while (true) {
			int input = scanner.nextInt();
			if (input == -1)
				break;
			list1.insert(input);
		}

		LinkedListClass list2 = new LinkedListClass();
		System.out.println("Enter elements for the second linked list (enter -1 to stop):");
		while (true) {
			int input = scanner.nextInt();
			if (input == -1)
				break;
			list2.insert(input);
		}
		LinkedListClass unionList = list1.union(list2);
		System.out.print("Union of the two linked lists: ");
		unionList.display();
		scanner.close();
	}
}