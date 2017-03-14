package view;

import java.util.Scanner;
import service.StaffManager;
import util.NumberUtil;

public class Menu {

	void printMenu() {
		System.out.println("Enter staffs’ information [1] ");
		System.out.println("Search officers and professors[2]");
		System.out.println("Display list of officers and professors [3] ");
		System.out.println("Save file & Exit [4]");

		System.out.print("\rPlease, Select 1,2,3,4: ");
	}
	
	private void runApp() {
		// 1 - create bee
		StaffManager manager = new StaffManager();
		//manager.readFromFile(); // read file
		String choiceString = null;
		int choice = 0;
		System.out.println("Welcome to human resource management program!");
		Scanner scanner = new Scanner(System.in);
		
		// Check choice
		do {
			boolean flag = false;
			do{
			printMenu();
			choiceString = scanner.next();
			flag = NumberUtil.checkInteger(choiceString);
			} while (!flag);
			choice = Integer.parseInt(choiceString);
			
			switch (choice) {
			case 0:
		          manager.printList();
		          break;
			case 1:
				//Check enter
				manager.readFromFile();
				boolean flagEmployees = false;
				String sizeString = null;
				
				do{
					System.out.print("\rHow many employees do you want to enter?: ");
					 
					 sizeString = scanner.next();
					 
					 flagEmployees = NumberUtil.checkInteger(sizeString);
					 
				}while(!flagEmployees);
				 
				int size = Integer.parseInt(sizeString);
				
				for (int i = 1; i <= size; i++) {
					System.out.println("\rNo. " + i);
					manager.inputData();
				}
				break;

			case 2:
				System.out.print("\r Please,Enter Name: ");
				scanner.nextLine();// It consumes the \n character
				String searchName = scanner.nextLine();
				manager.search(searchName);
				manager.printSearch();
				break;

			case 3:
				manager.sort();
				manager.printList();
				break;

			case 4:
				manager.saveToFile();
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
