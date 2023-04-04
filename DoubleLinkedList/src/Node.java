public class Node {
	public Node prev;
	public int info;
	public Node next;

	public Node(int data) {
		info = data;
		prev = null;
		next = null;
	}
}