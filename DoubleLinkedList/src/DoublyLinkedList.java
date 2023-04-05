import java.util.*;

public class DoublyLinkedList {
	public Node start;

	public DoublyLinkedList() {
		start = null;
	}

	public void display() {
		if (start == null)
			return;
		Node p;
		p = start;
		while (p != null) {
			System.out.print(p.info + " ");
			p = p.next;
		}
		System.out.println();
	}

	public void insertInEmptyList(int data) {
		Node temp = new Node(data);
		start = temp;
		temp.prev = start;
	}

	public void insertBeginning(int data) {
		Node temp = new Node(data);
		temp.next = start;
		start.prev = temp;
		start = temp;
	}

	public void insertEnd(int data) {
		Node temp = new Node(data);
		Node p = start;
		while (p.next != null) {
			p = p.next;
		}
		p.next = temp;
		temp.prev = p;
	}

	public void insertAfter(int pos, int data) {
		Node temp = new Node(data);
		Node p = start;
		while (p.next != null) {
			if (p.info == pos) {
				break;
			}
			p = p.next;
		}
		temp.next = p.next;
		temp.prev = p;
		if (p.next != null)
			p.next.prev = temp;

		p.next = temp;
	}

	public void insertBefore(int pos, int data) {
		Node p;
		Node temp = new Node(data);
		if (start.info == pos) {
			insertBeginning(data);
			return;
		}
		p = start;
		while (p.next != null) {
			if (p.info == pos) {
				break;
			}
			p = p.next;
		}
		temp.next = p;
		temp.prev = p.prev;
		p.prev.next = temp;
		p.prev = temp;
	}

	public void deleteFirstNode() {
		if (start == null) {
			System.out.println("No items to delete");
			return;
		}
		start = start.next;
		start.next.prev = start;
	}

	public void deleteLastNode() {
		Node p;
		p = start;
		while (p.next != null) {
			p = p.next;
		}
		p.next = null;
	}

	public void deleteNode(int pos) {
		if (pos == 1) {
			deleteFirstNode();
			return;
		}
		Node p = start;
		int i = 1;
		while (i <= pos - 1 && p.next != null) {
			i += 1;
			p = p.next;
		}
		if (p.next != null)
			p.next.prev = p.prev;
		p.prev.next = p.next;
	}

	public void reverseList() {
		Node p1, p2;
		p1 = start;
		p2 = p1.next;
		p1.next = null;
		p1.prev = p2;
		while (p2 != null) {
			p2.prev = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = p2.prev;
		}
		start = p1;
	}

	public void createList() {
		int n, data, i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of nodes: ");
		n = scan.nextInt();
		if (n == 0)
			return;

		System.out.println("Enter the first element: ");
		data = scan.nextInt();
		insertInEmptyList(data);

		for (i = 2; i <= n; i++) {
			data = scan.nextInt();
			insertEnd(data);
		}
	}
}