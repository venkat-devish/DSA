import java.util.*;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice, data;
		Scanner scan = new Scanner(System.in);
		DoublyLinkedList List = new DoublyLinkedList();
		List.createList();

		while (true) {
			System.out.println("1.Display list");
			System.out.println("2.Insert in empty list/Insert in beginning of the list");
			System.out.println("3.Insert a node at the end of the list");
			System.out.println("4.Insert Before");
			System.out.println("5.Insert After");
			System.out.println("6.Delete First node");
			System.out.println("7.Delete Last node");
			System.out.println("8.Delete node");
			System.out.println("9.Reverse");
			System.out.println("Enter your choice: ");
			System.out.println();
			choice = scan.nextInt();

			if (choice == 1) {
				List.display();
			} else if (choice == 2) {
				data = scan.nextInt();
				List.insertBeginning(data);
			} else if (choice == 3) {
				System.out.println("Enter the data to be inserted: ");
				data = scan.nextInt();
				List.insertEnd(data);
			} else if (choice == 4) {
				int pos, x;
				System.out.println("Enter Position: ");
				pos = scan.nextInt();
				System.out.println("Enter data: ");
				x = scan.nextInt();
				List.insertBefore(pos, x);
			} else if (choice == 5) {
				int pos, x;
				System.out.println("Enter Position: ");
				pos = scan.nextInt();
				System.out.println("Enter data: ");
				x = scan.nextInt();
				List.insertAfter(pos, x);
			} else if (choice == 6) {
				List.deleteFirstNode();
			} else if (choice == 7) {
				List.deleteLastNode();
			} else if (choice == 8) {
				System.out.println("Enter the position: ");
				int pos = scan.nextInt();
				List.deleteNode(pos);
			} else if (choice == 9) {
				List.reverseList();
			} else if (choice == 19) {
				break;
			} else {
				System.out.println("Wrong Option");
			}
		}
		scan.close();
	}
}
