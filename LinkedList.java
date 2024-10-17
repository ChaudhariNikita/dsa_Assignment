package assignment;

public class LinkedList {
	Node root;

	public void insert(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = n;
			return;
		}
		Node last = root;
		while (last.next != null) {
			last = last.next;
		}
		last.next = n;
	}

	public void display() {
		Node n = root;
		while (n != null) {
			System.out.print("|" + n.data + "|->");
			n = n.next;
		}
		System.out.println();
	}
}
