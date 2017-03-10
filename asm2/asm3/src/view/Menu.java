package view;

import java.util.ArrayList;
import java.util.Scanner;

import domain.Employee;
import service.StaffManager;

public class Menu {
	
	void printMenu() {
		System.out.println("1- Input data. ");
		System.out.println("2- Search by name. ");
		System.out.println("3- Sorting & print list. ");
		System.out.println("4- Exit.");

		System.out.print("Please, Select 1,2,3,4: ");
	}

	private void runApp() {
		// 1 - create bee
		StaffManager manager = new StaffManager();
		int choice = 0;
		
		do {
			printMenu();
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt(); 
			String searchName = scanner.next();
			switch (choice) {
			case 1:
				manager.inputData();
				break;
			
			case 2:
				manager.search(searchName);
				if (searchedList == null) {
					System.out.println("No employee found!");
				}

				manager.printList();
				break;
			case 3:
				ArrayList<Employee> sortedList = manager.sort();
				manager.printList();
				break;
			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("Error! Please,selection again: ");
				break;
			}
		} while (choice != 4);
	}

	public static void main(String[] args) {
		new Menu().runApp();
	}

}
