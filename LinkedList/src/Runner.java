import java.util.*;

public class Runner {

	public static void main(String[] args) {
		int choice, data;

		SingleLinkedList List = new SingleLinkedList();

		Scanner scan = new Scanner(System.in);

		List.createList();

		while (true) {
			System.out.println("1.Display list");
			System.out.println("2.Insert in empty list/Insert in beginning of the list");
			System.out.println("3.Insert a node at the end of the list");
			System.out.println("4.Search");
			System.out.println("5.Insert After");
			System.out.println("6.Insert Before");
			System.out.println("7.Insert At position");
			System.out.println("8.Delete first node");
			System.out.println("9.Delete last node");
			System.out.println("10.Delete after node");
			System.out.println("11.Delete node");
			System.out.println("12.Reverse List");
			System.out.println("13.Bubble sort data");
			System.out.println("19.Quit");

			System.out.print("Enter your choice : ");

			choice = scan.nextInt();

			if (choice == 1) {
				List.displayList();
			} else if (choice == 2) {
				data = scan.nextInt();
				List.insertBeginning(data);
			} else if (choice == 3) {
				System.out.println("Enter the data to be inserted: ");
				data = scan.nextInt();
				List.insertEnd(data);
			} else if (choice == 4) {
				System.out.println("Enter the element to be searched: ");
				int x = scan.nextInt();
				List.search(x);
			} else if (choice == 5) {
				int pos, x;
				System.out.println("Enter Position: ");
				pos = scan.nextInt();
				System.out.println("Enter data: ");
				x = scan.nextInt();
				List.insertAfter(pos, x);
			} else if (choice == 6) {
				int pos, x;
				System.out.println("Enter Position: ");
				pos = scan.nextInt();
				System.out.println("Enter data: ");
				x = scan.nextInt();
				List.insertBefore(pos, x);
			} else if (choice == 7) {
				int pos, x;
				System.out.println("Enter Position: ");
				pos = scan.nextInt();
				System.out.println("Enter data: ");
				x = scan.nextInt();
				List.insertAtPostion(pos, x);
			} else if (choice == 8) {
				List.deleteFirstNode();
			} else if (choice == 9) {
				List.deleteLastNode();
			} else if (choice == 10) {
				int pos = scan.nextInt();
				List.deleteAfter(pos);
			} else if (choice == 11) {
				System.out.println("Enter node to delete: ");
				int node = scan.nextInt();
				List.deleteNode(node);
			} else if (choice == 12) {
				List.reverseList();
			} else if (choice == 13) {
				List.bubbleSortData();
			} else if (choice == 19) {
				break;
			} else if (choice == 19) {
				break;
			} else if (choice == 19) {
				break;
			} else if (choice == 19) {
				break;
			} else if (choice == 19) {
				break;
			} else {
				System.out.println("Wrong Choice!");
			}
			System.out.println();
		}
		scan.close();
		System.out.println("Exiting");
	}

}
