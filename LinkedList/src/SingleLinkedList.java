import java.util.*;

public class SingleLinkedList {
	Node start;

	public SingleLinkedList() {
		start = null;
	}

	public void insertBeginning(int data) {
		Node temp = new Node(data);
		temp.link = start;
		start = temp;
	}

	public void insertEnd(int data) {
		Node p;
		Node temp = new Node(data);
		if (start == null) {
			start = temp;
			return;
		}
		p = start;

		while (p.link != null) {
			p = p.link;
		}
		p.link = temp;
	}

	public void insertAfter(int pos, int data) {
		Node p;
		Node temp = new Node(data);
		p = start;
		while (p.link != null) {
			if (p.info == pos) {
				break;
			}
			p = p.link;
		}
		temp.link = p.link;
		p.link = temp;
	}

	public void insertBefore(int pos, int data) {
		Node p;
		Node temp = new Node(data);
		if (start.info == pos) {
			temp.link = start;
			start = temp;
			return;
		}
		p = start;
		while (p.link != null) {
			if (p.link.info == pos) {
				break;
			}
			p = p.link;
		}
		temp.link = p.link;
		p.link = temp;
	}

	public void insertAtPostion(int pos, int data) {
		Node p;
		int i;
		Node temp = new Node(data);
		if (pos == 0) {
			temp.link = start;
			start = temp;
			return;
		}
		i = 1;
		p = start;
		while (p.link != null && i < pos - 1) {
			i += 1;
			p = p.link;
		}
		temp.link = p.link;
		p.link = temp;
	}

	public void deleteFirstNode() {
		if (start == null) {
			System.out.println("No items in the list!");
			return;
		}
		start = start.link;
	}

	public void search(int x) {
		Node p;
		p = start;
		int idx = 0;
		while (p != null) {
			if (p.info == x) {
				break;
			}
			p = p.link;
			idx += 1;
		}
		if (p == null) {
			System.out.println("Element not found in the list");
			return;
		}
		System.out.printf("Element found at index: " + idx);
	}

	public void createList() {
		System.out.println("Enter how many nodes: ");
		int n, i, data;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		if (n == 0)
			return;

		for (i = 1; i <= n; i++) {
			System.out.println("Enter the node data: ");
			data = scan.nextInt();
			insertEnd(data);
		}
	}

	public void deleteLastNode() {
		Node p;
		if (start == null) {
			System.out.println("No items in the list");
			return;
		}
		if (start.link == null) {
			start = null;
			return;
		}
		p = start;
		while (p.link.link != null) {
			p = p.link;
		}
		p.link = null;
	}

	public void deleteAfter(int pos) {
		Node p;
		p = start;
		while (p.link != null) {
			if (p.info == pos) {
				break;
			}
			p = p.link;
		}
		if (p.link == null) {
			System.out.println("Not found in the list");
			return;
		}
		p.link = p.link.link;
	}

	public void deleteNode(int node) {
		Node p;

		if (start == null) {
			System.out.println("No items to delete");
			return;
		}

		if (start.info == node) {
			start = start.link;
			return;
		}

		p = start;
		while (p.link != null) {
			if (p.link.info == node) {
				p.link = p.link.link;
				return;
			}
			p = p.link;
		}
		if (p.link == null) {
			System.out.println("Not found in the list");
			return;
		}
	}

	public void reverseList() {
		Node p, prev, next;
		p = start;
		prev = null;
		while (p != null) {
			next = p.link;
			p.link = prev;
			prev = p;
			p = next;
		}
		start = prev;
	}

	public void bubbleSortData() {
		Node end, p, q;
		end = null;
		while (start.link != end) {
			p = start;
			while (p.link != end) {
				q = p.link;
				if (p.info > q.info) {
					int temp = p.info;
					p.info = q.info;
					q.info = temp;
				}
				p = p.link;
			}
			end = p;
		}
	}

	public void displayList() {
		Node p;
		if (start == null) {
			System.out.println("List is empty");
			return;
		}

		p = start;
		while (p != null) {
			System.out.print(p.info + " ");
			p = p.link;
		}
		System.out.println();
	}
}