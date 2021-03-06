package luong.asm3.view;

import java.util.Scanner;
import service.StaffManager;

public class Menu {

	void printMenu() {
		System.out.println("\rEnter staffs� information [1] ");
		System.out.println("Search officers and professors[2]");
		System.out.println("Display list of officers and professors [3] ");
		System.out.println("Exit[4]");

		System.out.print("\rPlease, Select 1,2,3,4: ");
	}

	private void runApp() {
		// 1 - create bee
		StaffManager manager = new StaffManager();
		int choice = 0;
		System.out.println("Welcome to human resource management program!");
		do {
			printMenu();
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("\rHow many employees do you want to enter?: ");
				int size = scanner.nextInt();
				for (int i = 1; i <= size; i++) {
					System.out.println("\rNo. " + i);
					manager.inputData();
				}
				break;

			case 2:
				System.out.print("\r Please,Enter Name: ");
				String searchName = scanner.next();
				manager.search(searchName);
				manager.printSearch();
				break;

			case 3:
				manager.sort();
				manager.printList();
				break;

			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("\rError! Please,selection again: \r");
				break;
			}
		} while (choice != 4);
	}

	public static void main(String[] args) {
		new Menu().runApp();
	}
}
